import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1Button extends Actor
{
    /**
     * Sets the image for the level 1 box at the beginning of the game
     */
    public Level1Button()
    {
        setImage("Level1Button.png");
    }
    
    /**
     * If button gets clicked, switch to Level 1 Map
     */
    public void act()
    {
        //Switch to Level 1 if Level1Button is clicked
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1Map());
        }
    }
}
