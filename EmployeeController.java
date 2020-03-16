// Author: Ozan YILDIZ
@Controller
@RequestMapping("/emplopee-business")
public class EmployeeController{
private boolean isErrorOccuured=false;

@Autowired
private EmployeeEventManager eventManager;

@Autowired
private EmployeeValidator validator;
  
  @RequestMapping(method=RequestMethod.GET)
  public String setupEmployeeForm(Model model){
    Employee emp = new Employee();
    model.addAttribute("employee",emp);

  return "addNewEmployee";
  }

  @RequestMapping(method=RequestMethod.POST)
  public String addNewEmployee(@ModelAttribute("employee") Employee emp,BindingResult result){
    validator.validate(emp,result);
    if(result.hasErrors()){
       this.isErrorOccuured = true;
       }
    
    if(this.isErrorOccuured === true){
       return "addEmployee";
      }
    
    employeeEventManager.save(emp);
    return "redirect:success";
    }

  @RequestMapping(value="/success",method=RequestMethod.GET)
  public String success(){
    return "showSuccessForm";
  }

}
