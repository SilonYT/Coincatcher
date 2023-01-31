import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates world for Level 1
 */
public class Level1Map extends World
{
    public Level1Map()
    {
        //Create world, size 1000x550, cell size 1x1 pixels.
        super(1000, 550, 1);
        setBackground("Level1Map.jpg");
        prepareLevel();
    }
    
    public void act()
    {
        checkGamestatus();
    }
    
    private void prepareLevel() //Adds the Actors to the Level
    {
        addObject(new Player(),120, 100);   //Creates Player
        addObject(new Enemy(),910, 260);    //Creates Enemy
        addObject(new Powerup(), 922, 100); //Creates Powerup
        addObject(new Counter(),80, 30);    //Creates Counter
        //Creates coins
        Coin coin = new Coin();
        addObject(coin,796,485);
        Coin coin2 = new Coin();
        addObject(coin2,869,463);
        Coin coin3 = new Coin();
        addObject(coin3,910,407);
        Coin coin4 = new Coin();
        addObject(coin4,915,334);
        Coin coin5 = new Coin();
        addObject(coin5,907,257);
        Coin coin6 = new Coin();
        addObject(coin6,819,271);
        Coin coin7 = new Coin();
        addObject(coin7,748,287);
        Coin coin8 = new Coin();
        addObject(coin8,694,343);
        Coin coin9 = new Coin();
        addObject(coin9,653,403);
        Coin coin10 = new Coin();
        addObject(coin10,645,459);
        Coin coin11 = new Coin();
        addObject(coin11,719,472);
        Coin coin12 = new Coin();
        addObject(coin12,553,448);
        Coin coin13 = new Coin();
        addObject(coin13,492,407);
        Coin coin14 = new Coin();
        addObject(coin14,478,331);
        Coin coin15 = new Coin();
        addObject(coin15,485,264);
        Coin coin16 = new Coin();
        addObject(coin16,485,181);
        Coin coin17 = new Coin();
        addObject(coin17,430,132);
        Coin coin18 = new Coin();
        addObject(coin18,368,122);
        Coin coin19 = new Coin();
        addObject(coin19,291,137);
        Coin coin20 = new Coin();
        addObject(coin20,221,131);
        Coin coin21 = new Coin();
        addObject(coin21,155,94);
        Coin coin22 = new Coin();
        addObject(coin22,98,124);
        Coin coin23 = new Coin();
        addObject(coin23,101,195);
        Coin coin24 = new Coin();
        addObject(coin24,152,242);
        Coin coin25 = new Coin();
        addObject(coin25,171,306);
        Coin coin26 = new Coin();
        addObject(coin26,161,367);
        Coin coin27 = new Coin();
        addObject(coin27,154,440);
        Coin coin28 = new Coin();
        addObject(coin28,214,478);
        Coin coin29 = new Coin();
        addObject(coin29,297,465);
        Coin coin30 = new Coin();
        addObject(coin30,359,430);
        Coin coin31 = new Coin();
        addObject(coin31,423,400);
        Coin coin32 = new Coin();
        addObject(coin32,908,189);
        Coin coin33 = new Coin();
        addObject(coin33,919,120);
        Coin coin34 = new Coin();
        addObject(coin34,903,48);
        Coin coin35 = new Coin();
        addObject(coin35,824,34);
        Coin coin36 = new Coin();
        addObject(coin36,746,49);
        Coin coin37 = new Coin();
        addObject(coin37,678,55);
        Coin coin38 = new Coin();
        addObject(coin38,602,67);
        Coin coin39 = new Coin();
        addObject(coin39,520,71);
        Coin coin40 = new Coin();
        addObject(coin40,448,82);
    }
    
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
