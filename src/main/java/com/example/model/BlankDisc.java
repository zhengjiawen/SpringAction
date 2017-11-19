package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by outi on 2017/11/19.
 */
@Component
public class BlankDisc implements CompactDisc {

    private  String title;
    private  String artist;

    public BlankDisc(@Value("${disc.title}")  String title, @Value(("${disc.artist}"))String artist){
        this.artist=artist;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void play() {
        System.out.println("Playing"+title+"by"+artist);
    }
}
