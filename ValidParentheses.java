class Stack {
    char data;
    Stack next;
    Stack top;
    void push(char da){
        Stack newNode = new Stack();
        newNode.data = da;
        newNode.next = top;
        top = newNode;
    }
    void pop() {
        top = top.next; 
    }
    char peek() {
        return top.data;
    }
    boolean isEmpty(){
        if(top!=null){
            return false;
        }
        return true;
    }
}
class ValidParentheses {
    public static void main (String[] args) {
        String exp = "{[([])]}";
        Stack s = new Stack();
        for(int i = 0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else if (ch==']'&&s.peek()=='['||ch==')'&&s.peek()=='('||ch=='}'&&s.peek()=='{') {
                s.pop();
            } else {
                System.out.print("This is wrong expression...");
                break;
            }
        }
        if(s.isEmpty()){
            System.out.print("This is correct expression..."); 
        }
    }
}
