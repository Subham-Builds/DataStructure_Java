public class LL_Deletion{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
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
    }
    //remove first 
    public int delete_first(){
        if(size == 0){
            System.out.println("Size is 0");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
            
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //remove last
    public int remove_last(){
        if(size == 0){
            System.out.println("Size is 0");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
            
        }
        //traversal
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }
    public static void main(String[] args) {
        LL_Deletion ll = new LL_Deletion();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        ll.delete_first();
        ll.print();
        
        System.out.println(ll.remove_last());
        ll.remove_last();
        ll.print();

    }
}