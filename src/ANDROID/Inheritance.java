package ANDROID;
class person1{
    String name;
    int age;
    person1(){
        System.out.println("In person class");
    }
    person1(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("In parametrised constructor");
    }
    public  void displayinfo(){
        System.out.println(this.name+" "  +this.age);
    }
}
class Stu extends person1{
    static int marks;
    Stu(){
        super("Niloy", 2);
        System.out.println("In stu class");
    }
    public  void displaymarks(){
        //System.out.println(super.name+" " +super.age);
        System.out.println(this.marks);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Stu s = new Stu();
    s.name="Ankit";
    s.age=1;
    s.marks=90;
    s.displayinfo();
    s.displaymarks();
    }
}
