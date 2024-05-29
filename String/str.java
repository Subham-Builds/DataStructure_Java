import java.util.Arrays; 
class str{
    public static void main(String[] args) {
        int flag = 0;
        String str = "hello";
        String str1 = "lleoh";
        char[] ar = str.toCharArray();
        char[] ar2 = str1.toCharArray(); 
        Arrays.sort(ar);
        Arrays.sort(ar2);
        for(int i = 0; i<ar.length; i++){
            if(ar[i] == ar2[i]){
                flag = 1;
                continue;
            }
            else{
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NO");
        }


    }
}