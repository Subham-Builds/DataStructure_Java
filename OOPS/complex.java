class com{
    int real;
    int img;
    public com(int real, int img){
        this.real = real;
        this.img = img;
    }
    public static com add(com c1, com c2){
        com res = new com(0, 0);
        res.real = c1.real + c2.real;
        res.img = c1.img + c2.img;
        return res;
    }
    public static com sub(com c1, com c2){
        com res = new com(0, 0);
        res.real = c1.real - c2.real;
        res.img = c1.img - c2.img;
        return res;
    }
}
public class complex {
    public static void main(String[] args) {
        com c1 = new com(1, 2);
        com c2 = new com(2,9);
        com result = com.add(c1, c2);
        com result1 = com.sub(c1, c2);
        System.out.println("Sum: " + result.real + " + " + result.img + "i");
        System.out.println("Sub: " + result1.real + " + " + result1.img + "i");

    }
}
