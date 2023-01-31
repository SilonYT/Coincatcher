import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    public Enemy()
    {
        setImage("Enemy.png");
        getImage().scale(40,40);
    }
    
    public void act()
    {
        checkforpath();
        checkforcollision();
    }
    
    public void checkforpath()
    {
        if (!isPath(leftEyeColor()))
        {
            turn(Greenfoot.getRandomNumber(15));
        }
        else if (!isPath(rightEyeColor()))
        {
            turn(-(Greenfoot.getRandomNumber(15)));
        }
        move(2);
    }
    
    public void checkforcollision()
    {
        if(this.isTouching(Player.class))   //Checks if Enemy touches Player
        {
            this.removeTouching(Player.class);    //Removes Player
            GameOverScreen GameOver = new GameOverScreen();
            getWorld().addObject(GameOver, 500, 275);
            Greenfoot.stop();
        }
    }
    
    private Color leftEyeColor() //Return the color under the left eye.
    {
        Point eyePos = leftEye();
        return getWorld().getBackground().getColorAt (eyePos.getX(), eyePos.getY());
    }

    private Color rightEyeColor() //Return the color under the right eye.
    {
        Point eyePos = rightEye();
        return getWorld().getBackground().getColorAt (eyePos.getX(), eyePos.getY());
    }
    
    private boolean isPath (Color col) //Return true if given colour is recognised as path to follow
    {
        return col.getRed() > 130;   //Path colour has at least this much red in it
    }
    
    //The location of the eyes, measured from the Enemy position and direction
    private int EYE_OFFSET = 20;
    private int EYE_ANGLE = 20;
    
    //Return the position of the left eye
    public Point leftEye()
    {
        return eyePosition(-EYE_ANGLE, EYE_OFFSET);
    }

    //Return the position of the right eye
    public Point rightEye()
    {
        return eyePosition(EYE_ANGLE, EYE_OFFSET);
    }

    /**
     *Return the position of an eye. The parameters define the eye's location fon the Enemy's body.
     * 
     * @param angle The angle of the vector to the eye from the current rotation.
     * @param distance The distance of the eye from our centre point.
     * @return The Point (in global coordinates) where the eye is.
     */
    public Point eyePosition(int angle, int distance)
    {
        double angleRad = Math.toRadians( getRotation() + angle);
        int x = (int) Math.round(getX() + Math.cos(angleRad) * distance);
        int y = (int) Math.round(getY() + Math.sin(angleRad) * distance);
        
        return new Point(x, y);
    }
}
