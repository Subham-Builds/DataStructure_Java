
public class Remove_cycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public void print(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    
     //logic
    public static void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return;
        }
        //meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cyclew
        prev.next = null;
    } 
    public static void main(String[] args) {
        head = new Node(1);
        Node temp= new Node(2);
        head.next = temp;
        head.next.next = new Node(5);
        head.next.next.next = temp;
        //1>2>3>2
    }
}
