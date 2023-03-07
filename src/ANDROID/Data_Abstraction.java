package ANDROID;

class students{
    private String name;
   private int roll;

    students(){

    }
    students(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
 }


public class Data_Abstraction {
    public static void main(String[] args) {
        students s = new students("Ashish", 1);
        System.out.println(s.getName());
        System.out.println(s.getRoll());
    }
}