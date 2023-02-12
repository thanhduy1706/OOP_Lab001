public class triangleVerification
{
    public static void main(String[] args)
    {
        triangle tri1 = new triangle(3, 4, 5);
        triangle tri2 = new triangle(4, 4, 5);
        triangle tri3 = new triangle(5, 5, 5);
        triangle tri4 = new triangle(6, 4, 15);

        tri1.verifyTriangle();
        tri2.verifyTriangle();
        tri3.verifyTriangle();
        tri4.verifyTriangle();
    }
}
