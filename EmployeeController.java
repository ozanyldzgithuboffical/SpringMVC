//Author: Ozan YILDIZ 

@Controller
@RequestMapping("/employee-business")
public class EmployeeController{
@GetMapping("/age")
public ResponseEntity<String> age(
  @RequestParam("yearOfBirth") int yearOfBirth) {
  
    //to do
    //if something wrong {
      return new ResponseEntity<>(
          "your_error_message", 
          HttpStatus.BAD_REQUEST);
    }
 
    return new ResponseEntity<>(
      "your success message", 
      HttpStatus.OK);
}
}
