
package exception_challenges;
class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is full";
    }
}
class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}
class Stack
{
   final private int size;
    private int top=-1;
   final private int s[];
    public Stack(int sz)
    {
        size=sz;
        s=new int[size];
    }
    public void push(int x)throws StackOverFlow
    {
       if(top==size-1) 
           throw new StackOverFlow();
       top++;
       s[top]=x;
    }
    public int pop() throws StackUnderFlow
    {
        int x;
        if(top==-1)
            throw new StackUnderFlow();
        x=s[top];
        top--;
        return x;
    }
}

public class Exception_Challenges {

    public static void main(String[] args)  {
       Stack st=new Stack(5);
       try{
      
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
//       st.push(30);
       for(int i=0;i<6; i++){
           System.out.println(st.pop());
       }
       
      
    }
    catch(Exception e) 
    {
        System.out.println(e);
    }
  /*   it is best way
       catch(Exception e)
           {
               System.out.println(e);
           }  
 */
}}
