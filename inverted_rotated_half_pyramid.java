public class inverted_rotated_half_pyramid {
    public static void invertedrotatedhalfpyra(int n) {
        for (int i = 1; i <=n; i++) {
            
            
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            
            
            
            for (int j = 1; j <= i;j++){
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    
}
public static void main(String[] args) {
    invertedrotatedhalfpyra(5);
}
}