import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    public void act()
    {
        showScore();
    }
    
    public void showScore()     //Creates scoreboard with text size 40 and color black
    {
        setImage(new GreenfootImage("Score: " + MyWorld.catchedCoins, 30, Color.BLACK, new Color(0,0,0,0)));
    }
}
