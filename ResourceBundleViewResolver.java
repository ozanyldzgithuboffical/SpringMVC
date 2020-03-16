@EnableWebMVC
@Configuration
@ComponentScan(basePackages="your_base_package")
public class WebConfig implements WebMVCConfigurer{
    //Create view resolver bean
    @Bean
    public ViewResolver configure(){
        ResourceBundleViewResolver resolver=new ResourceBundleViewResolver();
        //views.properties in classpath
        resolver.setBaseName("views");
        return resolver;
    }
    
}
