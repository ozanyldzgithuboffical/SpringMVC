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
        //First running
        resolver.setOrder(1);
        return resolver;
    }
    //Create view resolver bean
    @Bean
    public ViewResolver configure2(){
        ResourceBundleViewResolver resolver=new ResourceBundleViewResolver();
        resolver.setBaseName("views");
        //Later running
        resolver.setOrder(0);
        return resolver;
    }
    
}
