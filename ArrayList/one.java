// package ArrayList;

import java.util.ArrayList;

public class one {
    public static void main(String args[])
    {
        //declaring arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1,9);

        System.out.println(l1);
        //get elemtent
        System.out.println(l1.get(1));

        //delete  element
        // l1.remove(1);
        System.out.println(l1);

        //set element
        l1.set(1, 3);
        System.out.println(l1);

        //contain element 
        System.out.println(l1.contains(1));
        System.out.println(l1.contains(11));

        //SIZE OF arrayList
        System.out.println("The size of arraylist is: "+l1.size());
        //iterate through loop
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
    }
}
