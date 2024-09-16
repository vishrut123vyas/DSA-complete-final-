public class decimaltobinary {
public static void dectobin(int dec) {
    int mynum=  dec;
    int pow=0;
    int binnum= 0;
    while (dec>0) {
        int rem=dec%2;
        binnum=binnum+(rem*(int)Math.pow(10,pow));
        pow++;
        dec=dec/2;

    }
    System.out.println("binary of this "+mynum+" decimal no. is ="+binnum);

}
public static void main(String[] args) {
    dectobin(5);
}
}
