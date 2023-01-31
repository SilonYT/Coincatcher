import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse Gegner repräsentiert den Gegner im Spiel.
 * 
 * @author (Adan Mohamed) 
 * @version (Version1.0)
 */
public class Gegner extends Actor
{
   private int speed =2;
   int length;
   GreenWorld myWorld;
    /**
     * Die innere Klasse Direction repräsentiert die Richtungen, in die der Gegner sich bewegen kann.
     */
    class Direction {
        public static final int UP= 270;
        public static final int DOWN= 90;
        public static final int LEFT= 180;
        public static final int RIGHT= 0;
    }
    
    /**
     * Konstruktor für die Klasse Gegner.
     * @param speed Geschwindigkeit des Gegners
     */
    public Gegner(int speed){
        length = getImage().getWidth();
    }
    
    /**
     * Methode, die aufgerufen wird, wenn der Gegner zur Welt hinzugefügt wird.
     * @param w Referenz auf die Welt, zu der der Gegner hinzugefügt wird
     */
    public void addedToWorld(World w){
        myWorld = (GreenWorld)w;
    }
    
    /**
     * Methode, die den Spieler sucht, um zu überprüfen, ob eine Überlappung mit dem Spieler stattgefunden hat.
     */
    public void Gegnerfinden(){
        Actor t = getOneIntersectingObject(Spieler.class);
        if(t!=null){
            myWorld.removeObject(t);
            World world = getWorld();
            world.addObject(new GameOverScreen(), world.getWidth() / 2, world.getHeight() / 2);
            Greenfoot.stop();
        }
    }
    
    /**
     * Act-Methode, die ausgeführt wird, wenn der "Act"- oder "Run"-Button in der Umgebung gedrückt wird.
     */
    public void act()
    {
        // Bewegungen des Gegners
        moveSpieler();
        Gegnerfinden();
    }
    
    /**
     * Methode, die die Bewegungen des Gegners steuert.
     */
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
        if (wand == null) {
            setLocation(currentX + changeX, currentY + changeY);
        } else
        {
        setRotation(getRotation() + 180);
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
    //Wand Begegnung Abstand 
    private int adjustOffset(int offset)
    {
        int signOfOffset = (int)Math.signum(offset);
        int distanceToFront = length/2;
        int adjustAmount = distanceToFront* signOfOffset;
        return offset + adjustAmount;
    }
}
