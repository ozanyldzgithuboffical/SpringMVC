# Spring MVC
- This repository includes basis of Spring MVC

## Method Level Security
- In the core of method level security is the configuration element **“<global-method-security/>“**. This needs to be defined inside your spring’s configuration file. This element is used to enable annotation-based security in your application (by setting the appropriate attributes on the element). You should only declare one <global-method-security/> element. e.g.

- **<global-method-security pre-post-annotations="enabled" />** lets you use **@PreAuthorize** and **@PostAuthorize** annotations on controller methods to provide the security.

- The **@PreAuthorize** can check for authorization before entering into method. The @PreAuthorize authorizes on the basis of role or the argument which is passed to the method.
The **@PostAuthorize** checks for authrorisation after method execution. The @PostAuthorize authorizes on the basis of logged in roles, return object by method and passed argument to the method. For the returned object spring security provides built-in keyword i.e. returnObject.

- **<global-method-security secured-annotations="enabled" />** lets you use **@Secured** annotation 

- These annotations take one string parameter which is either is role-name or expression, and which one to use depends on your configuration for <http> element’s use-expression value.
 
- If use-expression is set to true, then you should use expressions inside the annotation otherwise role name should be used directly.

Expression-based annotations are a good choice if you need to define simple rules that go beyond checking the role names against the user’s list of authorities. You can enable more than one type of annotation in the same application, but you should avoid mixing annotations types in the same interface or class to avoid confusion.
