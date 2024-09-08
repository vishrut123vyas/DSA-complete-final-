// public class primeinrange {
//     public static boolean isprime(int n) {
//     for (int i = 0; i < Math.sqrt(n); i++) {
//         if(n%i==0){
//             return false;
//         }
//     } return true;
//     }
//     // public static void main(String[] args) {
//     //     System.out.println(isprime(77));
//     // }
//     public static void primeinrangeofn(int n) {
       
//         for (int i = 2; i <=n; i++) {
//              if (isprime(i)) {
//                   System.out.print(i+"  ");
//              }
//         }
//         System.out.println();
//    }
//    public static void main(String[] args) {
//    //   System.out.println(isprime(71));
//     primeinrangeofn(31);
//    }
    
    
// }



public class primerange {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRangeOfN(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRangeOfN(31);
    }
}