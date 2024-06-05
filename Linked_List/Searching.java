public class Searching {
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
    public int search(int key){
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return index;
            }else{
                temp = temp.next;
                index++;
            }
        }
        //null case me
        return -1;
    }
    public static void main(String[] args) {
        Searching ll = new Searching();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        System.out.println(ll.search(3));


    }
}
