// You are using Java
import java.util.*;
class Rectangle{
    private double len;
    private double bre;
    public Rectangle(){
        this.len = 0;
        this.bre = 0;
    }
    public Rectangle(double len, double bre)
    {
        this.len = len;
        this.bre = bre;
    }
    public double calcarea()
    {
        return len*bre;
    }
    public double getL()
    {
        return len;
    }
    public double getB()
    {
        return bre;
    }
    
}
public class new1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double bre = sc.nextDouble();
        Rectangle r1 = new Rectangle(len,bre);
        double area = r1.calcarea();
        // System.out.println("Area of rectangle: %.2f\n", area);
        System.out.printf("Area of rectangle: %.2f\n", area);
    }
}