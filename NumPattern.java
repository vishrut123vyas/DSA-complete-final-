public class NumPattern {
   // public static void main(String[] args) {
   //    int n =5;
   //    for (int i = 0; i < n; i++) {
   //       for (int j = 0; j < n; j++) {
   //          System.out.print((i+j)%n+1 +" ");
   //       }System.out.println();
   //    }
   // }

   public static void rotatedpattern(int n) {
      for (int i = 1; i <=n; i++) {
         for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
         }
         
         for (int j = 1; j <= i;j++){
            System.out.print(("*"));
        }
        System.out.println();
      }
   //    for (int i = 1; i <=n; i++) {
            
            
            
   //       for (int j = 1; j <= n-i; j++) {
   //           System.out.print(" ");
   //       }
         
         
         
   //       for (int j = 1; j <= i;j++){
   //           System.out.print("*");
   //       }
   //       System.out.println();
   //   }
 
   }
  

public static void main(String[] args) {
   int n = 5;
   rotatedpattern(n);
   // nums(n);
}


}






