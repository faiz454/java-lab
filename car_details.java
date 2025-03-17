abstract class Vehicle{
    String car_name=" Vitara Brezza";
    String car_price=" 30 lakhs";
    String car_company=" Suzuki";
    String car_location=" Kerala";
    String car_owner=" Faiz";
    public abstract void car_details();
}
class car extends Vehicle{
    public void car_details(){
        System.out.println("CAR DETAILS");
        System.out.println("------------");
        System.out.println("Car name      :"+car_name);
        System.out.println("Car price     :"+car_price);
        System.out.println("Car company   :"+car_company);
        System.out.println("Car location  :"+car_location);
        System.out.println("Car owner     :"+car_owner);
    }
}
class car_detals{
    public static void main(String args[]){
        car obj=new car();
        obj.car_details();
    }
}