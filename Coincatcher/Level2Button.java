import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2Button extends Actor
{
    public Level2Button()
    {
        setImage("Level2Button.png");
    }
    
    public void act()
    {
        //Switch to Level 2 if Level2Button is clicked
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level2Map());
        }
    }
}
