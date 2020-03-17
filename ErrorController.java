//Author: Ozan YILDIZ
@Controller
public class ErrorController{

@RequestMapping(value = "errors", method = RequestMethod.GET)
    public ModelAndView ViewErrorPage(HttpServletRequest httpRequest) {
        Integer statusCode=httpRequest.getAttribute("javax.servlet.error.status_code");
        Model errorPage = new Model();
        String errorMsg = "";
 
        switch (statusCode) {
            case 400: {
                errorMsg = "Http Error Code: 400. Bad Request";
                break;
            }
            case 401: {
                errorMsg = "Http Error Code: 401. Unauthorized";
                break;
            }
            case 404: {
                errorMsg = "Http Error Code: 404. Resource not found";
                break;
            }
            case 500: {
                errorMsg = "Http Error Code: 500. Internal Server Error";
                break;
            }
        }
        errorPage.addAttribute("errorMsg", errorMsg);
        return "errorPage";
    }
    
    }
