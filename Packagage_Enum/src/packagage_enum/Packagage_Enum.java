
package packagage_enum;
enum Dept
{
    CS("Saurabh Maurya","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");             // when enum is loaded every identifier is called;
   // these constant CS IT .. in capital letter
    String head;
    String location;
    
    private Dept(String head,String loc)
    {
       this.head=head;
       this.location=loc;
    }
 public String getHeadName()
 {
     return head;
 }
 public String getLocation()
 {
     return location;
 }
}

public class Packagage_Enum {


    public static void main(String[] args) {
   Dept d=Dept.CS;
 System.out.println(d.getHeadName());
 System.out.println(d.getLocation());
     }
    
}
     
   /*
   switch(d)
   {
       case CS: System.out.println("Head : Saurabh Maurya \nBlock A");
       break;
       case IT: System.out.println("Head : Smith \nBlock B");
       break;
       case CIVIL: System.out.println("Head : Srinivas \nBlock C");
       break;
       case ECE : System.out.println("Head: Dave \nBlock D");
       break;
   }
   
   */
  
/*
enum Dept
{
    CS,IT,CIVIL,ECE
}

public class Packagage_Enum {


    public static void main(String[] args) {
   Dept d=Dept.CIVIL;
   
   System.out.println(Dept.valueOf("IT"));
   Dept list[]=Dept.values();
   for(Dept x:list)
   {
       System.out.println(x);
   }
*/


/*
enum Dept
{
    CS(),IT,CIVIL,ECE;             // when enum is loaded every identifier is called;
    private Dept()
    {
        System.out.println(this.name());
    }
    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }
}

public class Packagage_Enum {


    public static void main(String[] args) {
   Dept d=Dept.ECE;
   d.display();
*/