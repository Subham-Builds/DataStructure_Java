public class LL_addn_size {
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
    //addfirst
    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    //addlast
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
    public void addindex(int inx, int data){
        if(inx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while(i<inx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String args[]){
        LL_addn_size l1 = new LL_addn_size();
        l1.print();
        l1.addfirst(2);
        l1.print();
        l1.addfirst(1);
        l1.print();
        l1.addlast(3);
        l1.print();
        l1.addlast(4);
        l1.print();
        l1.addindex(1, 3);
        l1.print();
        System.out.println("The size of Linked List is : "+l1.size);

    }
}
