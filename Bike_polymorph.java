import java.io.*;
class Vehicles{
    public void bike_details(){
        System.out.println("Bike details");
    }
}
class bike1 extends Vehicles{
    @Override
    public void bike_details(){
        System.out.println("bike name  bullet");
        System.out.println("bike company  royal enfield");
        System.out.println("bike price  4 lakhs");
    }
}
class bike2 extends Vehicles{
    @Override
    public void bike_details(){
        System.out.println("bike name  hyness");
        System.out.println("bike company  honda");
        System.out.println("bike price  7 lakhs");
    }
}
class bike3 extends Vehicles{
    @Override
    public void bike_details(){
        System.out.println("bike name  gixxer");
        System.out.println("bike company  suzuki");
        System.out.println("bike price  5 lakhs");
    }
}
class Bike_polymorph {
    public static void main(String args[]) {
        bike1 obj= new bike1();
        obj.bike_details();
        System.out.println("----------------------");
        bike2 obj1=new bike2();
        obj1.bike_details();
        System.out.println("-----------------------");
        bike3 obj2=new bike3();
        obj2.bike_details();
        System.out.println("-----------------------");
    }
}