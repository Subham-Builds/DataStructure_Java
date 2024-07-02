public class reverse_string{
    public static void reverse(String str){
        java.util.Stack<Character> s = new java.util.Stack<>();
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder res = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            res.append(curr);
        }
        str = res.toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverse(str);
    }
}