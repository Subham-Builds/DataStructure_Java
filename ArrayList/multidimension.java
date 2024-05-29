import java.util.ArrayList;

public class multidimension {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainL = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        //adding
        for(int i = 1; i<=5; i++){
            l1.add(i*1); //1,2,3,4,5
            l2.add(i*2); //2,4,6,8,10
        }
        //merging
        mainL.add(l1);
        mainL.add(l2);
        System.out.println(mainL);

        //Printing using for loop
        for(int i = 0; i<mainL.size(); i++){
            ArrayList<Integer> current = mainL.get(i);
            for(int j = 0; j<current.size(); j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }

    }
}
