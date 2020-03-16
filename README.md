# SpringMVC
This repository includes basis of Spring MVC

## Custom Validator
- You can create your custom validator using the Validator interface.
- In **Validator** interface there is a overriden method called **supports** in which it usess Erros class to send erros.
- In support class you do not send object itself , you send its class.
- validate method does validation logic.You can use rejectIfEmpty or rejectIfEmptyOrWhitespaces methods that take fieldname,error and error code as a parameter.
- Right after, in controller you can use custom validator bean autowired.Binding result populating the errors checking after custom validation.
