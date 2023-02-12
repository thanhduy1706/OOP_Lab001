public class Rectangle
{
    private int width;
    private int height;

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public Rectangle(int width, int height)
    {
        if (width>0)
        {
            this.width=width;
        } else this.width=1;

        if (height>0)
        {
            this.height=height;
        } else this.height=1;
    }

    public void visualizeRectangle()
    {
        System.out.println("Rectangle " + this.width + "x" + this.height);
        for (int i=0; i<this.height; i++)
        {
            for (int j=0; j<this.width; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
