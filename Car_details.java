abstract class Details_car{
    public  void  Car(){}
}
class Car1 extends Details_car{
    public void Car_details(){
        String m= "Fortuner";
        String n="Toyota";
        String b="5000000";
        String v="NEPAL";
        String c="Adarsh ";
        String x="Drift";

        System.out.println("Car Name is "+m);
        System.out.println("-----------------");
        System.out.println("Car Company is "+n);
        System.out.println("Car Price is "+b);
        System.out.println("Car Loation is "+v);
        System.out.println("Car Owner is "+c);
        System.out.println("Car Sound is "+x);

    }
}
class Car_detailos {
    public static void main(String[]args){
        Car1 obj= new Car1();
        obj.Car_details();
    }
}