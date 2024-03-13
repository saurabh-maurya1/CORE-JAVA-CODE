
package rectangle_class;
class Rectangle
{
    public int length;
    public int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
        {
            return true;
        }else
        { return false;}
    }
}

public class Rectangle_class {

    
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=22;
        r.breadth=24;
       System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("IsSquare: "+r.isSquare());
        
    }
    
}
