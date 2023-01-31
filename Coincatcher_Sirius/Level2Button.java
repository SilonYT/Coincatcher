import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2Button extends Actor
{
    /**
     * Sets the image for the level 2 box at the beginning of the game
     */
    public Level2Button()
    {
        setImage("Level2Button.png");
    }
    
    /**
     * If button gets clicked, switch to Level 2 Map
     */
    public void act()
    {
        //Switch to Level 2 if Level2Button is clicked
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level2Map());
        }
    }
}
