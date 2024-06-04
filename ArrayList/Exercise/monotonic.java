import java.util.ArrayList;

public class monotonic {
    public static boolean check(ArrayList<Integer> a){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i<a.size(); i++){
            for(int j = i+1; j<a.size(); j++){
                if(a.get(i)>a.get(j))
                {
                    inc = false;
                }
                if(a.get(i)<a.get(j)){
                    dec = false;
                }
            }
        }
        return inc || dec;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(2);
        h.add(2);
        h.add(3);
        System.out.println(check(h));

        
    }
}
