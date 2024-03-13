
package product.customer_challenges;
  class Product
  {  
       private String itemno;
       private String name;
       private double price;
       private short qty;
       
        public Product(String i)
       {
           itemno=i;
       }
       public Product(String i,String n)
       {
           itemno=i;
           name=n;
       }
       public Product(String i,String n,short q,double p)
       {
            name=n;
           itemno=i;
           setQty(q);
           setPrice(p);
       }
       
       
       public String getItemno(){return itemno;}
       public String getName(){return name;}
       public double getPrice(){return price;}
       public short getQty(){return qty;}
       
       
       public void setPrice(double p){price=p;}
       public void setQty(short q){qty=q;}
      
  }


 class Customer
 {
     private String custID;
     private String name;
     private String address;
     private String phno;
     
     
        public Customer(String cid,String n)
    {
        custID=cid;
        name=n;
    }
    public Customer(String cid,String n,String ad,String ph)
    {
       custID=cid;
        name=n;
       phno=ph; 
        address=ad;
    }
    
    
    public String getCustID(){return custID;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    
    public void setAddress(String ad){address=ad;}
    public void setPhno(String ph){phno=ph;}
        
 
 }
public class ProductCustomer_Challenges {
  
    public static void main(String[] args) {
       Product pro=new Product("A20B","Shoes") ;
       Customer cust=new Customer("S05","Saurabh Maurya");
       pro.setPrice(500);
       pro.setQty((short)50);
      cust.setAddress("Sultanpur");
      cust.setPhno("+918953833470");
      
       System.out.println("****************************************************************");
       System.out.println("                   PRODUCT DETAILS                               ");
       System.out.println("Name : "+pro.getName());
       System.out.println("Item No : "+pro.getItemno());
       System.out.println("Price : "+pro.getPrice());
       System.out.println("Quantity : "+pro.getQty());
       System.out.println("---------------------------------------------------------------");
       System.out.println("                   CUSTOMER DETAILS                               ");
       System.out.println("Customer ID : "+cust.getCustID());
       System.out.println("Name : "+cust.getName());
       System.out.println("Address : "+cust.getAddress());
       System.out.println("Ph : "+cust.getPhno()); 
        
        
        
        
    
    }
    
}
