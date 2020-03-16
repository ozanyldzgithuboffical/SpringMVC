@EnableWebMvc
@Configuration
public class ApplicationInterceptorConfiguration extends WebMvcConfigurerAdapter {
 
    @Bean
    ApplicationInterceptor applicationInterceptor() {
         return new ApplicationInterceptor();
    }
 
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(applicationInterceptor());
    }
 
}
