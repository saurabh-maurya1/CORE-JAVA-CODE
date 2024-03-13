
package p_student_challenges_hashmap;
import java.io.*;
import java.util.*;

class Account implements Serializable
{
    public String accno;
    public String name;
     public double balance;
     
     Account(){}
     Account(String a,String n, double b)
     {
         accno=a;
         name=n;
         balance=b;
     }
     public String toString()
     {
         return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
     }
}

public class P_Student_Challenges_HashMap {

    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        
        Account acc=null;
        HashMap<String,Account> hm=new HashMap<>();
        
        try{
            FileInputStream fis=new FileInputStream("Account.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            int count=ois.readInt();
            for(int i=0; i<count;i++)
            {
                acc=(Account)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accno,acc);
            }
            fis.close();
            ois.close();
        }
        catch(Exception e){}
        
        FileOutputStream fos=new FileOutputStream("Account.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        int choice;
        String accno,name;
        double balance;
        
        do{
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3.View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6.Exit");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
                         sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])");

            
            switch(choice)
            {
                case 1:System.out.println("Enter Details Accno, Name, balance");
                        accno=sc.nextLine();
                        name=sc.nextLine();
                        balance=sc.nextDouble();
                        acc=new Account (accno,name,balance);
                        hm.put(accno,acc);
                        System.out.println("Account Created for "+name);
                        break;
                case 2: System.out.println("Enter Accno");
                     //   sc.nextLine();
                        accno=sc.nextLine();
                        hm.remove(accno);
                        break;
                case 3:System.out.println("Enter Accno");
                        accno=sc.nextLine();
                        acc=hm.get(accno);
                        System.out.println(acc);
                        break;
                case 4: for(Account a:hm.values())
                         System.out.println(a);
                         break;
                case 5:
                case 6: oos.writeInt(hm.size());
                
                            for(Account a:hm.values())
                                oos.writeObject(a);
            }
            
        }while(choice!=6);
        oos.close();
        oos.flush();
        fos.close();
        
                
        
        
        
        
    }
    
}









/*



package demo;
 import java.util.*; 
 import java.io.*;
class Account implements Serializable {
	public String accno;
	public String name;
	public String address;
	public String pincode;
	static int count=1;
	public double balance;
	
	Account(){}
	Account( String n,String ad,String pin, double b){
		this.address= ad;
		this.pincode=pin;
		name = n;
		balance =b;
		accno = ""+name.substring(0,2)+""+count+++""+address.substring(0,3)+""+pincode.substring(3,6)+"";
	}
	public String toString() {
		return "Account No:"+accno+"\nName :"+name+"\nPinCode :"+pincode+"\n"+"Address :"+address+"\n"+"Balance :"+balance+"\n";
	}
}
class Demo { public static  void main(String[] args) throws Exception{
Scanner sc = new Scanner(System.in);
Account acc = null;
HashMap<String,Account> hm = new HashMap<>();
try {
	FileInputStream fis = new FileInputStream("C:\\Users\\saura\\Desktop\\Account.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	int count=ois.readInt();
	for(int i=0; i<count; i++) {
		acc=(Account)ois.readObject();
        System.out.println(acc);
        hm.put(acc.accno, acc);
	}
	fis.close();
	ois.close();
}
catch(Exception e ) {}
FileOutputStream fos = new FileOutputStream("C:\\Users\\saura\\Desktop\\Account.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
System.out.println("\tMenu");
int choice;
String accno, pincode,address,name;
double balance;
do {
	System.out.println("1. Create  Account");
	System.out.println("2.Delete Account");
	System.out.println("3.View Account");
	System.out.println("4.View All Accounts");
	System.out.println("5. Withdraw Amount");
	System.out.println("6. Deposit Amount");
	System.out.println("7. Save Accounts");
	System.out.println("8.Exit");
	System.out.println("Enter Your Choice");
	choice=sc.nextInt();
	    sc.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])");
	    switch(choice) {
	    case 1: System.out.println("Enter Detail Name,Address,pincode, Balance");
	            
	             name = sc.nextLine();
	             address=sc.nextLine();
	             pincode =sc.nextLine();
	             balance = sc.nextDouble();
	             acc = new Account(name,address,pincode,balance);
	             hm.put(acc.accno, acc);
	             System.out.println("Account Created for "+name);
	             System.out.println("New Generated Account No :"+acc.accno+" \n\n");
	              break;
	    case 2: System.out.println("Enter Accno");
	           accno = sc.nextLine();
	           hm.remove(accno);
	           break;
	    case 3: System.out.println("Enter Accno");
	            accno=sc.nextLine();
	            acc = hm.get(accno);
	            System.out.println(acc);
	            break;
	    case 4: for(Account a:hm.values())
	            System.out.println(a);
	             break;
	    case 5:  System.out.println("Enter Accno");
	    				accno=sc.nextLine();	    				
	    				if(hm.containsKey(accno)) {
	    				acc = hm.get(accno);
	    		 System.out.println("Enter Amount you want to withdraw");
	    		 balance = sc.nextDouble();
	    		  if(acc.balance>balance) {
	    			  acc.balance -=balance;
	    			  System.out.println("Total Balance : "+acc.balance+"\n\n");
	    		  }else {
	    			  System.out.println("Not sufficient balance"+"\n\n");
	    		  }} else {
	    			  System.out.println("Accno is not Correct"+"\n\n");
	    		  }
	    		  break;
	    			  
	    				
	 case 6:	System.out.println("Enter Accno");
				accno=sc.nextLine();
               if(hm.containsKey(accno)) {
				acc = hm.get(accno);
				System.out.println("Enter Amount you want to Deposit");
				 balance = sc.nextDouble();
				 if(acc.balance>0) {
					 acc.balance +=balance;
					 System.out.println("Remaining Balance : "+acc.balance+"\n\n");
				 }} else {
	    			  System.out.println("Accno is not Correct"+"\n\n");
	    		  }
	    		  break;
	 case 7:
	    case 8: oos.writeInt(hm.size());
	            for(Account a:hm.values())   
	            	 oos.writeObject(a);
	         }
	    }while(choice!=8);
	    oos.close();
	    oos.flush();

}}
*/