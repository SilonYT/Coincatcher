import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates world for Level 2
 */
public class Level2Map extends World
{
    /**
     * Creates the world for the level 2 with the size 1000x550, cell size 1x1 pixels, 
     * sets the background picture to Level2Map.jpg, 
     * prepares the Level with the method prepareLevel();
     */
    public Level2Map()
    {
        //Create world, size 1000x550, cell size 1x1 pixels.
        super(1000, 550, 1);
        setBackground("Level2Map.jpg");
        prepareLevel();
    }
    
    /**
     * Method checkGamestatus() to check if all coins are collected and the game has been won
     */
    public void act()
    {
        checkGamestatus();
    }
    
    /**
     * Creates the actors over the map
     */
    private void prepareLevel() //Adds the Actors to the Level
    {
        addObject(new Player(),572,258);    //Creates Player
        addObject(new Enemy(),169,103);     //Creates Enemy
        addObject(new Enemy(),800,70);      //Creates Enemy #2
        addObject (new Enemy(),458,400);    //Creates Enemy #3
        addObject(new Powerup(), 165, 99);  //Creates Powerup
        addObject(new Counter(),80, 30);    //Creates Counter
        //Creates coins
        Coin coin = new Coin();
        addObject(coin,121,70);
        Coin coin2 = new Coin();
        addObject(coin2,187,44);
        Coin coin3 = new Coin();
        addObject(coin3,266,47);
        Coin coin4 = new Coin();
        addObject(coin4,347,55);
        Coin coin5 = new Coin();
        addObject(coin5,428,69);
        Coin coin6 = new Coin();
        addObject(coin6,499,72);
        Coin coin7 = new Coin();
        addObject(coin7,572,75);
        Coin coin8 = new Coin();
        addObject(coin8,645,72);
        Coin coin9 = new Coin();
        addObject(coin9,736,65);
        Coin coin10 = new Coin();
        addObject(coin10,823,59);
        Coin coin11 = new Coin();
        addObject(coin11,900,64);
        Coin coin12 = new Coin();
        addObject(coin12,949,116);
        Coin coin13 = new Coin();
        addObject(coin13,937,188);
        Coin coin14 = new Coin();
        addObject(coin14,922,263);
        Coin coin15 = new Coin();
        addObject(coin15,907,334);
        Coin coin16 = new Coin();
        addObject(coin16,883,410);
        Coin coin17 = new Coin();
        addObject(coin17,828,453);
        Coin coin18 = new Coin();
        addObject(coin18,747,465);
        Coin coin19 = new Coin();
        addObject(coin19,663,452);
        Coin coin20 = new Coin();
        addObject(coin20,578,431);
        Coin coin21 = new Coin();
        addObject(coin21,504,402);
        Coin coin22 = new Coin();
        addObject(coin22,416,400);
        Coin coin23 = new Coin();
        addObject(coin23,337,420);
        Coin coin24 = new Coin();
        addObject(coin24,253,443);
        Coin coin25 = new Coin();
        addObject(coin25,182,436);
        Coin coin26 = new Coin();
        addObject(coin26,131,391);
        Coin coin27 = new Coin();
        addObject(coin27,151,327);
        Coin coin28 = new Coin();
        addObject(coin28,174,258);
        Coin coin29 = new Coin();
        addObject(coin29,136,203);
        Coin coin30 = new Coin();
        addObject(coin30,107,134);
        Coin coin31 = new Coin();
        addObject(coin31,171,151);
        Coin coin32 = new Coin();
        addObject(coin32,223,108);
        Coin coin33 = new Coin();
        addObject(coin33,290,133);
        Coin coin34 = new Coin();
        addObject(coin34,341,184);
        Coin coin35 = new Coin();
        addObject(coin35,405,200);
        Coin coin36 = new Coin();
        addObject(coin36,484,196);
        Coin coin37 = new Coin();
        addObject(coin37,567,183);
        Coin coin38 = new Coin();
        addObject(coin38,641,160);
        Coin coin39 = new Coin();
        addObject(coin39,711,134);
        Coin coin40 = new Coin();
        addObject(coin40,569,256);
        Coin coin41 = new Coin();
        addObject(coin41,546,334);
        Coin coin42 = new Coin();
        addObject(coin42,644,261);
        Coin coin43 = new Coin();
        addObject(coin43,733,282);
        Coin coin44 = new Coin();
        addObject(coin44,803,294);
        Coin coin45 = new Coin();
        addObject(coin45,869,292);
    }
    
    /**
     * Checks if any coin is over the map, if not show victory screen and stop the game
     */
    public void checkGamestatus()
    {
        if(getObjects(Coin.class).isEmpty())    //If no coin is on the map the Win-Screen appears
        {
            VictoryScreen Victory = new VictoryScreen();
            addObject(Victory, 500, 275);
            Greenfoot.stop();
        }
    }
}
