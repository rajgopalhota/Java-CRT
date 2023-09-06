package Stacks;
import java.util.*;
public class Next_greater_element_circular {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the elements");
        int n=sc.nextInt();
        System.out.println("Enter the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer>stack=new Stack<>();
        int nge[]=new int[n];
        for(int i=(2*n-1);i>=0;i--){
            while(stack.empty()==false&&(stack.peek()<=arr[i%n])){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                   nge[i%n]=-1; 
                }
                else{
                    nge[i%n]=stack.peek();
                }
            }
            stack.push(arr[i%n]);
        }
        System.out.println(Arrays.toString(nge));
    }
}
