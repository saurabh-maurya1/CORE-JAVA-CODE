
package constructor_practise;
class Rectangle
{
    private double length;
    private double breadth;
    
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(double l,double b)
    {
         setLength(l);
        setBreadth(b);
    }
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    { 
        if(l>0)
        length=l;
        else 
            length=0;
        
    }public void setBreadth(double b)
    { 
        if(b>0)
        breadth=b;
        else 
            breadth=0;
        
    }
    public Rectangle(double s)
    {
        length=breadth=s;
    }
    public double area() 
    {
        return getLength()*getBreadth();
    }
    public double perimeter()
    {
        return 2*(getLength()+getBreadth());
    }
    public boolean isSquare()
    {    if(length==breadth)
        return true;
       else
         return false;
                
    }
    
    
    
    
    
    
    
    
    
}

public class Constructor_Practise {

    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,20);
        System.out.println(r.area()+" :Area\n"+r.perimeter()+" :Perimeter\n"+r.isSquare()+" :isSquare");
        
    }
    
}


/*

package constructor_practise;
class Rectangle
{
    private double length;
    private double breadth;
    
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    public Rectangle(double s)
    {
        length=breadth=s;
    }
    
    
    
    
    
    
    
    
    
    
}

public class Constructor_Practise {

    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,5);
        
        
    }
    
}

*/