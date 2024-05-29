public class Constructer {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Subham");
        Student s3 = new Student(122);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;

    //Constructer intitialized/Called
    public Student()//non parameterised
    {
        System.out.println("INTITIALIZED");
    }
    Student(String name)
    {
        this.name = name;
        //to use the 'name' in the function 'this' is used
    }
    Student(int roll){
        this.roll = roll;
    }
}
