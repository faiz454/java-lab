class Child extends Thread{
    public void run(){
        System.out.println("run method");
    }
}
class Main_thread{
    public static void main(String args[]){
        Child obj=new Child();
        obj.run();
    }
}