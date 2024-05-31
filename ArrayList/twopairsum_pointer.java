import java.util.ArrayList;

public class twopairsum_pointer {

    public static boolean twopair(ArrayList<Integer> h, int target){
        int lp = 0;
        int rp = h.size()-1;
        while(lp != rp){
            //c1
            if(h.get(lp)+h.get(rp) == target){
                return true;
            }
            if(h.get(lp)+h.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        //must be sorted
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        System.out.println(twopair(h,5));
    }
}