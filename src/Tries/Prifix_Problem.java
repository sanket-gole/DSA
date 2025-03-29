package Tries;

public class Prifix_Problem {

   static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        int frq;

        public Node(){
            for (int i=0;i<children.length;i++){
                children[i]=null;
            }
            frq=1;
        }
    }

    public static Node root=new Node();

   public static void  insert(String word){
       Node curr=root;
       for (int i=0;i<word.length();i++){
           int idx=word.charAt(i)-'a';
           if(curr.children[idx]==null){
               curr.children[idx]=new Node();
           }else{
               curr.children[idx].frq++;
           }
           curr=curr.children[idx];


       }
       curr.eow=true;
   }

   public static void findPrifix(Node root,String ans){
       if(root==null){
           return;
       }
       if (root.frq==1){
           System.out.println(ans);
           return;
       }
        for (int i=0;i<26;i++){
            if(root.children[i]!=null){
                findPrifix(root.children[i],ans+(char)(i+'a'));
            }
        }
   }
    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};

        for (int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.frq=-1;
        findPrifix(root,"");
    }
}
