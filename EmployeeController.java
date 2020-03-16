// Author: Ozan YILDIZ
@Controller
@RequestMapping("/emplopee-business")
public class EmployeeController{
private boolean isErrorOccuured=false;

@Autowired
EmployeeEventManager eventManager;
  
  @RequestMapping(method=RequestMethod.GET)
  public String setupEmployeeForm(Model model){
    Employee emp = new Employee();
    model.addAttribute("employee",emp);

  return "addNewEmployee";
  }

  @RequestMapping(method=RequestMethod.POST)
  public String addNewEmployee(@ModelAttribute("employee") Employee emp,BindingResult result){
    if(emp.getFirstName().isEmpty()){
       result.rejectValue("firstName","error.FirstName");
       this.isErrorOccuured = true;
    }
    
    if(emp.getFirstName().isEmpty()){
       result.rejectValue("firstName","error.FirstName");
       this.isErrorOccuured = true;
    }
    
    if(emp.getFirstName().isEmpty()){
       result.rejectValue("firstName","error.FirstName");
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
 
