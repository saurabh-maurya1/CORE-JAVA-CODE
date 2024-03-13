
package inheritance_chalenges;

class Account
{
    private long accno;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected double balance;
    
    public Account(long accno,String name,String address,String phno,String dob)
    {
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.phno=phno;
        this.dob=dob;
       
    }
   
    public long getAccno(){return accno;}
    public String getName(){return name ;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    public String getDob(){return dob;}
    public double getBalance(){return balance;}
    
    public void setAddress(String address){this.address=address;}
    public void setPhno(String phno){this.phno=phno;}
    public void setBalance(double amount){this.balance=amount;}
    
}
  class SavingsAccount extends Account
{
  public SavingsAccount(long ac, String n, String ad, String ph, String dob) {
		super(ac, n, ad, ph, dob);
		
	}
    public  void deposit(double amount)
    {
        this.balance+=amount;
         
    }
    public void withdraw(double amount)
    {    if(balance>=amount)
        balance-=amount;
    }
    public void fixdeposite(double amount)
    {
       balance+=amount;
    }
    public void liquidate(double amount) 
    {
        balance+=amount;
    }
}
class LoanAccount extends SavingsAccount
{
   	public LoanAccount(long ac, String n, String ad, String ph, String dob) {
		
            super(ac, n, ad, ph, dob);
              
	}
        
          
    public void payEMI(double EMI)
    {    

      withdraw( EMI);
       }
       
        
    }
   
  
   

      












public class Inheritance_Chalenges {

    public static void main(String[] args) {
     //  Account ac=new Account(36318100016324L,"Saurabh Maurya","Sultanpur","+919794571142","20/05/2001");
     //SavingsAccount ac=new SavingsAccount(36318100016324L,"Saurabh Maurya","Sultanpur","+919794571142","20/05/2001");
   
     LoanAccount ac=new LoanAccount(36318100016324L,"Saurabh Maurya","Sultanpur","+919794571142","20/05/2001");
       ac.deposit(500);
     System.out.println("ACCOUNT NO :"+ac.getAccno());
        System.out.println("NAME :"+ac.getName());
         System.out.println("ADDRESS :"+ac.getAddress());
          System.out.println("DATE OF BIRTH :"+ac.getDob());
           System.out.println("PH No :"+ac.getPhno());
            System.out.println("BALANCE :"+ac.getBalance());
            
         ac.payEMI(300.0);
    
                     
System.out.println("After EMI pay Balance :"+ac.getBalance());
         
           

}
}