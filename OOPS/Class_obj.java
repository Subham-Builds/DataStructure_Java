public class Class_obj {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //create a pen object called p1
        p1.setC("Blue");
        System.out.println(p1.color);
        //bankAC
        bankac myAC = new bankac();
        myAC.username = "USERNAME";
        myAC.setPassword("pwsdasda");
    }
}
class bankac
{
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }
}
class Pen{
    String color;
    int tip;

    void setC(String newColor)
    {
        color = newColor;
    }
    void setT(int newTip)
    {
        tip = newTip;
    }
}

