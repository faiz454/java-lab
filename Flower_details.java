abstract class flower{
    String flower_name;
    String flower_color;
    String flower_size;
    String flower_price;
    String flower_smell;
    public abstract void flowers_details(); //abstract method
}
class rose1 extends flower{
    public void flowers_details(){
        this.flower_name="Rose";
        this.flower_color="red";
        this.flower_price="15rs";
        this.flower_size="15cm";
        this.flower_smell="good";
        System.out.println("flowers details");
        System.out.println("this is "+this.flower_name);
        System.out.println("this is "+this.flower_color);
        System.out.println("this is "+this.flower_size);
        System.out.println("this is "+this.flower_price);
        System.out.println("this is "+this.flower_smell);
    }
}

public class Flower_details {
    public static void main(String[]args){
        rose1 y=new rose1();
        y.flowers_details();

    }
}