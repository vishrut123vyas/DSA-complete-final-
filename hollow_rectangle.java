public class hollow_rectangle  {
    // public static void hollow_rec(int totrows,int totcols) {
    //     for (int i = 1; i <=totrows; i++) {
            
    //         for (int j = 1; j <= totcols; j++) {
              
    //           if (i == 1 || i == totrows || j == 1 || j == totcols){
    //             System.out.print("*");
    //           }
    //           else{
    //             System.out.print(" ");
    //           }
    //         }
    //         System.out.println();
    //     }
    // }
    // // public static void main(String[] args) {
    //     hollow_rec(4,5 );
    // }


    public static void inverted_rotated_half_pyramid(int n) {
      for (int i = 1; i <=n; i++) {
          for (int j = 1; j <= n-i; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
  // public static void main(String[] args) {
  //    inverted_rotated_half_pyramid(5);
  // }
  public static void O1traiangle(int n) {
    for (int i=1;1<=n;i++) {
        for (int j = 1; j <=i; j++) {
            if ((i+j)%2==0) {
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    O1traiangle(5);
}















  }
