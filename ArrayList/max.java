import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(9);
        l1.add(3);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<l1.size(); i++){
            if(l1.get(i)>max){
                max = l1.get(i);
            }
        }
        System.out.println("Largest: "+max);
    }
}
