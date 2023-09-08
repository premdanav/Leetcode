class MinStack {
     Stack<Integer> stack;
        Stack<Integer> minStack;

    public MinStack() {
       stack=new Stack<Integer>();
       minStack=new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            if(stack.peek().equals(minStack.peek())){
                minStack.pop();
            }
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }else
        {
            throw new RuntimeException("stack is empty");
        }
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }else{
            throw new RuntimeException("minStack is empty");
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */