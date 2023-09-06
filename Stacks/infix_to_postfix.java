package Stacks;
import java.util.*;

public class infix_to_postfix {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string expression");
    String exp=sc.nextLine();
    infix_to_postfix(exp);
   }
   public static void infix_to_postfix(String exp){
        Stack<Character>stack=new Stack<>();
        String str="";
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){   
                str=str+ch;
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    str=str+stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&(getPriority(ch)<=getPriority(stack.peek()))){
                    str=str+stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            str=str+stack.pop();
        }
        System.out.println(str);
   }
   public static int getPriority(char ch){
    if(ch=='^'){
        return 3;
    }
    else if(ch=='/'||ch=='*'){
        return 2;
    }
    else if(ch=='-'||ch=='+'){
        return 1;
    }
    return -1;
   }
}
