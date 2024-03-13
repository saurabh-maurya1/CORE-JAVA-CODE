
package pkg80.anonymous.inner.pkgclass;

//here you can use interfaces
abstract class My {
	abstract void display();
}
class Outer {
	public void meth() {
                                // that is not object it is nameless class which is anonymous class;
		My m = new My() {public void display() {System.out.println("Hello");}};
		m.display();
// you can also use anonymous object with anonymous class 
	//new My() {public void display() {System.out.println("Hello");}}.display();

	}
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.meth();
    }
    
}
