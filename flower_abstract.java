abstract class Flowers{
    String flower_name;
    public abstract void flower_details();
}
class Rose extends Flowers{
    public void flower_details() {
        this.flower_name="Rose";
        System.out.println("       Flower_Details");
        System.out.println("-----------------------------");
        System.out.println("Flower name is  : "+flower_name);
        System.out.println("Flower colour is: Red");
        System.out.println("Flower price is :15RS");
        System.out.println("Flower size is  :big");
        System.out.println("Flower smell is :nice");
    }
}
    public class flower_abstract {
    public static void main(String[]args){
        Rose obj=new Rose();
        obj.flower_details();
    }
}