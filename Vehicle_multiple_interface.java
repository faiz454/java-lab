//Multiple infaces
interface Veihcles1{
    void vehical_details1();
}
interface Vehicals2{
    void vehical_details2();
}
class  Car4 implements Veihcles1{
    public void vehical_details1() {
        System.out.println("====VEHICALES_DETAILS====");
        System.out.println("-------------------------");
        System.out.println("Car name          : Swift Dzire");
        System.out.println("Car company       : Suzike");
        System.out.println("Car Price         : 10Lakes");
        System.out.println("Car Owner Details : Raghav K");
        System.out.println("----------------------------");
    }
}
class Car5 implements Vehicals2{
    public void vehical_details2() {
        System.out.println("====VEHICALES_DETAILS====");
        System.out.println("-------------------------");
        System.out.println("Car name          : Swift Dzire");
        System.out.println("Car company       : Suzike");
        System.out.println("Car Price         : 10Lakes");
        System.out.println("Car Owner Details : Raghav K");
        System.out.println("----------------------------");
    }
}
public class Vehicle_multiple_interface{
    public static void main(String[]args){
        Car4 obj=new Car4();
        obj.vehical_details1();
        Car5 obj1=new Car5();
        obj1.vehical_details2();
}
}