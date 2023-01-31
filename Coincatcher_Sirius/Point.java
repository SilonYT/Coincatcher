public class Point  
{
    /**
     * variable x for the x-position, 
     * variable y for the y-position
     */
    private int x;
    private int y;
    
    /**
     * Takes x and y position of the object, which uses this method and set it for the variable x and y
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Return x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * Return y coordinate
     */
    public int getY()
    {
        return y;
    }
}
