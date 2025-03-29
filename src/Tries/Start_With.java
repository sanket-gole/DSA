package Tries;

public class Start_With {
    static class Node{
        Node childern[]=new Node[26];
        boolean eow;
        public Node(){
            for (int i=0;i<childern.length;i++){
                childern[i]=null;
            }

        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;

        for (int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.childern[idx]==null){
                curr.childern[idx]=new Node();
            }
            curr=curr.childern[idx];
        }
         curr.eow=true;
    }

    public static boolean search(String key){
        Node curr=root;
        for (int i=0;i<key.length();i++){
            int idx= key.charAt(i)-'a';
            if (curr.childern[i]==null){
                return false;
            }
            curr=curr.childern[idx];
        }
        return curr.eow==true;
    }
    public static boolean startWith(String prefix){
        Node curr=root;
        for (int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.childern[idx]==null){
                return false;
            }
            curr=curr.childern[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="moon";
        for (int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
    }
}
