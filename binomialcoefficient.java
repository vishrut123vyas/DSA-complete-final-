import java.util.*;


public class binomialcoefficient{
public static int factorial(int n) {
    int f = 1;

    for (int i = 1; i <=n; i++) {
        f=f*i;
     }
     return f;
}
public static int bincoef(int n , int r) {
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);
    int a=factorial(n);
    int b= factorial(r);
    int c=factorial(n-r);
    int bincoef=a/(b*c);
    return bincoef;
}
public static void main(String[] args) {
    System.out.println(bincoef(5,2));
}
    
}
