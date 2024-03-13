
package user_defined_annotation;
import java.lang.annotation.Annotation;
@interface MyAnno
{  
 String name();  
String project();
String date() default "today";
String version() default "14";
}

@MyAnno(name="Saurabh",project="Bank",date="1/1/2000",version="17")
public class User_Defined_Annotation {
int data;
     
    public static void main( String[] args)  
    {

int x;


    }
    
}


/*                 ------------------- 
                   @Annotation useses
                   ------------------- 



package user_defined_annotation;
import java.lang.annotation.Annotation;
@interface MyAnno
{
    
}
@MyAnno //class level Annotaion use
public class User_Defined_Annotation {
@MyAnno     //instance variable level Annotaion use
int data;
     @MyAnno //method level Annotation use
    public static void main(@MyAnno String[] args)  //parameter level Annotaion use
    {

@MyAnno    //local variable  level Annotaion use
int x;


    }
    
}
*/


/*                 ------------------
                   Meta data declare
                   -------------------




package user_defined_annotation;
import java.lang.annotation.Annotation;
@interface MyAnno
{  //all are meta data given bellow
 String name();   //Elements of  Annotation it is not called abstract method  (Name of the devloper of the class)
/*String project();
String date();
String version();+/
}
@MyAnno(name="Saurabh"/* this is meta data +/) //class level Annotaion use
public class User_Defined_Annotation {
@MyAnno(name="Saurabh")     //instance variable level Annotaion use
int data;
     @MyAnno(name="Saurabh") //method level Annotation use
    public static void main(@MyAnno(name="Saurabh") String[] args)  //parameter level Annotaion use
    {

@MyAnno(name="Saurabh")    //local variable  level Annotaion use
int x;


    }
    
}

*/