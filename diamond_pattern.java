public class diamond_pattern {
    public static void diamondpattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i); j++) {
           // space
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1); j++) {
                //star
                System.out.print("*");
            }System.out.println();

        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=(n-i); j++) {
                // space
                     System.out.print(" ");
                 }
                 for (int j = 1; j <=(2*i-1); j++) {
                     //star
                     System.out.print("*");
                 }System.out.println();
     
    }
}
public static void main(String[] args) {
    diamondpattern(10);
}
}