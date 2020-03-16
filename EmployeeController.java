import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
 
@Controller
public class EmployeeController implements MessageSourceAware
{
    @Autowired
    private MessageSource messageSource;
  
    //Setter injection with autowired in Spring
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
 
    public String readLocaleSpecificMessage()
    {
         String applicationName = messageSource.getMessage("application_name", null, Locale.TR);
  
         return applicationName;
    }
}
