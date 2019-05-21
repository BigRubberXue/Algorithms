package leetcode;

import java.util.Stack;

class No150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String s : tokens){
            if(s.equals("+")){
                if (stack.size()<2){
                    break;
                }     
                stack.push(stack.pop()+stack.pop());
            }else if(s.equals("-")){
                if (stack.size() < 2){
                     break;
                }     
                int x = stack.pop();
                stack.push(stack.pop()-x);
            }else if(s.equals("*")){
                if (stack.size() < 2){
                     break;
                }     
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("/")){
                if (stack.size() < 2){
                    break;
                }     
                int x = stack.pop();
                stack.push(stack.pop()/x);
            }else{
                stack.push(Integer.valueOf(s).intValue());
            }
        }
        return stack.pop();
    }
}