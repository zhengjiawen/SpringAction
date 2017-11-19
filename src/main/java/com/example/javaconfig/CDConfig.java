package com.example.javaconfig;

import com.example.model.CompactDisc;
import com.example.model.SgtPeppers;
import com.example.model.WhiteAlbum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by outi on 2017/11/19.
 */
@Configuration
public class CDConfig {

    @Bean("sgt")
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

    @Bean
    @Primary
    public CompactDisc whiteAlbum(){
        return new WhiteAlbum();
    }
}
