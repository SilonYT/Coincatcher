import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (Adan Mohamed) 
 * @version (Version1.0 // 31.01.2023)
 */
import greenfoot.*;

public class BlueWorld extends GreenWorld {
    String[] textMap = {
        "**********.***",
        ".*...........*",
        ".*.***.*******",
        ".*.*.......*.*",
        ".*.*.*.***.*.*",
        ".*.*. P .*.*.*",
        ".*.*.......*.*",
        ".*.*****.***.*",
        "........*.....",
        "*******.*******"
    };

    public BlueWorld() {
        GreenfootImage bgImage = new GreenfootImage(1,1);
        bgImage.setColor(Color.BLUE);
        bgImage.drawRect(0,0,1,1);
        setBackground(bgImage);
        pk = new Punkte();
        addObject(new Gegner(Gegnerspeed), 400, 150);
        addObject(pk, getWidth()/2,430);
    }
}

