@Controller
public class EmployeeController {
 
    @Autowired
    private EmployeeManager employeeManager;
 
    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }
 
    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "denied";
    }
 
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "logout";
    }
 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(ModelMap map) {
        return "redirect:/list";
    }
 
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listEmployees(ModelMap map) {
        Employee emp = new Employee();
        map.addAttribute("employee", emp);
        map.addAttribute("employeeList", employeeManager.getAllEmployees());
 
        return "editEmployeeList";
    }
 
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(
            @ModelAttribute(value = "employee") EmployeeEntity employee,
            BindingResult result) {
        employeeManager.addEmployee(employee);
        return "redirect:/list";
    }
 
    @RequestMapping("/delete/{employeeId}")
    public String deleteEmplyee(@PathVariable("employeeId") Integer employeeId) {
        employeeManager.deleteEmployee(employeeId);
        return "redirect:/list";
    }
}
