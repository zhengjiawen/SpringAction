package com.example.model;

import com.example.javaconfig.ExpressiveConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by outi on 2017/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class BlankDiscTest {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void testPlay(){
        blankDisc.play();
    }

}