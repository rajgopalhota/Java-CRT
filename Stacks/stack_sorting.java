package Stacks;

import java.util.*;

public class stack_sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        Stack<Integer>stack=new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        Stack<Integer>temp=new Stack<>();
        while(!stack.isEmpty()){
            if(temp.isEmpty()){
                temp.push(stack.pop());
            }
            else{
                if(stack.peek()>=temp.peek()){
                    while(!stack.isEmpty()&&(stack.peek()>=temp.peek())){
                        temp.push(stack.pop());
                    }
                }
                else{
                    int x=stack.pop();
                    while(!temp.isEmpty()&&(temp.peek()>x)){
                        stack.push(temp.pop());
                    }
                    temp.push(x);
                }

            }
        }
        while(!temp.isEmpty()){
            System.out.print(temp.pop()+" ");
        }
    }
}
