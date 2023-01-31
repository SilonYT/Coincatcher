import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    /**
     * Method showScore() to show the actual score of catched coins
     */
    public void act()
    {
        showScore();
    }
    
    /**
     * Creates the text field score with the current number of catched coins
     */
    public void showScore()     //Creates scoreboard with text size 40 and color black
    {
        setImage(new GreenfootImage("Score: " + MyWorld.catchedCoins, 30, Color.BLACK, new Color(0,0,0,0)));
    }
}
