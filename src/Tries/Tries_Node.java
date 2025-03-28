package Tries;

public class Tries_Node {

    static class Node{
        Node[] children=new Node[26];
        boolean eow=false;

        public Node() {
            for (int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for (int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key){
        Node curr=root;
        for (int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }
    public static void printWord(Node curr,StringBuilder prefix){
        if(curr.eow){
            System.out.println(prefix.toString());
        }
        for (int i=0;i<26;i++){
            if(curr.children[i]!=null){
                char ch=(char) ('a'+i);
                prefix.append(ch);
                printWord(curr.children[i],prefix);
                prefix.deleteCharAt(prefix.length()-1);
            }
        }
    }

    public static boolean wordBreak(String key){
        for (int i=1;i<=key.length();i++){
           if( search(key.substring(0,i))&& wordBreak(key.substring(i))){
               return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key="ilikesamsung";
    }
}
