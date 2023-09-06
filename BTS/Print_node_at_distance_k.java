package BTS;
import java.util.*;

class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Print_node_at_distance_k {
    public static void parent_node(Node root, Map<Node, Node> parent) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur.left != null) {
                queue.add(cur.left);
                parent.put(cur.left, cur);
            }
            if (cur.right != null) {
                queue.add(cur.right);
                parent.put(cur.right, cur);
            }
        }
    }
    
    public static void printNode(Node root, Node target, int k) {
        if (root == null || k < 0) {
            return;
        }
        
        Map<Node, Node> parent = new HashMap<>();
        parent_node(root, parent);
        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(target);
        visited.put(target, true);
        int level = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            if (level == k) {
                printCurrentLevel(queue);
                return;
            }
            
            level++;
            
            while (size-- > 0) {
                Node cur = queue.poll();
                
                if (cur.left != null && visited.get(cur.left) == null) {
                    queue.add(cur.left);
                    visited.put(cur.left, true);
                }
                if (cur.right != null && visited.get(cur.right) == null) {
                    queue.add(cur.right);
                    visited.put(cur.right, true);
                }
                if (parent.get(cur) != null && visited.get(parent.get(cur)) == null) {
                    queue.add(parent.get(cur));
                    visited.put(parent.get(cur), true);
                }
            }
        }
    }
    
    public static void printCurrentLevel(Queue<Node> queue) {
        for (Node node : queue) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
        
        Node target = root.left.right;
        int k = 2;
        printNode(root, target, k);
    }
}
