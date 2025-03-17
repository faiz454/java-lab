abstract class Dog2{
    public abstract void dog_details();
}
class Dog3 extends Dog2{
    public void dog_details(){
        String dog_name="  keaton";
        String dog_breed="  lab";
        String dog_price="  10000";
        String dog_location="  kerala";
        String dog_owner="  Faiz";



        System.out.println("dog details");
        System.out.println("------------");
        System.out.println("Dog name          :"+dog_name);
        System.out.println("Dog breed         :"+dog_breed);
        System.out.println("Dog price         :"+dog_price);
        System.out.println("Dog location      :"+dog_location);
        System.out.println("Dog owner details :"+dog_owner);
    }
}
class dog_det{
    public static void main(String args[]){
        Dog3 obj=new Dog3();
        obj.dog_details();
    }
}