package me.gabryosas;

import me.gabryosas.utils.TimeUtils;
import me.gabryosas.utils.YoutubeLink;
import me.gabryosas.utils.enums.Quality;
import me.gabryosas.utils.enums.SubLanguage;

public class Main {
    //An example, I haven't tested it
    public static void main(String[] args) {
        final int seconds = TimeUtils.toMinutes(37, 4);
        System.out.print( new YoutubeLink("xk4_1vDrzzo")
                .quality(Quality.SMALL)
                .loop().subtitle()
                .subtitleLang(SubLanguage.IT)
                .volume(50)
                .seconds(seconds)
                .build());
    }
}