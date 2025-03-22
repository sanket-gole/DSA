public class Joke {
    public static void main(String[] args) {
        int a= 255;
        String s="";
        while (a>0){
            s+=a%10;
            a/=10;
        }   
        System.out.println(s);
    }
}
