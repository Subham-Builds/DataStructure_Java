class number{
    int real;
    int img;
    number(int real,int img)
    {
        this.real = real;
        this.img = img;
    }
    public static number add(number n1 , number n2)
    {
        number res = new number(0, 0);
        res.real = n1.real + n2.real;
        res.img = n1.img + n2.img;
        return res;
    }
    public void show()
    {
        System.out.println(this.real +" "+this.img);
    }
}

public class inheritance {
    public static void main(String[] args) {
        number n1 = new number(1,2);
        number n2 = new number(1, 7);
        number n3 = n1.add(n1,n2);
        n3.show();
        // System.out.println(n1.real);

    }
}
