import java.util.LinkedList;
public class Linked_list_JF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        //printing
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
