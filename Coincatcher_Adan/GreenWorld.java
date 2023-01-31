import greenfoot.*;  // Importiere Greenfoot (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Beschreibung der Klasse GreenWorld
 * 
 * @author (Adan Mohamed) 
 * @version (Version1.0 31.01.2023)
 */
// GreenWorld-Karte aus Text erstellt
public class GreenWorld extends World
{
    // Karte aus Text erstellen
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
    // Punkte-Board
    Punkte pk;
    /**
     * Konstruktor der Klasse GreenWorld.
     * 
     */
    public GreenWorld()
    {    
        // Erstelle eine neue Welt mit 600x400 Zellen mit einer Zellengröße von 1x1 Pixeln.
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
    // Punkte/Score hinzufügen
    public void addScore(int amount){
        pk.addScore(amount);
    }
    // Vorbereitung der Spiel-Start-Seite
    private void prepare()
    {
       
    }
    // GreenWorld-Karte Definitionen und TextMap erstellen
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
