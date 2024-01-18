public class getter_setter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setC("Blue");
        System.out.println(p1.getC());
        p1.setT(13);
        System.out.println(p1.getT());
    }
}
class Pen{
    private String color;
    private int tip;
    //getter
    String getC()
    {
        return this.color;
    }
    int getT()
    {
        return this.tip;
    }
    //setter
    void setC(String newColor)
    {
        color = newColor;
    }
    void setT(int newTip)
    {
        tip = newTip;
    }
}