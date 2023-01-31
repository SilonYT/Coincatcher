import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1Button extends Actor
{
    public Level1Button()
    {
        setImage("Level1Button.png");
    }
    
    public void act()
    {
        //Switch to Level 1 if Level1Button is clicked
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1Map());
        }
    }
}
