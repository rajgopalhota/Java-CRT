package BTS;
import java.util.*;
import java.util.LinkedList;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Zig_zag_traversal {
    public static void zigzag_traversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        int flag=1;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            while(size-->0){
                Node cur=queue.poll();
                if(flag%2==0){
                    if(cur.left!=null){
                        queue.add(cur.left);
                    }
                    if(cur.right!=null){
                        queue.add(cur.right);
                    }
                }
                else{
                    if(cur.right!=null){
                        queue.add(cur.right);
                    }
                    if(cur.left!=null){
                        queue.add(cur.left);
                    }
                }
                System.out.print(cur.data+" ");
            }
            System.out.println();
            flag=flag^1;
        }

    }
    public static void main(String args[]){
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        zigzag_traversal(root);
    }
}



// import java.util.*;
// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>>res=new ArrayList<>();
//         if(root==null){
//             return res;
//         }
//         Queue<TreeNode>queue=new LinkedList<>();
//         queue.add(root);
//         int flag=0;
//         while(!queue.isEmpty())
//         {
//             int size=queue.size();

//             ArrayList<Integer>al=new ArrayList<>();
//             while(size-->0){
//                 TreeNode node=queue.poll();
//                 if(node.left!=null){
//                     queue.add(node.left);
//                 }
//                 if(node.right!=null){
//                     queue.add(node.right);
//                 }
//                 al.add(node.val);
//             }

//             if(flag==1){
//                 Collections.reverse(al);
//                 res.add(al);
//             }
//             else{
//                 res.add(al);
//             }
//             flag=flag^1;
//         }
//         return res;
//     }
// }
