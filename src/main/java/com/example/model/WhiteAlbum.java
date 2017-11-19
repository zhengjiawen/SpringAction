package com.example.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by outi on 2017/11/19.
 */
@Component
@Primary
public class WhiteAlbum implements CompactDisc {
    private String title="white album";
    private String artist="东三雪碧";
    @Override
    public void play() {
        System.out.println("Playing"+title+"by"+artist);
    }
}
