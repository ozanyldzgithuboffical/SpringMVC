//Author:Ozan YILDIZ
@EnableWebMVC
@Configuration
@ComponentScan(basePackages="your_base_package")
public class WebConfig implements WebMVCConfigurer{
    //Create view resolver bean
    @Bean
    public ViewResolver configure(){
        InternalViewResolver resolver=new InternalViewResolver();
        resolver.setPrefix("/WEB-INF/view")~
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
}
