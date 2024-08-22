import java.util.*;
/**
 * product
 */
public class productab {

    public static int multiply(int a , int b) {
      
        int product= a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
       int prod=multiply(a, b);
       System.out.println(prod);
         prod=multiply(1222, 1333);
       System.out.println(prod);
    }
}