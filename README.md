# SpringMVC
This repository includes basis of Spring MVC

## Response Entity
- ResponseEntity represents the whole HTTP response: **status code, headers, and body**. Because of it, we can use it to fully configure the HTTP response.

- If we want to use it, we have to return it from the endpoint; Spring takes care of the rest.

- **ResponseEntity** is a generic type. As a result, we can use any type as the response body
