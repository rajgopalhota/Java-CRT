package BTS;
import java.util.ArrayList;
import java.util.Stack;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Lowest_ancestor_of_bt {
    public static ArrayList<Integer> path(Node root, int target) {
        if (root == null) {
            return null;
        }
        
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                al.add(root.data);
                if (al.get(al.size() - 1) == target) {
                    return al;
                  
                }
                root = root.left;
            } else {
                Node temp = stack.peek();
                if (temp.right == null) {
                    stack.pop();
                    al.remove(al.size() - 1);
                }
                root = temp.right;
            }
        }
        return al;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
        ArrayList<Integer>al1=path(root, 4);
        ArrayList<Integer>al2=path(root, 6);
        int common=0;
        for(int i=0;(i<al1.size()&& i<al2.size());i++){
            if(al1.get(i)==al2.get(i)){
                common=al1.get(i);
            }else{
                break;
            }
        }
        System.out.println(common);
        
    }
}
