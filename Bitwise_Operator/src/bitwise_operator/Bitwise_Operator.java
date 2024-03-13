
package bitwise_operator;

public class Bitwise_Operator {

    public static void main(String[] args) {
        int k=-10;
        int x=0b1010;
        
        int y=0b0110;
        int z=x&y;  //And operation
        int q=x|y;
        int X=x^y;
        int N=~x;
        int L=x<<1;
        int R=x>>1;
        int Sr=k>>1;
        int Us=k>>>1;
        System.out.println(z);
        System.out.println(q);
        System.out.println(X);
        System.out.println(N);
        System.out.println(L);
        System.out.println(R);
        System.out.println(Sr);
        System.out.println(Integer.toBinaryString(k));
        System.out.println(String.format("%32s",Integer.toBinaryString(Us)));
        
        
        
    }
    
}
