
package in_buildin_annotation_part2;
import java.lang.annotation.*;
//@Retention(RetentionPolicy.CLASS)   // it make the interface class are   accessable  by reflecter
// @Documented //it will give discription in the documentation also
@Target(value={ElementType.LOCAL_VARIABLE,ElementType.METHOD})// it show that it is use only in local variable and method
//@Repeatable(MyAnno.class)
 // use public @interface MyAnno in given bellow
@interface MyAnno
{  
 String name();  
String project();
String date() default "today";
String version() default "14";
}
//@MyAnno(name="Saurabh",project="Bank",date="1/1/2000",version="17")

public class In_Buildin_Annotation_part2 {
int data;

      @MyAnno(name="Saurabh",project="Bank",date="1/1/2000",version="17")
    public static void main(String[] args) {
        
        
     @MyAnno(name="Saurabh",project="Bank",date="1/1/2000",version="17")
       int x;   
     
    }
    
}
