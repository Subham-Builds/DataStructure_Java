import java.util.ArrayList;

public class waters_2pointer {
    public static int pointerapproach(ArrayList<Integer> h) {
        int max = 0;
        int lp = 0;
        int rp = h.size() - 1;

        while (lp < rp) {
            int ht = Math.min(h.get(lp), h.get(rp));
            int wd = rp - lp;
            int current = ht * wd;
            max = Math.max(max, current);
            // update pointer
            if (h.get(lp) < h.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(7);
        System.out.println("Max Volume of water : " + pointerapproach(h));
    }
}