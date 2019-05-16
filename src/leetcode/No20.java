package leetcode;

import java.util.HashSet;
import java.util.Stack;

public class No20 {
    //有效的括号
    /*public boolean isValid(String s) {
        s.replace("()","").replace("{}","").replace("[]","");
        return !s.isEmpty();
    }*/
    public boolean isValid(String s) {
        Stack<Character> sList = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c=='('||c=='{'||c=='['){
                sList.push(c);
                continue;
            } else if(c==')'&&!sList.isEmpty()&&sList.peek()=='('){
                sList.pop();
            } else if(c=='}'&&!sList.isEmpty()&&sList.peek()=='{'){
                sList.pop();
            } else if(c==']'&&!sList.isEmpty()&&sList.peek()=='['){
                sList.pop();
            } else {
                return false;
            }
        }
        
        if(!sList.isEmpty()){
            return false;
        }
        return true;
    }

    /*public boolean isValid(String s) {
        Stack<Character> sList = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!sList.isEmpty()&&(c==']'&&sList.peek()=='['||
                                  c=='}'&&sList.peek()=='{'||
                                  c==')'&&sList.peek()=='(')){
                sList.pop();
            }else if(c=='('||c=='['||c=='{'){
                sList.push(c);
            }else {
                return false;
            }
        }
        if(!sList.isEmpty()){
            return false;
        }
        return true;
    }*/

}
