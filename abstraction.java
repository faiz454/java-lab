//hiding internal details is abstraction
//example: phone call
//abstract method don't have body whereas normal has a body
//in abstarct we can use abstract keyword
//point what is diff btw abstarction and normal class
abstract class Animal{//parent class  //abstract class
    public abstract void sound();//abstract method
}
class Dog extends Animal{//child class
    public void sound(){//normal method
        System.out.println("converted abstract method to normal method");
    }
}




public class abstraction{
    public static void main(String args[]){
        Dog obj=new Dog();
        obj.sound();
    }
}