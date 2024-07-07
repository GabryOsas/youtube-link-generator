package me.gabryosas.utils.enums;

public enum Quality {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large"),
    HD720("hd720"),
    HD1080("hd1080"),
    HIGHRES("highres");

    private String quality;
    private Quality(String quality){
        this.quality = quality;
    }
    public String toString(){
        return quality;
    }
}
