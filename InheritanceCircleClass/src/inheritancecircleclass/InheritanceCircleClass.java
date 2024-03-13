
package inheritancecircleclass;
class Circle {
	private double radius;
	public Circle() {
		this.setRadius(0.0);
	}
	public void setRadius(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return this.radius;
	}
	public double areaCircle() {
		return Math.PI*getRadius()*getRadius();
	}
	public double perimeterCircle() {
		return 2*Math.PI*radius;
	}
	
}
class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		this.setHeight(0.0);
	}
	public void setHeight(double h) {
		this.height = h;
	}
	public double getHeight() {
		return this.height;
	}
	public double areaCylinder() {
		return areaCircle()*getHeight();
	}
	public double perimeterCylinder() {
		return (perimeterCircle()*getHeight());
	}
}

public class InheritanceCircleClass {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();
System.out.println("Radius : "+c.getRadius()+"\nHeight : "+c.getHeight());
c.setHeight(5);
c.setRadius(3);
System.out.println("Area of Cylinder :"+c.areaCylinder());
System.out.println("Perimeter of Cylinder :"+c.perimeterCylinder());
System.out.println("Radius : "+c.getRadius()+"\nHeight : "+c.getHeight());

	}}
	
        
        
        
        
    