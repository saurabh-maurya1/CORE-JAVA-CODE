
package interface_challenges_1;
interface Member
{
    public void callback();
}




class Store
{
    Member members[]=new Member[10];//create a array of object or references
    int count=0;
    
    void register(Member m)
{
  members[count++]=m;
}
void inviteSale()
{
    for(int i=0;i<count;i++)
        members[i].callback();
}
}





class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
    }
}

public class Interface_Challenges_1 {

    public static void main(String[] args) {
        Store s=new Store();
        Member c1=new Customer("John");
        Customer c2=new Customer("Smith");
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
        
       
    }
    
}
