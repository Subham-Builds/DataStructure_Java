import java.util.ArrayList;
public class Arraylist_stack {
    static class Stack{
        private ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public void push(int data){
            list.add(data);
            //last me add krta h
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
