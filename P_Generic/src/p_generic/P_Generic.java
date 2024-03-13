
package p_generic;

public class P_Generic<T> {
    T data[]=(T[])new Object[3];

    public static void main(String[] args) {
        
        P_Generic<String> gd=new P_Generic();
        gd.data[0]="hi";
        gd.data[1]="bye";
        //gd.data[2]=10;
        String str=gd.data[0];
        
    }
    
    
    
    
}



/*
  Object obj[]=new Object[3];
        
        obj[0]="hi";
        obj[1]="bye";
        obj[2]=new Integer(10);
        
        String str;
        for(int i=0;i<3;i++)
        {
            str=(String)obj[i];
            System.out.println(str);
        }
*/