// import java.util.*;
// /**
//  * continuekeyword
//  */
// public class continuekeyword {

//     public static void main(String[] args) {
//         for (int i = 1; i <=10; i++) {
//             if (i==3||i==6) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
import java.util.*;
/**
 * continuekeyword
 */
public class continuekeyword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if (n%10==0) {
                continue;
            }
            System.out.println("your number was:"+n);
        } while (true);
    }
}