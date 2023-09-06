package BTS;
import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
public class construct_unique_bt_with_Inorder_postOrder {
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public static void constructUniqueBt(int inorder[],int postorder[]){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=construction(postorder,postorder.length-1,0,inorder,
                                                        0,inorder.length-1,map);
        inorder(root);
    }
    public static TreeNode construction(int postorder[],int postend,int poststart,
            int inorder[],int instart,int inend,Map<Integer,Integer>map){
        if(poststart>postend||instart>inend){
            return null;
        }  
        TreeNode root=new TreeNode(postorder[postend]);
        int inroot=map.get(root.value);
        int gap=inroot-instart;
        root.left=construction(postorder, postend, postend-gap, inorder, instart, inroot-1, map);
        root.right=construction(postorder, poststart-gap-1, poststart, inorder, inroot+1, inend, map);

        return root;
    }
    public static void main(String args[]){
        int inorder[]={};
        int postorder[]={};
        constructUniqueBt(inorder, postorder);
    }
}
