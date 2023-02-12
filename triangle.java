public class triangle
{
    private int AB, BC, CA;

    public triangle(int AB, int BC, int CA)
    {
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }

    public int getAB() {
        return AB;
    }

    public int getBC() {
        return BC;
    }

    public int getCA() {
        return CA;
    }

    public void verifyTriangle()
    {
        if (AB+BC<CA || BC+CA<AB || AB+CA<BC) System.out.println("Not triangle");
        else if (AB==BC && BC==CA) System.out.println("Equilateral");
        else if (AB==BC || BC==CA || AB==CA) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }
}
