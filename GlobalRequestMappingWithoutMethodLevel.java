@Controller
@RequestMapping("/employee-business")
public class EmployeeController{
@Autowired
EmployeeDAOManager manager;
//<BASE_URL> - it will be accessed via same url
@RequestMapping(method=RequestMethod.GET)
public String getAllEmployees(){
  Model model= new Model();
  List<Employee> employeeList=manager.getAllEmployees();
  model.addAttribute("employees",employeeList);
  return "employeelist";

}
}
