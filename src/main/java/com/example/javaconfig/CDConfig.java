package com.example.javaconfig;

import com.example.model.CompactDisc;
import com.example.model.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by outi on 2017/11/19.
 */
@Configuration("com.example.model")
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
