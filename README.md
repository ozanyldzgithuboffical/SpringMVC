# SpringMVC
This repository includes basis of Spring MVC

## JSR 303 Validation and Annotations
- Spring Validation supports JSR 303 Validation. Using this would allow us to annotate beans with generic javax.validation annotations.
- In bean to annotate with validation we need such an configuration:
 ```java
  <bean class="org.springframework.validation.beanvalidation.MethodValidationPostProcessor"/>
  ```
 - In order to be eligible for Spring-driven method validation, all target classes need to be annotated with Spring’s @Validated annotation, optionally declaring the validation groups to use. Check out the MethodValidationPostProcessor javadocs for setup details with Hibernate Validator and Bean Validation 1.1 providers.
