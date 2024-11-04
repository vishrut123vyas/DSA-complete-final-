import java.util.*;

public class primebyfunction{
//     public static boolean isprime(int n) {
//          boolean isprime=true;
//          for(int i=2;i<n-1;i++) {
//             if(n%i==0) {
//                 isprime = false;
//                 // break; or
//                  return  isprime;
        
// } }
// return isprime;
// }
// public static void main(String[] args) {
//     System.out.println(isprime(22));
// }



// or
//         public static boolean isprime(int n) {
//         //  boolean isprime=true;
//          for(int i=2;i<n-1;i++) {
//             if(n%i==0) {
                
                
//                  return  false;
        
// } }
// return true;
// }
// public static void main(String[] args) {
//      System.out.println(isprime(71));
//  }
    

// }





// OPTIMIZED METHOD FOR PRIME NUMBER

public static boolean isprime(int n) {
     //  boolean isprime=true;
      for(int i=2;i<Math.sqrt(n);i++) {
         if(n%i==0) {
             
             
              return  false;
     
} }
return true;
}

public static void primeinrange(int n) {
     for (int i = 2; i <=n; i++) {
          if (isprime(i)) {
               System.out.print(i+"  ");
          }
     }
     System.out.println();
}
public static void main(String[] args) {
 System.out.println(isprime(71));
 primeinrange(31);
}
 

}