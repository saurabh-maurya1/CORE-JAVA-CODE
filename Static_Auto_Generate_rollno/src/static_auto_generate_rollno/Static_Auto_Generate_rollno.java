
package static_auto_generate_rollno;
import java.util.Date;
class Student
{
    private String rollNo;
    private static int count=1;
    private String assignRollNo()
    {
        Date d=new Date();
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
}

public class Static_Auto_Generate_rollno {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        Student s6=new Student();
        System.out.println("------------------------------------------------------");
        System.out.println("                  Roll No                             ");
        System.out.println("------------------------------------------------------");
        
        System.out.println(s1.getRollNo()+" \n"+s2.getRollNo()+" \n"+s3.getRollNo()+" ");
        System.out.println(s4.getRollNo()+" \n"+s5.getRollNo()+" \n"+s6.getRollNo()+" ");       
    }
    
}
