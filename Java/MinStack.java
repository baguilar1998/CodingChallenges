/*
A stack implementation that keeps track
of the minimal element 
*/
class MinStack {
    
    private Stack<Integer>helper,minHistory;
    private int size;
    
    public MinStack() {
        helper = new Stack<Integer>();
        minHistory = new Stack<Integer>();
        size=0;
    }
    
    public void push(int x) {
        helper.push(x);
        if(size==0)minHistory.push(x);
        else if(x==minHistory.peek())minHistory.push(x);
        else if(x<minHistory.peek())minHistory.push(x);
        ++size;
    }
    
    public void pop() {
        int num = helper.pop();
        if(num==minHistory.peek())minHistory.pop();
        --size;
    }
    
    public int top() {
        return helper.peek();
    }
    
    public int getMin() {
        return minHistory.peek();
    }
    

}
