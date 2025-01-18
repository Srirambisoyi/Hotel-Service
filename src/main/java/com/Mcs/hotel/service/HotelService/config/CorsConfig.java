package com.Mcs.hotel.service.HotelService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Allow requests to "/api" path
                .allowedOrigins("http://localhost:3000") // Allow the frontend's origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow specific methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow credentials (cookies, etc.)
    }
}
