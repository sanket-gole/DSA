package Binary_search_tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_Search_tree_1 {

        static  class  Node{
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
            }
        }
        public static Node insert(Node root,int val){
            if(root==null){
                return new Node(val);
            }
            if(root.data>val){
                root.left=insert(root.left,val);
            }else{
                root.right=insert(root.right,val);
            }
            return root;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static boolean search(Node root,int key) {
            if (root == null) {
                return false;
            }
            if (root.data==key){
                return true;
            }
            boolean left1=false;
            boolean right = false;
            if (root.data > key) {
                left1 = search(root.left, key);
            } else {
                 right = search(root.right, key);
            }
            return left1 || right;
        }

        public static Node delete(Node root,int val){
            if(root.data<val){
                root.right=delete(root.right,val);
            }else if(root.data>val){
                root.left=delete(root.left,val);
            }else {
                if(root.left==null && root.right==null){
                    return null;
                }
                if(root.left==null ){
                    return root.right;
                }else if(root.right==null){
                    return root.left;
                }
                Node IS=findInOrderSuccesor(root.right);
                root.data= IS.data;
                root.right=delete(root.right,IS.data);

            }
            return root;
        }
        public static Node findInOrderSuccesor(Node root){
            while (root.left!=null){
                root=root.left;
            }
            return root;
        }

        public static void printInRange(Node root,int k1,int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1 && root.data<=k2){
                printInRange(root.left,k1,k2);
                System.out.print(root.data+" ");
                printInRange(root.right, k1, k2);
            }else if(root.data<k1){
              printInRange(root.left,k1,k2);


            }else {
                printInRange(root.right,k1,k2);


            }
        }
        public static void pathLeafNode(Node root, List<List<Integer>>l,List<Integer>l2){
            if(root==null){
              return;
            }
            l2.add(root.data);

            if(root.left==null && root.right==null){
                l.add(new ArrayList<>(l2));
            }else{
                pathLeafNode(root.left,l,l2);
                pathLeafNode(root.right,l,l2);
            }

                 l2.remove(l2.size()-1);
        }

        public static boolean isValidBST(Node root,Node min ,Node max){
            if(root==null){
                return true;
            }
            if(min!=null && root.data<=min.data){
                return false;
            }else if(max!=null && root.data>=max.data){
                return false;
            }
            return  isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
        }

        public static Node createMirror(Node root){
            if(root==null){
                return null;
            }
            Node leftMirror=createMirror(root.left);
            Node rightMirror=createMirror(root.right);
            root.left=rightMirror;
            root.right=leftMirror;
            return root;

        }

        //Sorted Array to bamanced BST
    public static Node creatBST(int arr[],int st,int end){
            if(st>end){
                return null;
            }
            int mid=(st+end)/2;
            Node root=new Node(arr[mid]);
            root.left=creatBST(arr,st,mid-1);
            root.right=creatBST(arr,mid+1,end);
            return root;

    }




    public static void main(String[] args) {
//        //o(H) time complexity in worst in o(n) in skewed tree
//            int values[]={5,1,3,4,2,7};
//            Node root=null;
//        for (int i = 0; i <values.length ; i++) {
//            root=insert(root,values[i]);
//        }
////        inorder(root);
////        System.out.println(search(root,11));
//
////        printInRange(root,1,7);
//        List<List<Integer>> l=new ArrayList<>();
//        List<Integer>l2=new ArrayList<>();
//        pathLeafNode(root,l,l2);
//        System.out.println(l);
//        if(isValidBST(root,null,null)){
//            System.out.println("valid");
//        }

        //Sorted Array to bamanced BST
        int arr[]={3,5,6,8,10,11,12};
        Node root1=creatBST(arr,0,arr.length-1);
      //  preorder(root1);
    }
}
