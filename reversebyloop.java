import java.util.*;
/**
 * reversebyloop
 */
public class reversebyloop {

    public static void main(String[] args) {
        int n= 10984;

        while (n>0) {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        System.out.println();
    }
}