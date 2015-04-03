package com.springapp.mvc.config;

import com.springapp.mvc.aspects.Audition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Vasiliy on 03.04.2015.
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public Audition auditionAspect(){
        return new Audition();
    }

}
