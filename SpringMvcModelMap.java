@Controller
@RequestMapping("/employee-business")
public class EmployeeBusinessService{
@Autowired
private EmployeeBusinessManager employeeManager;
@GetMapping("/employee-list")
public String EmployeeList(ModelMap model){
model.addAttribute("employees",employeeManager.getEmployees());
return "employee-list";
}
}
