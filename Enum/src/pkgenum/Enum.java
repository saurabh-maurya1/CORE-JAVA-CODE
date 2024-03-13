
package pkgenum;

enum Dept {
    CS("Head: John" ,"Block : A"),IT("Head:Smith","Block:B"),CIVIL("Head: Srinival"," Block : C"),ECE("Head:Dave","Block:D"); 
   //each identifier act as object 
    String HeadName;
     String location;
    private Dept(String head,String loc){
     this.HeadName=head;
     this.location=loc;
    }
   public String getHeadName(){
       return this.HeadName;
   }
   public String getLocation(){
       return this.location;
   }
}
public class Enum {

    public static void main(String[] args) {
        Dept d= Dept.CIVIL; // here d will give CIVIL and CIVIL act as a object and it will call corresponding headname and location
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        System.out.println();
        Dept ds= Dept.CS;
        System.out.println(ds.getHeadName());
        System.out.println(ds.getLocation());
                System.out.println();

        Dept dt =Dept.IT;
          System.out.println(dt.getHeadName());
        System.out.println(dt.getLocation());
                System.out.println();

        Dept de= Dept.ECE;
        System.out.println(de.getHeadName());
        System.out.println(de.getLocation());
                System.out.println();

    }
}



/*

enum Dept {
    CS,IT,CIVIL,ECE ;// all are public static and final
}
public class Enum {

    public static void main(String[] args) {
        Dept d= Dept.CIVIL;
        System.out.println(d.ordinal());
        System.out.println(d.name());
        System.out.println(d.valueOf("IT"));//if matching then it will return It and it will always upper case only;
         Dept[] list =Dept.values();//it will give all list of values
         for(Dept a :list){
             System.out.println(a);
         }

    }
    
}
*/









/*

enum Dept {
    CS,IT,CIVIL,ECE; // all are public static and final
}
public class Enum {

    public static void main(String[] args) {
        Dept d= Dept.CIVIL;
       switch(d){
         case  CS: System.out.println("Head: John \nBlock : A");
                        break;
         case IT:System.out.println("Head:Smith\nBlock:B");
                      break;
         case  CIVIL: System.out.println("Head: Srinival \nBlock : C");
                        break;
         case ECE:System.out.println("Head:Dave\nBlock:D");
                      break;
       }
    }
}
*/









/*
enum Dept {
    CS,IT,CIVIL,ECE; // all are public static and final
    //when the enum is loaded all the identifier will we created and there constructer will be called and for
    // each identifier there constructer will be called this is callled 4 time and this is displaying each identifier
   private Dept(){
        System.out.println(this.name());
    }
}
public class Enum {

    public static void main(String[] args) {
        Dept d= Dept.CIVIL;
       
    }
}


*/


/*

enum Dept {
    CS,IT,CIVIL,ECE; // all are public static and final
    //when the enum is loaded all the identifier will we created and there constructer will be called and for
    // each identifier there constructer will be called this is callled 4 time and this is displaying each identifier
   private Dept(){
        System.out.println(this.name());
    }
   public void display(){
       System.out.println("\n\n"+this.name()+"  "+this.ordinal());
   }
}
public class Enum {

    public static void main(String[] args) {
        Dept d= Dept.CIVIL;
       d.display();
    }
}
*/