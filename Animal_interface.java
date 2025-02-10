interface Animal{
    void sound();
}
class Cat implements Animal{
    public void sound(){
        System.out.println("meow");
    }
}
class Animal_interface{
    public static void main(String args[]){
        Cat obj=new Cat();
        obj.sound();
    }
}
