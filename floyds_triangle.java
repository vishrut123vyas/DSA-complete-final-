public class floyds_triangle {
    public static void floydstri(int n, int counter) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydstri(5, 1);
    }
}
