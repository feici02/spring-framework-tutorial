package com.clearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.clearn"})
@PropertySource({"cosmicapplication.properties"})
public class AppConfig
{
    // @Bean
    // public static PropertySourcesPlaceholderConfigurer
    // getPropertySourcesPlaceholderConfigurer()
    // {
    //     return new PropertySourcesPlaceholderConfigurer();
    // }
}