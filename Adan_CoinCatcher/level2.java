import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends Actor
{
    /**
     * Act - do whatever the level2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Wechsel Level2
        if(Greenfoot.mouseClicked(this))
        Greenfoot.setWorld(new BlueWorld());
    }
}
