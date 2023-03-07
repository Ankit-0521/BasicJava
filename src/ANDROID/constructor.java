package ANDROID;
class addition{
    public void sum(int a, int b){
        System.out.println(a + b);
    }
    public void sum(float a, float b){
        System.out.println(a + b);
    }
    public void sum(int... ar)
    {
        int sum = 0;
        for (int a : ar) {
        sum += a;
        }
        System.out.println(sum);
    }
}
/*class bulb
{
    boolean isOn;  // data members.
    // Data functions or Methods.
    public void turnOn()
        {
        isOn = true;
        }
        public void turnoff(){
        isOn = false;
        }
}*/
/*class calculator {
     int value1;
     int value2;
        // default constructor.
        calculator(){
            value1 = 5;
            value2 = 4;
        }

         //parametrised constructor.
            calculator( int a, int b){
            value1 = a;
            value2 = b;
            }
    //sum
    public void sum(){
        System.out.println(value1+value2);
    }

    // subtract.
    public void subtract(){
        System.out.println(value1-value2);
    }
    // multiply.
    public void multiply()
    {
        System.out.println(value1*value2);
    }

    // divide.
    public void divide(){
        System.out.println(value1/value2);
    }
}


 */

 class Student {
    String name;
    int rollno;
    static int no_of_students;

          Student(String n, int r)
        {
           name = n;
           rollno = r;
           no_of_students++;
        }
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public static int getNo_of_students() {
        return no_of_students;
    }
}



public class constructor {
    public static void main(String[] args) {
      /* bulb b = new bulb();
        System.out.println(b.isOn); // default value of boolean is false.
        b.turnOn();
        System.out.println(b.isOn);
        b.turnoff();
        System.out.println(b.isOn);
       */
      /*  calculator c = new calculator(6,3);
        c.sum();
        c.subtract();
        c.multiply();
        c.divide();

       */
Student s = new Student("Ankit", 1);
Student s1 = new Student("Aamir", 2);
        System.out.println(s.getName());
        System.out.println(s.getRollno());

        System.out.println(Student.getNo_of_students());
        addition a = new addition();
        a.sum(55,10,45,22);


    }
}
