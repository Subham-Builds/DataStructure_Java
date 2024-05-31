import java.util.ArrayList;

public class twopairsum_2 {
    public static boolean pair_twosum_2(ArrayList<Integer> h, int target){
        int bp = 0;
        int n = h.size();
        for(int i = 0; i<h.size(); i++){
            if(h.get(i)>h.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        //Time Complexity: O(n)
        while(lp != rp){
            if(h.get(rp)+h.get(lp) == target){
                return true;
            }
            if(h.get(rp)+h.get(lp)<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        //must be sorted
        h.add(11);
        h.add(5);
        h.add(6);
        h.add(8);
        h.add(9);
        h.add(10);
        System.out.println(pair_twosum_2(h,16));
    }
}