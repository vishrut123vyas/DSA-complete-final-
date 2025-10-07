public class Decreasing_order {
    public static void innerfunc(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        innerfunc(n-1);
    }
    public static void increasing(int n) {
        if (n==1) {
            System.out.print(n+" ");
            return;
        }

        increasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        // innerfunc(n);
        increasing(n);
    } 
}