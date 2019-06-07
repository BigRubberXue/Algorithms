package leetcode;
class No115 {
    Stack<Integer> date = new Stack<>();
    Stack<Integer> min = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    public void push(int x) {
        date.push(x);
        if(min.empty()||x<=min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        int i = date.peek();
        date.pop();
        if(i==min.peek()){
            min.pop();
        }
    }
        
    public int top() {
        return date.peek();
    }
    
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */