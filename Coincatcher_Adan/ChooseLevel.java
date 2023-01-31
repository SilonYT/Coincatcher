import greenfoot.*;

/**
 * Klasse "ChooseLevel" verwaltet die Anzeige des Levels und den Übergang zum jeweiligen Level
 */
public class ChooseLevel extends World {
    private GreenfootImage level1 = new GreenfootImage("level1.png");
    private GreenfootImage level3 = new GreenfootImage("level1.png");
    private GreenfootImage level2 = new GreenfootImage("level2.png");
    private GreenfootImage Title = new GreenfootImage("title.png");
    private int level;

    /**
     * Konstruktor der Klasse ChooseLevel
     * Initialisiert die Welt mit einem Hintergrund, Level1- und Level2-Objekten sowie einem Titel
     */
    public ChooseLevel() {
        super(800, 600, 1);
        GreenfootImage LevelImage = new GreenfootImage(1,1);
        LevelImage.setColor(Color.PINK);
        LevelImage.drawRect(0,0,1,1);
        setBackground(LevelImage);
        level = 0;
        addObject(new Level1(), 400, 300);
        addObject(new Level2(), 400, 400);
        addObject (new Title(), 400, 200);
    }

    /**
     * Überwacht Mausbewegungen und führt bei Klick auf bestimmte Bereiche zum jeweiligen Level
     */
    public void act() {
        if (Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse.getX() > 365 && mouse.getX() < 435 && mouse.getY() > 285 && mouse.getY() < 315) {
                level = 1;
            } else if (mouse.getX() > 365 && mouse.getX() < 435 && mouse.getY() > 385 && mouse.getY() < 415) {
                level = 2;
            } else {
                level = 0;
            }
        }
        if (Greenfoot.mouseClicked(null)) {
            if (level == 1) {
                Greenfoot.setWorld(new GreenWorld());
            } else if (level == 2) {
                Greenfoot.setWorld(new BlueWorld());
            }
        }
    }
}

/**
 * Klasse "Title" zeigt das Titelbild an
 */
class Title extends Actor {
    public Title() {
        setImage(new GreenfootImage("title.png"));
    }
}

/**
 * Klasse "Level1" zeigt das Bild von Level 1 an
 */
class Level1 extends Actor {
    public Level1() {
        setImage(new GreenfootImage("level1.png"));
    }
}

/**
 * Klasse "Level2" zeigt das Bild von Level 2 an
 */
class Level2 extends Actor {
    public Level2() {
        setImage(new GreenfootImage("level2.png"));
    }
}
