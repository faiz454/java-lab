import java.io.*;
interface Car{
    //public abstract void start();//abstract method
    void start();// interface method
    void move();//interface method2
}
class Car1 implements Car{ //implement interface class
    public void start(){ //normal method
        System.out.println("CAR ACTIONS");
        System.out.println("------------");
        System.out.println("step 1:car is starting");
    }
    public void move(){//normal method 2
        System.out.println("step 2:car is moving");
    }
    public void stop(){
        System.out.println("step 3:car is stopping");
    }
}
class Interfaces{
    public static void main(String args[]){
        Car1 obj=new Car1();
        obj.start();
        obj.move();
        obj.stop();
    }
}
