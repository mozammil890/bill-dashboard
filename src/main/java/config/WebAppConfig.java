package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer(){

       return new WebMvcConfigurer() {
           @Override
           public void addCorsMappings(CorsRegistry corsRegistry){
               corsRegistry.addMapping("/**").allowedOrigins("http://localhost:3000","https://mozammil890.github.io").
                       allowedMethods("PUT","POST","DELETE","GET","OTHERS").allowedHeaders("*");
           }
       };

    }

}
