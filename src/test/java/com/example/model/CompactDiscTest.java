package com.example.model;

import com.example.javaconfig.CDPlayerConfig;
import com.example.javaconfig.SoundSystemConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by outi on 2017/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SoundSystemConfig.class)
public class CompactDiscTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    @Qualifier("sgt")
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);

        cd.play();
    }

    @Test
    public void play(){
        assertNotNull(player);
        player.play();
    }

}