abstract class Animal1{
    public abstract void sound();
}
class Dog1 extends Animal1{
    public void sound(){
        System.out.println("barking");
    }
}
class cat extends Animal1{
    public void sound(){
        System.out.println("meow");
    }
}
class Animal_abstarction{
    public static void main(String args[]){
        Dog1 obj=new Dog1();
        obj.sound();
        cat obj1=new cat();
        obj1.sound();
    }
}