package Binary_tress;

import java.util.*;

public class preorder_code {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;

        }
    }
    static class BinartTree{
         static int idx=-1;
        public static Node buildTree(int nodes[]){
             idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }
        // Level order

        public static void levelOreder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> que=new LinkedList<>();
            que.add(root);
            que.add(null);
            while (!que.isEmpty()){
                Node curr= que.remove();
                if (curr==null){
                    System.out.println();
                    if(que.isEmpty()){
                        break;
                    }else {
                        que.add(null);
                    }
                }else {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        que.add(curr.left);
                    }
                    if(curr.right!=null){
                        que.add(curr.right);
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
            int leftCount=count(root.left);
            int rightCount=count(root.right);
            return leftCount+rightCount+1;
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
            if(root==null){
                return 0;
            }
            int leftDiam=diameter(root.left);
            int leftHt=height(root.left);
            int rightDiam=diameter(root.right);
            int rightHt=height(root.right);
            int selfDiam =leftHt+rightHt+1;
            return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
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
            if(root==null){
                return new Info(0,0);
            }
          Info leftInfo=diameter1(root.left);
          Info rightInfo=diameter1(root.right);
          int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+ rightInfo.ht+1);
          int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
          return new Info(diam,ht);
        }

        public static boolean isIdentical(Node node,Node subRoot){
            if(node==null && subRoot==null){
                return true;
            }else  if(subRoot==null || node==null || node.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(node.left,subRoot.left)){
                return false;
            }
            if(!isIdentical(node.right,subRoot.right)){
                return false;
            }
            return true;
        }

        public static boolean isSubtree(Node root,Node subRoot){
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root,subRoot)){
                    return true;
                }
            }
            boolean leftAns= isSubtree(root.left,subRoot);
            boolean rightAns=isSubtree(root.right,subRoot);
            return leftAns || rightAns;

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
            int min = 0,max=0;
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

                              map.put(curr.hd, curr.node);



                    if(curr.node.left!=null){
                        q.add(new Info1(curr.node.left,curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }
                    if(curr.node.right!=null){
                        q.add(new Info1(curr.node.right,curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                    }
                }

            }
            for (int i = min; i <=max ; i++) {
                System.out.print(map.get(i).data+" ");
            }

        }
        public static void kLevel(Node root,int level,int k){
              if(root==null){
                  return;
              }
              if(level==k){
                  System.out.println(root.data+" ");
                  return;
              }
              kLevel(root.left,level+1,k);
              kLevel(root.right,level+1,k);
        }

        public static boolean getPath(Node root,int n,ArrayList<Node> path){
            if(root==null){
                return false;
            }
            path.add(root);
            if (root.data==n){
                return true;
            }
           boolean foundLeft= getPath(root.left, n, path);
           boolean foundRight= getPath(root.right, n, path);
           if(foundLeft || foundRight){
               return true;
           }
           path.remove(path.size()-1);
           return false;
        }


        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node>path1=new ArrayList<>();
            ArrayList<Node>path2=new ArrayList<>();
            getPath(root,n1,path1);
            getPath(root,n2,path2);
            
            int i=0;
            for(;i< path1.size() && i< path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            return path1.get(i-1);
        }
//

        public static Node lca2(Node root,int n1,int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }
            Node leftLca=lca2(root.left,n1,n2);
            Node rightLca=lca2(root.right, n1, n2);

            if(rightLca==null){
                return leftLca;
            }
            if(leftLca==null){
                return rightLca;
            }
            return root;
        }

        //
        public static int lcaDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==0){
                return 0;
            }
            int leftDist=lcaDist(root.left,n);
            int rightDist=lcaDist(root.right,n);

            if(leftDist==-1 && rightDist==-1){
                return -1;
            }else if(leftDist==-1){
                return rightDist+1;
            }else {
                return leftDist+1;
            }
        }

        public static int minDist(Node root,int n1,int n2){
            Node lca=lca2(root,n1,n2);
            int dist1=lcaDist(lca,n1);
            int dist2=lcaDist(lca,n2);

            return dist1+dist2;
        }

        public static int KAncestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=KAncestor(root.left,n,k);
            int rightDist=KAncestor(root.right,n,k);
            if(leftDist==-1 && rightDist==-1){
                return -1;
            }
            int max=Math.max(leftDist,rightDist);
            if(max+1==k){
                System.out.println(root.data);
            }
            return max+1;
        }

        public static int  trnasformSum(Node root){
            if(root==null){
                return 0;
            }
            int leftChild=trnasformSum(root.left);
            int rightChild=trnasformSum(root.right);

            int data= root.data;
            root.data=root.left.data+leftChild+root.right.data+rightChild;
            return data;
        }

    }



    public static void main(String[] args) {
//        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinartTree tree=new BinartTree();
//        Node root=tree.buildTree(nodes);
////        System.out.println(root.data);
////       tree.preOrder(root);
////        System.out.println();
////        tree.inOrder(root);
////        System.out.println();
////        tree.postOrder(root);
////        tree.levelOreder(root);
//       int a= tree.nodeSum(root);
//        System.out.println(a);

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

//        Node subRoot=new Node(2);
//        subRoot.left=new Node(4);
//        subRoot.right=new Node(3);
//        System.out.println(isSubtree(root,subRoot));
      //  topView(root);
//        kLevel(root,1,2);

    }
}
