
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
 
import com.ozanyldz.models.Employee;
 
@Component
public class EmployeeValidator implements Validator 
{
    /*It says if a specific class is supported by the validator. When validating an object, the object itself is not passed to supports(). 
    What is passed to supports() is the class of the object.So, before validating an instance of Employee, Spring calls supports() 
    with Employee.class as argument.*/
    public boolean supports(Class clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }
    
    //implements specific validation logics
    /*public static void rejectIfEmpty(Errors errors,
                                 String field,
                                 String errorCode)*/
    public void validate(Object target, Errors errors) 
    {
        ValidationUtils.rejectIfEmpty(errors, "firstName", "error.firstName", "First name is required.");
        ValidationUtils.rejectIfEmpty(errors, "lastName", "error.lastName", "Last name is required.");
        ValidationUtils.rejectIfEmpty(errors, "email", "error.email", "Email is required.");
    }
 
}
