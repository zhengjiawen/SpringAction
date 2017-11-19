package com.example.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by outi on 2017/11/19.
 */

@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
//@ComponentScan("com.example.model")
public class SoundSystemConfig {

}
