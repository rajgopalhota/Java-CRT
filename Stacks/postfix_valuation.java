package Stacks;
import java.util.*;
public class postfix_valuation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the postfix expression");
        String exp=sc.nextLine();
        int res=postfix_evaluation(exp);
        System.out.println(res);

    }
    public static int postfix_evaluation(String exp){
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else{
                int operand1=stack.pop();
                int operand2=stack.pop();
                switch(ch){
                    case '+':stack.push((operand2+operand1));
                        break;
                    case '-':stack.push((operand2-operand1));
                        break;
                    case '*':stack.push((operand2*operand1));
                        break;
                    case '/':stack.push((operand2/operand1));
                        break;
                }
            }

        }
        return stack.pop();
    }
}



