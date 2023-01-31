import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Punkte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punkte extends Actor
{
    GreenWorld myWorld;
    int width;
    int height = 60;
    int score = 0;
    GreenfootImage punktImage;
    public void addedToWorld(World w)
    {
        myWorld = (GreenWorld)w;  
        width = myWorld.getWidth();
        punktImage = new GreenfootImage(width, height);
        punktImage.setColor(Color.BLACK);
        punktImage.fillRect(0,0,width,height);
        setImage(punktImage);
    }
    public void addScore(int amount)
    {
         score += amount;   
    }
    // Punkte Karten Erstellen mit Game Over
    public void drawScore()
    {
        punktImage.setColor(Color.BLACK);
        punktImage.fillRect(0,0,width,height);
        if (score >= 350) {
            Greenfoot.stop();
            myWorld.addObject(new GameOverScreen(), width/2, height/2);
        } else {
            punktImage.setColor(Color.RED);
            punktImage.setFont(new Font("Arial", 24));
            punktImage.drawString("score: " + score, 20,40);
        }
    }
    
   
    /**
     * Act - do whatever the Punkte wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        drawScore(); 
    }
    public class GameOverScreen extends Actor
{
    public GameOverScreen()
    {
        setImage(new GreenfootImage("Herzlicher Glückwunsch!", 48, Color.WHITE, Color.BLACK));
    }
}
}
