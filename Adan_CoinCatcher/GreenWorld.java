import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenWorld here.
 * 
 * @author (Adan Mohamed) 
 * @version (Version1.0 31.01.2023)
 */
// GreenWelt Karte aus Text Erstellt.
public class GreenWorld extends World
{
    //Map aus Text Erstellen
    String[] textMap = {
        "****.******.***",
        "...............",
        "*.**.*.********",
        "*.*...........*",
        "*.*.***.*.*.*.*",
        "*.*. P ...*.*.*",
        "*.*.***....*  *", 
        "*.*.****.****.*",
        "*.............*",
        "****.******.***"
    };
    public int Gegnerspeed;
    //PunktBoard 
    Punkte pk;
    /**
     * Constructor for objects of class GreenWorld.
     * 
     */
    public GreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 460, 1); 
        GreenfootImage bgImage = new GreenfootImage(1,1);
        bgImage.setColor(Color.GREEN);
        bgImage.drawRect(0,0,1,1);
        setBackground(bgImage);
        prepare();
        drawMap();
        pk = new Punkte();
        addObject(new Gegner(Gegnerspeed), 100, 350);
        addObject(pk, getWidth()/2,430);
    }
    // Punkte/Score
     public void addScore(int amount){
        pk.addScore(amount);
    }
    // Game Start Seite
    private void prepare()
    {
       
    }
    // GreenWorld Karte Difinitionen und TextMap erstellt.
    private void drawMap()
    {
        for(int i = 0; i < textMap.length;i++)
        {
            String mapline = textMap[i];
            for(int j =0; j < mapline.length(); j++){
                char mapChar = mapline.charAt(j);
                int y = i * 40 + 20;
                int x = j * 40 + 20;
                switch(mapChar){
                    case '*':
                        addObject(new wand(), x, y);
                        break;
                        case '.':
                            addObject(new coin(), x, y);
                            break;
                        case 'P':
                            addObject(new Spieler(), x, y);                            
                        default:
                            break;
                }
            }
        }
    }
}
