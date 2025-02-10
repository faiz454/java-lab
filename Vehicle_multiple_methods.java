interface Vehicles{
    void vehicle_det1();
    void vehicle_det2();
}
class Cwar implements Vehicles{
    public void vehicle_det1(){
        System.out.println("Car_detail");
        System.out.println("----------");
        System.out.println("Car name: vitara brezza");
        System.out.println("Car company: suzuki");
        System.out.println("Car price: 40 lakh");
        System.out.println("car owner: FAIZ");
    }
    public void vehicle_det2(){
            System.out.println("----------");
            System.out.println("Car name:Innova Crysta");
            System.out.println("Car company: Toyota");
            System.out.println("Car price: 60 lakh");
            System.out.println("car owner: FAIZ");
    }
}
class Vehicle_multiple_methods{
    public static void main(String args[]){
        Cwar obj=new Cwar();
        obj.vehicle_det1();
        obj.vehicle_det2();
    }
}