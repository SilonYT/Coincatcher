import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spieler here.
 * 
 * @author (Adan Mohamed) 
 * @version (Vertion1.0)
 */
public class Spieler extends Actor
{
   int speed =2;
   int length;
   GreenWorld myWorld;
    class Direction {
        public static final int UP= 270;
        public static final int DOWN= 90;
        public static final int LEFT= 180;
        public static final int RIGHT= 0;
    }
    
    public Spieler(){
        length = getImage().getWidth();
    }
    
    public void addedToWorld(World w){
        myWorld = (GreenWorld)w;
    }
    
    public void eatcoin(){
        Actor t = getOneIntersectingObject(coin.class);
        if(t!=null){
            myWorld.removeObject(t);
            myWorld.addScore(5);
        }
    }
    
    /**
     * Act - do whatever the Spieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {       
        // Spieler Bewegungen
    if(Greenfoot.isKeyDown("up")){
        setRotation(Direction.UP);
        moveSpieler();
    } else if (Greenfoot.isKeyDown("down")){
        setRotation(Direction.DOWN);
        moveSpieler();
    } else if (Greenfoot.isKeyDown("left")){
        setRotation(Direction.LEFT);
        moveSpieler();
    } else if (Greenfoot.isKeyDown("right")){  
        setRotation(Direction.RIGHT);
        moveSpieler();
}
eatcoin();

}
    public void moveSpieler()
    {
      int currentX = getX();
      int currentY = getY();
      int direction = getRotation();
      int changeX = getChangeX(direction);
      int changeY = getChangeY(direction);
      int adjustedChangeX = adjustOffset(changeX);
      int adjustedChangeY = adjustOffset(changeY);
      Actor wand = getOneObjectAtOffset(adjustedChangeX, adjustedChangeY, wand.class);
      if(wand==null)
      {
          setLocation(currentX + changeX, currentY + changeY);
      }
    }
    
    private int getChangeX(int direction)
    {
      if(direction == Direction.RIGHT)
      {
          return speed;
      }
      if(direction == Direction.LEFT)
      {
          return -speed;
      }
          return 0;
    }
    private int getChangeY(int direction)
    {
      if(direction == Direction.DOWN)
      {
          return speed;
      }
      if(direction == Direction.UP)
      {
          return -speed;
      }
          return 0;
    }
/**
 * //Wand Begegnung Abstand
 */  
    private int adjustOffset(int offset)
    {
        int signOfOffset = (int)Math.signum(offset);
        int distanceToFront = length/2;
        int adjustAmount = distanceToFront* signOfOffset;
        return offset + adjustAmount;
    }
}
