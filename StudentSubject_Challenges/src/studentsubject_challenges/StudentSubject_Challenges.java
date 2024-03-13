
package studentsubject_challenges;
class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String sid,String n)
    {
      subID=sid;
      name=n;
    }
    public Subject(String sid,String n,int m)
    {
        subID=sid;
      name=n;
       setMaxMarks(m) ;
    }
    public Subject(String sid,String n,int m,int m1)
    {
        subID=sid;
      name=n;
       setMaxMarks(m) ;
       setMarksObtain(m1);
    }
    
    public String getSubId(){return subID;}
    public String getName(){ return name;}
    public int getMaxMarks(){ return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int m){ maxMarks=m;}
    public void setMarksObtain(int m1){marksObtain=m1;}
    public boolean isQualified(int m1){return m1>=maxMarks/10*4;}
    
   public String toString() //return String
   {
       return "\nSubject ID:"+subID+"\n Name : "+name+"\nMarks Obtained:"+marksObtain;
   }
       
    
            
}
class Student
{
    private long rollno;
    private String name;
    private String dept;
    private String[] subject;
    
    public Student(long r,String n,String d,String[]s)
    {
        rollno=r;
        name=n;
        dept=d;
        setSubject(s);
    }
    public long getRollno(){return rollno;}
    public String getName(){ return name;}
    public  String getdept(){ return dept;}
    public  String[] getSubject(){return subject;}
    
    public void setdept(String d){ dept=d;}
    public void setSubject(String []s){subject=s;}
     
        
            
     public String toString() //return String
   {
       return "\n Roolno:"+rollno+"\n Name : "+name+"\nDepartment:"+dept;
         
     
     }
    }
public class StudentSubject_Challenges {

    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100,89);
        subs[1]=new Subject("s102","Algorithm",100,75);
        subs[2]=new Subject("s103","Operating System",100,78);
        
       for(Subject s:subs)
           System.out.println(s);
       
       System.out.println("*********************************************");
        String []sub={"DS","OS","COA","CD"};
        Student su[]=new Student[1];
        su[0]=new Student(1906480100024l,"Saurabh Maurya","cs",sub);
        
       for(Student s:su)
           System.out.println(s);
       
       Student st=new Student(1906480100024l,"Saurabh","cs",sub);
       String []a=st.getSubject();
       System.out.println("Subject : ");
       for(String y: a )
           System.out.print(y+", ");
       
    System.out.println("\n*********************************************");

        
     
    }
    
}
