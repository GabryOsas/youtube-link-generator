package me.gabryosas.utils;

import me.gabryosas.utils.enums.Quality;
import me.gabryosas.utils.enums.SubLanguage;

public class YoutubeLink {
    private String url;
    public YoutubeLink(String value){
        this.url = "https://www.youtube.com/watch?v=" + value;
    }
    public YoutubeLink seconds(int seconds){
        url = url + "&t=" + seconds + "s";
        return this;
    }
    public YoutubeLink autoplay(){
        url = url + "&autoplay=1";
        return this;
    }
    public YoutubeLink loop(){
        url = url + "&loop=true";
        return this;
    }
    public YoutubeLink subtitle(){
        url = url + "&cc_load_policy=1";
        return this;
    }
    public YoutubeLink subtitleLang(SubLanguage lang){
        url = url + "&hl=" + lang.toString();
        return this;
    }
    public YoutubeLink quality(Quality quality){
        url = url + "&quality=" + quality.toString();
        return this;
    }
    public YoutubeLink volume(int perc){
        url = url + "&volume=" + perc;
        return this;
    }
    public String build(){
        return url;
    }
}
