package Strings;

public class times_lowercase_occurs {
    public static void main(String[] args) {
        String str="sanket IS GooD";
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
