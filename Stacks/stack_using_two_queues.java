package Stacks;
import java.util.*;

public class stack_using_two_queues {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        while(true){
            System.out.println("1.push\n2.pop\n3.exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element to insert");
                    int x = sc.nextInt();
                    push(q1, q2, x);
                    System.out.println(q1);
                    System.out.println(q2);
                    break;
                case 2:
                    pop(q1, q2);
                    System.out.println(q1);
                    System.out.println(q2);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void push(Queue<Integer> q1, Queue<Integer> q2, int x){
        if(q2.isEmpty()){
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public static void pop(Queue<Integer> q1, Queue<Integer> q2){
        if(q1.isEmpty() && q2.isEmpty()){
            System.out.println("No elements");
            return;
        }

        if(q2.isEmpty()){
            while(q1.size() != 1){
                q2.add(q1.remove());
            }
            int x = q1.remove();
            System.out.println("Removed successfully: " + x);
        } else {
            while(q2.size() != 1){
                q1.add(q2.remove());
            }
            int x = q2.remove();
            System.out.println("Removed successfully: " + x);
        }
    }
}
