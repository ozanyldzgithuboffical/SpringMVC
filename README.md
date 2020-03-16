# SpringMVC
This repository includes basis of Spring MVC
## View Resolver
- View Resolver is used to resolve view names to a real views in Spring MVC.
- You can create a resolver as a bean.
- Resource bundle view resolver is used to resolve view names from properties file named as a basename
- You can also create view resolver chaining by crating more than one resolver.To provide the chain,we need to define view resolver bean order via setOrder(orderNumber:Integer).
