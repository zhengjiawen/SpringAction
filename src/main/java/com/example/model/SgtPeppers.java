package com.example.model;

import org.springframework.stereotype.Component;

/**
 * Created by outi on 2017/11/19.
 */
@Component("CD001")
public class SgtPeppers implements CompactDisc {

    private String title = "SgtPeppers fdafdacasdccd";
    private String artist = "the Beatles";

    @Override
    public void play() {
        System.out.println("Playing"+title+"by"+artist);
    }
}
