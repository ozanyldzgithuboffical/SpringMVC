# SpringMVC
This repository includes basis of Spring MVC

## Interceptors (Middlewares)
- Interceptors, as we know, are special web programming constructs which gets invoked every time when a certain pre-configured web request is made. They are always the most important and basic functional segments designed very early in product life cycle, due to their importance.

- Interceptors are generally used do some processing before handing it over to the controller handler methods.

## Spring mvc interceptor by implementing HandlerInterceptor
HandlerInterceptor interface defined 3 methods.

- **preHandle(request, response, handler)** – Used to intercept the request before handed over to the handler method. Here handler is the chosen handler object to handle the request.
- **postHandle(request, response, handler, modelAndView)** – Used to intercept the request after handler has completed request processing but DispatcherServlet is yet to render the view.
-- **afterCompletion(request, response, handler, exception)**
– It is called once the handler execution is complete and view is rendered as well.
