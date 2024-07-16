public class Rectangle {

    private int shortEdge;
    private int longEdge;

    public Rectangle(int shortEdge,int longEdge)
    {
        this.longEdge=longEdge;
        this.shortEdge=shortEdge;
    }

    public int CalculateArea()
    {
        return longEdge*shortEdge;
    }

    public int CalculatePerimeter()
    {
        return ((2*longEdge)+(2*shortEdge));
    }
}
