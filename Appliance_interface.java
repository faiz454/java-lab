interface Tv{
    void turn_on();
}
class Tv1 implements Tv{
    public void turn_on(){
        System.out.println("Tv is turning on");
    }
}
class Appliance_interface{
    public static void main(String args[]){
        Tv1 obj=new Tv1();
        obj.turn_on();
    }
}