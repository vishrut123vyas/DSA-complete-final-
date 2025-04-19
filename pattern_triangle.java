public class pattern_triangle {
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
