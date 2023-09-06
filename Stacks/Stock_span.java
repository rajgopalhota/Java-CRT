package Stacks;
import java.util.*;
public class Stock_span {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=new int[n];
        res=calculate_stock_span(arr);
        System.out.println("The resultant array");
        System.out.println(Arrays.toString(res));
    }

    public static int[] calculate_stock_span(int arr[]){
        int res[]=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        res[0]=1; 
        for(int i=1;i<arr.length;i++){
            while((!stack.isEmpty())&&(arr[stack.peek()]<=arr[i])){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=i+1;
            }
            else{
                res[i]=i-stack.peek();
            }
            stack.push(i);
        }

        return res;
    }
}



// class StockSpanner {
//     Stack<int[]> s;
//       public StockSpanner() {
//           s = new Stack<>();
//       }
//       public int next(int price) {
//           int span=1;
//           while(!s.isEmpty() && price>=s.peek()[0]){
//               span+=s.peek()[1];
//               s.pop();
//           }
//           s.push(new int[]{price,span});
//           return span;
//       }
//   }
