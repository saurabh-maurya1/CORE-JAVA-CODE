
package cylinder_class;
class Cylinder
{
    public double radius;
    public double hight;
    public double lidArea(){
        return 2*Math.PI*radius*radius;
}
    public double totalSurfaceArea(){
        return 2*Math.PI*radius*(hight+radius);
        
    }
    public double volume()
    {
        return Math.PI*radius*radius*hight;
    }       
        }
public class Cylinder_class {

    public static void main(String[] args) {
        Cylinder cy=new Cylinder();
        cy.radius=7;
        cy.hight=10;
        System.out.println("lidArea : "+cy.lidArea());
        System.out.println("totalSurfaceArea : "+cy.totalSurfaceArea() );
        System.out.println("Volume: "+cy.volume());
        
    }
    
}
