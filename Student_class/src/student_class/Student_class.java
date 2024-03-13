
package student_class;
class Student{
    public long roll;
    public String name;
    public  String course;
    public  int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return total()/3d;
    }
    public String grade()
    {
       if(average()>=60) 
       {
         return "A+";
       }else
       {
           return "B";
       }
    }
    public String details(){// toString you can instead details
        return " Roll No: "+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
}
    
}    
    
public class Student_class {

    public static void main(String[] args) {
        Student st=new Student();
        st.roll=1906480100024l;
        st.name="Saurabh maurya";
        st.course="B.tech";
        st.m1=75;
        st.m2=65;
        st.m3=95;
        System.out.println(st.details());
        System.out.println("Total Marks :"+st.total());
        System.out.println("Average Marks :"+st.average());
        System.out.println("Grade :"+st.grade());
        
        
       
    }
    
}
