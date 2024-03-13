   
package cylinder_chalneges;
class Cylinder
{
    private double radius;
    private double height;
    public Cylinder()
    {
        radius=0;
        height=0;
    }
    public Cylinder(int r)
    {
      radius=r;  
      height=1;
    }
    public Cylinder(double r,double h)
    {
        radius=r;
        height=h;
        
    }
    public double getRadius()
    {
      return radius;  
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        if (h>0)
            height=h;
        else
            height=0;
    }
    public void setRadius(double r)
    {
        if(r>0)
            radius=r;
        else
             radius=0;
    }
   public void setDimension(double r,double h)
   {
       setRadius(r);
       setHeight(h);
   }
   public double area()
   {
       return Math.PI*getRadius()*getRadius()*getHeight();
   }
   public double lidArea()
   {
       return 2*Math.PI*getRadius()*getRadius();
   }
   public double totalArea()
   {
       return 2*Math.PI*getRadius()*(getHeight()+getRadius());
   }
            
    
    
    
    
   
}

public class Cylinder_Chalneges {

    public static void main(String[] args) {
        Cylinder c=new Cylinder(2,5);
        c.setDimension(5, 4);
//        c.setHeight(3.2);
//        c.setRadius(5.4);
        System.out.println("Area :"+c.area());
        System.out.println("lidArea : "+c.lidArea());
        System.out.println("TotalArea : "+c.totalArea());
        System.out.println("Height : "+c.getHeight());
        System.out.println("Radius : "+c.getRadius());
        
    }
    
}
