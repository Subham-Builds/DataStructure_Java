import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // char input;
        int a = 3;
        int b = 4;
        Scanner sc = new Scanner(System.in);
        char input;
        while(true)
        {
            System.out.println("Enter operator");
            input = sc.next().charAt(0);

            if(input == '?')
            {
                System.out.println("Terminating....");
                break;
            }

        
        switch(input) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Enter again");
        }
        }
    


    }
}
