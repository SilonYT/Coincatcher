import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    /**
     * move creates the variable for the movement of the Player,
     * time creates the variable for the duration of the Powerup
     */
    private int move = 2;
    private int time = 0;
    
    /**
     * Sets image of the Player with the size of 40, 40
     */
    public Player()
    {
        setImage("Player.png");
        getImage().scale(40,40);
    }
    
    /**
     * method movement() defines the movement of the Player
     * method checkforpath() checks if the Player is still on the path, 
     * method checkforcollision() checks if the Player touches a Coin, 
     * method Poweruptimer() defines the duration of the Powerup
     */
    public void act()
    {
        movement();
        checkforpath();
        checkforcollision();
        Poweruptimer();
    }
    
    /**
     * Movement for the keys W, A, S, D with the variable move
     */
    private void movement()
    {
        if (Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY()- move);  //Move 2 up
        }
        if (Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()- move, getY());  //Move 2 left
        }
        if (Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY()+ move);  //Move 2 down
        }
        if (Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+ move, getY());  //Move 2 right
        }
    }
    
    /**
     * If the Player touches any Coin, remove Coin and increase the variable of MyWorld catchedCoins by 10,
     * if the Player touches the Powerup, remove Powerup and set the variable time to 140 and change the variable move to 4
     */
    public void checkforcollision()
    {
        if(this.isTouching(Coin.class)) //Checks if Player touches Coin
        {
            Actor Player = getOneIntersectingObject(Counter.class);
            this.removeTouching(Coin.class);    //Removes touched Coin
            MyWorld.catchedCoins = MyWorld.catchedCoins + 10;   //Access to World MyWorldt and counts up the variable catchedCoins by 10
        }
        if(this.isTouching(Powerup.class)) //Checks if Player touches Coin
        {
            Actor Player = getOneIntersectingObject(Powerup.class);
            this.removeTouching(Powerup.class);    //Removes touched Coin
            time = 140;
            move = 4;
        }
    }
    
    /**
     * Counts down the variable time, if time equals 0, change variable move back to 2
     */
    private void Poweruptimer()
    {
        time--;
        if (time == 0)
        {
            move = 2;
        }
    }
    
    /**
     * If variable Path equals false correct the movement so the Player doesn't leave the path
     */
    private void checkforpath()
    {
        if (!Path(upColor()))
        {
            setLocation(getX(), getY()- move);  //Move 2 down
        }
        if (!Path(leftColor()))
        {
            setLocation(getX()+ move, getY());  //Move 2 right
        }
        if (!Path(downColor()))
        {
            setLocation(getX(), getY()+ move);  //Move 2 up
        }
        if (!Path(rightColor()))
        {
            setLocation(getX()- move, getY());  //Move 2 left
        }
    }
    
    /**
     * Return true if the given colour is recognized as the path to follow
     */
    private boolean Path (Color col) //Return true if given color is recognized as path to follow
    {
        return col.getRed() > 100;   //Color of the path has at least that much red in it
    }
    
    /**
     * Get the colors from the trackerpoints up, left, down and right
     */
    private Color upColor() //Return the color from the up trackpoint
    {
        return getWorld().getBackground().getColorAt (getX(), getY()+20);
    }
    private Color leftColor() //Return the color from the left trackpoint
    {
        return getWorld().getBackground().getColorAt (getX()-20, getY());
    }
    private Color downColor() //Return the color from the down trackpoint
    {
        return getWorld().getBackground().getColorAt (getX(), getY()-20);
    }
    private Color rightColor() //Return the color from the right trackpoint
    {
        return getWorld().getBackground().getColorAt (getX()+20, getY());
    }
}
