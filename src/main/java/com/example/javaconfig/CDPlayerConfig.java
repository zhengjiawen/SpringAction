package com.example.javaconfig;

import com.example.model.CDPlayer;
import com.example.model.CompactDisc;
import com.example.model.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by outi on 2017/11/19.
 */
@Configuration
//@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {


    @Bean
   // @Conditional(CDCondition.class)
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
