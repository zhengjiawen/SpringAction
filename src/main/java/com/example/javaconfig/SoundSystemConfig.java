package com.example.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by outi on 2017/11/19.
 */

@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
public class SoundSystemConfig {

}
