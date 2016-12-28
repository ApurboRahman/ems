package com.ems.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Apurbo on 8/19/2016.
 */
/*

TODO:// This Class no need now because InternalResourceViewResolver is configured in mvc-dispatcher-servlet.xml
@Configuration
@EnableWebMvc*/
public class AppConfigController extends WebMvcConfigurerAdapter{
    @Bean
    public InternalResourceViewResolver resourceViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
   @Override

    public void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer){
       configurer.enable();
    }
}
