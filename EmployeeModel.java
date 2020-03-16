
import java.io.Serializable;
 
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
 
public class EmployeeModel implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Integer id;
     
    @Size(min = 3, max = 25)
    private String firstName;
     
    @Size(min = 3, max = 25)
    private String lastName;
    
    @Transient 
    @Pattern(regexp=".+@.+\\.[a-z]+")
    private String email;
 
    //Setters and Getters
 
    @Override
    public String toString() {
        return "First Name:" + this.firstName + " Last Name:"+this.lastName;
    }
}
