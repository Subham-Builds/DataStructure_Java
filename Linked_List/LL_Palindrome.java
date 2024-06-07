public class LL_Palindrome {
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
    //find mid using slow fast pointer approach
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //palindrome
    public boolean ispalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //finding mid node
        Node midn = findmid(head);
        //reversing from mid
        Node prev = null;
        Node curr = midn;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        Node right = prev;
        Node left = head;
        //check left half and right half
        while(right != null){
            if(left.data !=  right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public static void main(String[] args) {
        LL_Palindrome ll = new LL_Palindrome();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        // ll.addlast(1);
        ll.print();
        System.out.println(ll.ispalindrome());
    }
}
