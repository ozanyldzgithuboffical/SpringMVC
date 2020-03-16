@Controller
@RequestMapping("/emplopee-business")
public class EmployeeController{

@Autowired
EmployeeEventManager eventManager;

  @RequestMapping(method=RequestMethod.GET)
  public String setupEmployeeForm(Model model){
    Employee emp = new Employee();
    model.addAttribute("employee",emp);

  return "addNewEmployee";
  }

  @RequestMapping(method=RequestMethod.POST)
  public String addNewEmployee(@ModelAttribute("employee") Employee emp,BindingResult){
    employeeEventManager.save(emp);
    return "redirect:success";
    }

  @RequestMapping(value="/success",method=RequestMethod.GET)
  public String success(){
    return "showSuccessForm";
  }

}
 
