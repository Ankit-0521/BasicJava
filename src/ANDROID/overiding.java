package ANDROID;
class Animal{
    public void sound(){
        System.out.println("I make Sound");
    }
}
class Stud implements Person {
        @Override
    public void setname(){

        }

    @Override
    public void setage() {

    }
}

class Dogs extends Animal {
     @Override
    public void sound(){
         System.out.println("I make dog sound");
    }
}
public class overiding {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sound();
    }
}
