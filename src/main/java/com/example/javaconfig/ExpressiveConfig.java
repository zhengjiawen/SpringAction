package com.example.javaconfig;

import com.example.model.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by outi on 2017/11/19.
 */
@Configuration
@ComponentScan(basePackageClasses = {BlankDisc.class})
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

/*    @Bean
    public BlankDisc disc(){
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist")
        );
    }*/

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
