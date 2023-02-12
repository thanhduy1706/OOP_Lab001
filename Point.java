public class Point
{
    private double x, y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point pB)
    {
        return Math.sqrt( Math.pow(pB.x-x,2) + Math.pow(pB.y-y,2) );
    }
}