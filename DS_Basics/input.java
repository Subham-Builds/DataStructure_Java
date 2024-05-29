import java.util.*;

class input{
    public static int area(int radius)
    {
        int area1 = 3 * radius * radius;
        return area1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        //newline
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(name);

        // sc.nextInt();
        int num = sc.nextInt();
        System.out.println(num);
        //calling area function
        System.out.println(area(3));
        sc.close();
    }
}