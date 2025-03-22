package Recursion;

public class num_in_Engkish {
    static String[] digit={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
            int a=190;
            print(a);
    }
    public static void print(int a){
        if(a==0){
            return;
        }
        int last=a%10;
        print(a/10);
        System.out.print(digit[last]+" ");
    }
}
