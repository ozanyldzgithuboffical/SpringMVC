# SpringMVC
This repository includes basis of Spring MVC

## MessageSourceAware
- If you want to access i18n resources bundles for different locales into your java source code, then that java class must implement MessageSourceAware interface. After implementing MessageSourceAware interface, spring context will automatically inject the MessageSource reference into the class via setMessageSource(MessageSource messageSource) setter method which your class need to implement.
