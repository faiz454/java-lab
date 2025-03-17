abstract class Vehicle2{
    public abstract void bike();
}
class bike4 extends Vehicle2 {
    public void bike() {
        System.out.println("converted abstract to normal");
    }
}
public class vehicle_abstract{
    public static void main(String args[]){
        bike4 obj=new bike4();
        obj.bike();
    }
}