@Controller
public class EmployeeController{
@Autowired
EmployeeDAOManager manager;
//<BASE_URL>/employee-list/
@RequestMapping("/employee-list")
public String getAllEmployees(Model model){

  List<Employee> employeeList=manager.getAllEmployees();
  model.addAttribute("employees",employeeList);
  return "employeelist";

}
}
