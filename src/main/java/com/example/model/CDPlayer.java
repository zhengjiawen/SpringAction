package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by outi on 2017/11/19.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired(required = false)
    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
