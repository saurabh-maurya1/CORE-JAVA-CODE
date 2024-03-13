
package menu_driven_program_for_arithmatic_operation;
import java.util.*;

public class Menu_Driven_Program_for_Arithmatic_operation {

    public static void main(String[] args) {
        System.out.println("\tMenu");
      
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV\n");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Two Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter Option in Word");
        sc.nextLine();// it is use  for reading the below line because without these enter key
        String Option=sc.nextLine();       // read below line and end the programman
       Option=Option.toUpperCase();
        switch(Option)
        {
            case "ADD":System.out.println("The Sum of "+a+" And "+b+" is "+(a+b));
            break;
            case "SUB":System.out.println("The Substraction of "+a+" And "+b+" is "+(a-b));
            break;
            case "DIV":System.out.println("The Division of "+a+" And "+b+" is "+((double)(a/b)));
            break;
            case "MUL":System.out.println("The Multiplication of "+a+" And "+b+" is "+(a*b));
            break;
            default : System.out.println("Invalid Option");
            break;
            
        }
        
        

    }
    
}





/*
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String value;
        int result=0;
do {
    System.out.println("\nMenu");
  System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.EXIT\n\n");
  System.out.println("Enter your choice in word");
  value=sc.next();
  if(!("YES".equals(value.toUpperCase()))){
      System.out.println("Enter two number :");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      String op=value.toUpperCase();
      switch (op){
          case "ADD" : result=num1+num2;
              break;
          case "SUB" : result=num1-num2;
              break;
          case "MUL" : result=num1*num2;
              break;
          case "DIV" : result=num1/num2;
              break;
          default: System.out.println("Invalid");
      }
  }
  System.out.println("Result : "+result);
  System.out.println("Are You want To Continue the program pres Yes/No");
  value=sc.next();

}while(!("YES".equals(value.toUpperCase())));
    }
    }

*/