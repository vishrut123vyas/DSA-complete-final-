import java.util.*;
/**
 * callbyvalue
 */
public class callbyvalue {
    
    
        public static void swapvalue (int a, int b) {
            int temp=a;
            a=b;
            b=temp;
            
            System.out.println("a is ="+a);
            System.out.println("b is ="+temp);
        }
        public static void main(String[] args) {
            int a=5;
            int b=10;

            // swap
            swapvalue(a, b);
            

            
        }
    }
    
