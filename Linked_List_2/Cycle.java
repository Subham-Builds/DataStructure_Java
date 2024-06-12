public class Cycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    //logic Starts
    public static boolean iscycle(){
        Node Slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null){
            Slow = Slow.next;
            fast = fast.next.next;
            if(Slow == fast){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = head;
        System.out.println(iscycle());
    }
}
