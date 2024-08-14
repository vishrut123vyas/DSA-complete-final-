// import java.util.*;
// /**
//  *
//  */
// public class function01 {
//     public static void printf() {
//         System.out.println("jai shree ram");

//     }
//     public static void main(String[] args) {
//         printf();
//     }
    
// }






// import java.util.*;
// /**
//  * function01
//  */
// public class function01 {

//     public static void calculatesum() {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println("sum is ="+sum);
//     }
//     public static void main(String[] args) {
//         calculatesum();
//     }
// }






// import java.util.*;
// /**
//  * function01
//  */
// public class function01 {

//     public static void calculatesum(int a, int b) {
//         int sum=a+b;
//         System.out.println("sum is ="+sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//        calculatesum(a, b);
//     }
// }





import java.util.*;
/**
 * function01
 */
public class function01 {

    public static int calculatesum(int a, int b) {
        int sum=a+b;
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       int sum =calculatesum(a, b);
       System.out.println("sum is ="+sum);
    }
}