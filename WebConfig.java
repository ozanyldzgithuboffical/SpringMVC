
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**") 
                .addResourceLocations("/js/") 
                .resourceChain(false)
                .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS)
                .addTransformer(new CssLinkResourceTransformer());
    }
}
