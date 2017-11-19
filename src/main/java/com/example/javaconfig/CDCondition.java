package com.example.javaconfig;

import com.example.model.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;

import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by outi on 2017/11/19.
 */
public class CDCondition implements Condition {
    @Override
    public boolean matches(ConditionContext ctxt, AnnotatedTypeMetadata metadata) {
        Object obj=ctxt.getBeanFactory().getBean("compactDisc");
     /*
        if(obj==null){
            return false;
        }*/
        return true;
    }
}
