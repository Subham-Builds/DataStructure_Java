import java.util.ArrayList;

public class swap {
    //you can make function:
    // public static void swap(ArrayList<Integer> l1, int i1, int i2){
    //     int temp = l1.get(i1);
    //     l1.set(i1, l1.get(i2));
    //     l1.set(i2, temp);
    // }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(9);
        l1.add(3);
        l1.add(5);
        //swapping
        //swapping index 1 and 3
        int temp = l1.get(1);
        l1.set(1, l1.get(3));
        l1.set(3, temp);
        System.out.println(l1);
    }
}
