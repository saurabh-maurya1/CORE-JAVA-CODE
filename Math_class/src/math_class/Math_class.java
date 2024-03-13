
package math_class;

public class Math_class {

    public static void main(String[] args) {
        System.out.print(" 1.Absolute :");  //positive value give;
        System.out.println(Math.abs(-123));
        
        System.out.print(" 2.Absolute :");
        System.out.println(StrictMath.abs(-123));
        
        System.out.print(" 3.Cube Roote :");
        System.out.println(Math.cbrt(27));
        
        
        System.out.print(" 4.Exact Decrement :");
        System.out.println(Math.decrementExact(7));  // it will prevent a number to go in Underflow
        /*
        int i= Integer.MIN_VALUE;
        i--;
        System.out.println(i);
        */
        
        
        System.out.print(" 5.Exponente value in Floating Point Rep. :");
        System.out.println(Math.getExponent(12.345));
        
        System.out.print(" 6.Convert to Radians :");
        System.out.println(Math.toRadians(90));
        
        System.out.print(" 7.Round Division :");
        System.out.println(Math.floorDiv(50,9));
        
        System.out.print(" 8.e power x :");
        System.out.println(Math.exp(1));
        
        System.out.print(" 9.e power x :");
        System.out.println(StrictMath.exp(1));
        
        System.out.print(" 10.Log base 10 :");
        System.out.println(Math.log10(100));
        
        System.out.print(" 11.Maximum :");
        System.out.println(Math.max(100, 50));
        
        System.out.print( " 12.Tan :");
        System.out.println(Math.tan(45*Math.PI/180));
        
        System.out.print(" 13.Convert to Radians :");
        System.out.println(Math.toRadians(90));
        
        System.out.print(" 14.Convert to Degree :");
        System.out.println(Math.toDegrees(Math.atan(1)));
        
        System.out.print(" 15.Convert To Degree :");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));
        
        System.out.print(" 16.Random :");
        System.out.println(Math.random()*1000);
        
        System.out.print(" 17.Power :");
        System.out.println(Math.pow(2, 3));
        
        System.out.print(" 18.Exact Product :");
        System.out.println(Math.multiplyExact(100,200));
        
        System.out.print(" 19.Next float value :");
        System.out.println(Math.nextAfter(12.5, 13));
    }
    
}
