import java.util.*;
class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            
        }
}
class Solution{
    public static void Merge(List<ListNode> al){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
     
        for (ListNode node : al) {
            ListNode current = node;
            while (current != null) {
                pq.add(current.data);
                current = current.next;
            }
        }
    
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
    }
    public static ListNode insertBegin(ListNode head,int data){
        ListNode NewNode=new ListNode(data);
        NewNode.next=head;
        return NewNode;
    }
    public static ListNode EndBegin(ListNode head,int data){
        ListNode NewNode =new ListNode(data);
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=NewNode;
        return head;
    }
    public static ListNode insert(ListNode head,int data){
        ListNode newNode=new ListNode(data);
        ListNode current=head;
        if(head==null)
        {
            head=newNode;
        }
        else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        return head;
    }
    public static void DeleteBegin(ListNode head){
        ListNode current=head;
        current=current.next;
        head=current;
    }
    public static void DeleteEnd(ListNode head){
        ListNode current=head;
        ListNode ptr=current;
        while(current.next!=null){
            ptr=current;
            current=current.next;
        }
        ptr.next=null;
    }
    public static void delete(ListNode head,int data){
        ListNode current=head;
        ListNode pre=current;
        while(current!=null){
            if(current.data==data){
                break;
            }
            pre=current;
            current=current.next;
        }
       pre.next=current.next;
    }
    public static void print(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void reversePrint(ListNode head){
        ListNode current=head;
        Stack<Integer> stack=new Stack<>();
        while(current!=null){
            stack.push(current.data);
            current=current.next;
        }
        System.out.println("Reverse order");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
}
public class ListSll{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        ListNode head1=null;
        ListNode head2=null;
        System.out.println("Enter the size for 1");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            head1=Solution.insert(head1,x);
        }
        System.out.println("Enter the size for 1");
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            head2=Solution.insert(head2,x);
        }
        List<ListNode> al=new ArrayList<>();
        al.add(head1);
        al.add(head2);
        Solution.Merge(al);
    }
}


