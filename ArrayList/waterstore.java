import java.util.ArrayList;

public class waterstore {
    //brute force approach
    public static int store(ArrayList<Integer> h){
        int maxwater = 0;
        for(int i = 0; i<h.size(); i++){
            for(int j = i+1; j<h.size(); j++){
                int height = Math.min(h.get(i), h.get(j));
                int width = j-i;
                int currwater = height*width;
                maxwater = Math.max(maxwater, currwater);
            }
        }
        return maxwater;
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
        System.out.println("Max Volume of water : " + store(h));
    }
}
