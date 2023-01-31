import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @program name (Coincatcher)
 * @author (Sirius Schürmann) 
 * @version (V.1.0)
 */
public class MyWorld extends World
{
    public static int catchedCoins = 0;     //Variable for the Counternumber
    public MyWorld()
    {
        //Create world, size 1000x550, cell size 1x1 pixels.
        super(1000, 550, 1);
        setBackground("StartBackground.png");
        addObject(new Level1Button(),350,400);  //Creates Level 1 Button
        addObject(new Level2Button(),650,400);  //Creates Level 2 Button
        addObject(new ChooseyourLevelScreen(),500, 250);  //Creates Choose Your Level Textscreen
        catchedCoins = 0;       //Sets value of catchedCoins back to 0 at the beginning of the Game
    }
}
