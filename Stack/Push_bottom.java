public class Push_bottom {
    public static void pushatbottom(java.util.Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatbottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
