import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends Actor
{
    /**
     * Act - do whatever the level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Level1Wechsel
        if(Greenfoot.mouseClicked(this))
        Greenfoot.setWorld(new GreenWorld());
    }
}
