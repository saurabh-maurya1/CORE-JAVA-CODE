
package practise_all;
class Stack1
{
    private int top=-1;
    private char [] array;
    private int size;
    
    public Stack1(int size)
    {
        this.size=size;
        this.array=new char[size];
    }
    
    public void push(char element)
    {
        if(isFull())
        {
            throw new RuntimeException("Stack is Overflow") ;
        }
         top++;
         array[top]=element;
                 
    }
    public char pop()
    {
        if(isEmpty())
        {
         throw new RuntimeException("Stack is Underflow");
        }
        char element=array[top];
           top--;
           return element;
    }
    public boolean isFull()
    {
        return top==size-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
}


public class Stack_problem {
    
    private static boolean isValid(String s)
{
      Stack1 st=new Stack1( s.length());
     
      for(int i=0;i<s.length(); i++)
      {  char element=s.charAt(i);
          if(element=='('||element=='{'||element=='[')
          {
              st.push(element);
          }else{
              if(st.isEmpty()){
                  return false;
              }else if(element==')')
              {
                 char element1=st.pop();
                  if(element1!='(')
                  {  return false;}
                  
              }else if(element=='}')
              {
                 char element1=st.pop();
                  if(element1!='{')
                      return false;
              }else if(element==']')
              {
                 char element1=st.pop();
                  if(element1!='[')
                      return false ;
              }
                  
          }
          
      }
      return st.isEmpty();
}
public static void main(String[] args)
{  
     String s="(){}[]";
             
     boolean result=isValid(s);
     if(result)
     {
         System.out.println("Valid");
     }else
         System.out.println("Invalid");

}

}






    

    


