import java.util.*;
/**
 * whileloop
 */
// public class whileloop {

//     public static void main(String[] args) {
//         int counter=1;
//         while (counter<=100) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// // }





// public class whileloop {

//         public static void main(String[] args) {
//             int counter=1;
//             while (counter<=100) {
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.err.println();
//         }
//     }
    public class whileloop {

            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("ENTER THE RANGE");
                int range=sc.nextInt();
                int counter=1;
                while (counter<=range) {
                    System.out.print(counter+" ");
                    counter++;
                }
                System.out.println();
            }
        }