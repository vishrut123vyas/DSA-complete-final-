public class reverse {
    public static void reverse_array(int num[]) {
        int first=0; int last=num.length-1;
        while(first<last) {
            int temp=num[last];
            num[last]=num[first];
            num[first]= temp;

    first++;
    last--;
}
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        reverse_array(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
      System.out.println();
    }
}