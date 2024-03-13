
package abstract_challenges1;
abstract class Shape
{  
    abstract double perimeter();
    abstract double area();
    
    
}
class Circle extends Shape
{
    private int radius;
    public Circle(int r)
    {
        this.radius=r;
    }
   public double perimeter()
   {
       return 2*Math.PI*radius;
   }
   public double area()
   {
       return Math.PI*radius*radius;
   }
}
class Rectangle extends Shape
{
    private int length;
    private int breadth;
    public Rectangle(int l,int b)
    {
        this.length=l;
        this.breadth=b;
        
    }
    public double area()
   {
       return length*breadth;
   }
    public double perimeter()
    {
        return 2*(length*breadth);
    }
}

public class Abstract_Challenges1 {

    
    public static void main(String[] args) {
       Circle r=new Circle(2);
       System.out.println(r.area());
    }
    
}
