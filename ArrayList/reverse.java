import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        //logic
        for(int i = l1.size()-1; i>=0; i--){
            System.out.print(l1.get(i)+" ");
        }
    }
}
