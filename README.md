# SpringMVC
This repository includes basis of Spring MVC

## Basic Dependencies
- Lets start with very first step i.e. update the project dependencies. It will add following four sub-modules in demo for following reasons:

- **spring-security-core:**  It contains core authentication and access-control classes and interfaces.
- **spring-security-web:**  It contains filters and related web-security infrastructure code. It also enable URL based security which we are going to use in this demo.
- **spring-security-config:** It contains the security namespace parsing code. You need it if you are using the Spring Security XML file for configuration.
- **spring security-taglibs :** It provides basic support for accessing security information and applying security constraints in JSPs.

## Configure DelegatingFilterProxy in web.xml
- Spring Security’s web infrastructure is based entirely on standard servlet filters. These filters are defined in web.xml file or they will be ignored by the servlet container.

- In Spring Security, the filter classes are also Spring beans defined in the application context and thus able to take advantage of Spring’s rich dependency-injection facilities and lifecycle interfaces. Spring’s **DelegatingFilterProxy** provides the link between **web.xml** and the **application context**.

-If you are not using any explicit filter definitions and wants spring to configure basic infrastructure for you, then use filter name as **springSecurityFilterChain**

## Intercept Urls
- To use expressions to secure individual URLs, you would first need to set the **use-expressions** attribute in the **<http>** element to true. Spring Security will then expect the access attributes of the **intercept-url** elements to contain Spring EL expressions. The expressions should evaluate to a boolean, defining whether access should be allowed or not.

## Security Configuration Terms
- **http** : Include configuration related url level security. This element is the parent for all web-related namespace functionality.
auto-config : Includes some basic services. It is shorthand for –
<http>
    <form-login />
    <http-basic />
    <logout />
</http>
- **use-expressions :** It is here to use expressions to secure individual URLs. These expressions can be e.g. hasRole([role]), hasAnyRole([role1,role2]), permitAll, denyAll etc.
- **intercept-url :** This will match the requested url pattern from request and will decide what action to take based on access value.
- **form-login:** This will come into picture when user will try to access any secured URL. A login page mapped to “login-page” attribute will be served for authentication check. It is spring security login-processing-url.
If not provided, spring will provide an inbuilt login page to user. It also contains attribute for default target if login success, or login failure due to invalid user/password match.

- **logout:** This will help to find the next view if logout is called in application.
