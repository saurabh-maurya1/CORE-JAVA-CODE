
package serilize_a_customer_challenges2;
import java.io.*;
class Customer implements Serializable
{
    String custID;
    String name;
    String phno;
    
    static int count=0;
    
    Customer()
    {
        
    }
    Customer(String n,String p)
    {
        custID="C"+count;
        count++;
        name=n;
        phno=p;
                
    }
    public String toString()
    {
        return "Customer ID :"+custID+
       "\nName :"+name+
       "\nPhno:"+phno+"\n";

    }
}
/*
public class Serilize_a_Customer_Challenges2 {
    public static void main(String[] args)throws Exception {
    Customer list[]={new Customer("Smith","83938393839"),new Customer("John","3933439494"),new Customer("Saurabh","958594949")};
            FileOutputStream fos=new FileOutputStream("Customer.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            
            oos.writeInt(list.length);
            for(Customer c:list)
                oos.writeObject(c);
            oos.close();
            fos.close();
        */
        
        
        public class Serilize_a_Customer_Challenges2 {
    public static void main(String[] args)throws Exception {
        
        java.util.Scanner sc=new java.util.Scanner(System.in);
        
            FileInputStream fis=new FileInputStream("Customer.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            
           int length =ois.readInt();
           
           Customer list[]=new Customer[length];
           
           for(int i=0;i<length; i++)
           {
               list[i]=(Customer)ois.readObject();
           }
        System.out.println("Enter Name of Customer");
        String name=sc.nextLine();
        
        for(int i=0; i<length; i++)
        {
            if(name.endsWith(list[i].name))
                System.out.println(list[i]);
        }
        ois.close();
        fis.close();
    
        }
        
        
        
    }
    
    
    
 