@Controller
@RequestMapping("/employee-business")
public class EmployeeBusinessService{
@Autowired
private EmployeeBusinessManager employeeManager;
@GetMapping("/employee-list")
public String EmployeeList(){
//You give related view name here
ModelAndView model=new ModelAndView("your-view-page");
model.addObject("employees",employeeManager.getEmployees());
return model;
}
}
