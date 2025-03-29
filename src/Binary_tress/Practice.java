package Binary_tress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {

    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.right=this.left=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;

        public static Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;

        }
        public static void preorder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        public static void  levelOrser(Node root){
            if (root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.println(curr.data);
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }

    public static int height(Node root){
            if(root==null){
                return 0;
            }
            int l=height(root.left);
            int r=height(root.right);
            return Math.max(l,r)+1;
    }
    public static int count(Node root){
            if(root==null){
                return 0;
            }
            return count(root.left)+count(root.right)+1;
    }


    public static int nodeSum(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=nodeSum(root.left);
            int rightSum=nodeSum(root.right);
            return leftSum+rightSum+root.data;
    }

    public static int diameter(Node root){
            if (root==null){
                return 0;
            }
            int leftHight=height(root.left);
            int rightHight=height(root.right);

            int leftDim=diameter(root.left);
            int righDim=diameter(root.right);
        int selfDim=leftHight+rightHight+1;
            return Math.max(selfDim,Math.max(leftDim,righDim));
    }

    static class Info{
            int diam;
            int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

     public static Info diameter1(Node root){
            if (root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter1(root.left);
            Info rightInfo=diameter1(root.right);
            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
            return new Info(diam,ht);
     }

     public static boolean isIdentical(Node node,Node subRoot){
            if(node==null && subRoot==null){
                return true;
            }else if(subRoot==null || node ==null ||node.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(node.left,subRoot.left)){
                return false;
            }
            if (!isIdentical(node.right,subRoot.right)){
                return false;
            }
            return true;
     }

     static class Info1{
            Node node;
            int hd;

         public Info1(Node node, int hd) {
             this.node = node;
             this.hd = hd;
         }
     }

     public static void topView(Node root){
            Queue<Info1> q=new LinkedList<>();
         HashMap<Integer,Node> map=new HashMap<>();
         int min=0;int max=0;
         q.add(new Info1(root,0));
         q.add(null);
         while (!q.isEmpty()){
             Info1 curr=q.remove();
             if(curr==null){
                 if(q.isEmpty()){
                     break;
                 }else {
                     q.add(null);
                 }
             }else {
                 map.put(curr.hd,curr.node);
                 if(curr.node.left!=null){
                     q.add(new Info1(curr.node.left,curr.hd-1));
                     min=Math.min(min,curr.hd-1);
                 }
                 if(curr.node.right!=null){
                     q.add(new Info1(curr.node.right, curr.hd+1));
                     max=Math.max(max,curr.hd+1);
                 }
             }



         }
         for (int i=min;i<=max;i++){
             System.out.print(map.get(i).data+" ");
         }

     }

     public static void KLevel(Node root,int level,int k){
            if (root==null){
                return;
            }
            if(level==k){
                System.out.println(root.data);
                return;
            }
            KLevel(root.left,level+1,k);
            KLevel(root.right,level+1,k);
     }

      public static boolean getPath(Node root, int n, ArrayList<Node> path){
            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }
            boolean foundleft=getPath(root.left,n,path);
            boolean foundRight=getPath(root.right,n,path);
            if(foundleft || foundRight){
                return true;
            }
            path.remove(path.size()-1);
            return false;
      }

















    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(tree.diameter(root));
    }
}
