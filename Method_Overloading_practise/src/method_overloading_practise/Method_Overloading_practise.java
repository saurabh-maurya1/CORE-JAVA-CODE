
package method_overloading_practise;

public class Method_Overloading_practise {
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(float x,float y)
    {
        return x>y?x:y;
    }
  static int max(int x,int y,int z)
  {
      return x>y && x>y?x :y>z?y:z;
  }
    public static void main(String[] args) {
        System.out.println(max(2,5,8));
       
    }
    
}
