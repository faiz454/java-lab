class Parent{
    void dad(){
        System.out.println("I'm Parent");
    }
}
class Child extends Parent{
    void kid(){
        System.out.println("I'm Child");
    }
}
class inheritance{
    public static void main(String args[]){
        Child obj=new Child();
        obj.kid();
    }
}