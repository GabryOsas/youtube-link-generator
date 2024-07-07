package me.gabryosas.utils;

public class TimeUtils {
    public static int toMinutes(final int minutes, final int seconds){
        return (minutes * 60) + seconds;
    }
    public static int toMinutes(final int minutes){
        return (minutes * 60);
    }
}
