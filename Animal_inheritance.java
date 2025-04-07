class Animal{
    public void Dog(){
        System.out.println("the dog is barking");
    }
}
class Child1 extends Animal{
    public void Cat(){
        System.out.println("the cat is meowing");
    }
}
class Child2 extends Child1{
    public void Frog(){
        System.out.println("the frog is krrrrrrrrrrrrrrrrrrrr");
    }
}
class Animal_inheritance{
    public static void main(String args[]){
         Child2 obj=new Child2();
        obj.Dog();
        obj.Cat();
        obj.Frog();
    }
}
