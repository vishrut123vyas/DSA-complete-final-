import java.util.*;

public class functionoverloading {

// funtion overloading using parameters

// public static int sum(int a , int b) {
//     return a+b;
// }
// public static int sum(int a, int b, int c) {
//     return a+b+c;
// }
//  public static void main(String[] args) {
//     System.out.println(sum(3,5 ));
//     System.out.println(sum(3,4,4));
//  }






// function overloading using data types
 public static int sum(int a , int b) {
return a+b;
}
 
public static float sum(float a, float b) {
    return a+b;
}
public static void main(String[] args) {
    System.out.println(sum(3,5 ));
    System.out.println(sum(3.5f,4.5f));
}}