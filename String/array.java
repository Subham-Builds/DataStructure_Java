public class array {
    public static void main(String[] args) {
        // int flag = 0;
        // int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
       int[] digits = {9};
        int carry = 1; // Start with a carry of 1 to add 1 to the number

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + carry > 9) {
                digits[i] = (digits[i] + carry) % 10;
                carry = 1; // Set carry to 1 for the next iteration
            } else {
                digits[i] += carry;
                carry = 0; // No more carry needed if addition is within single digit
            }
        }
        for(int i = 0; i<digits.length; i++){
            System.out.println(digits[i]);
        }
    }
}
