interface Fruit{
    void Fruit_name();
    void Fruit_colour();
    void Fruit_price();
    void Fruit_shape();
    //String a="Mango";
    //String b="yellow";
    //String c="40/kg";
    //String d="oval";
}
class F1 implements Fruit{
    public void Fruit_name(){
        String a="Mango";
        System.out.println("FRUIT DETAILS");
        System.out.println("-------------");
        System.out.println("Fruit name: "+a);
    }
    public void Fruit_colour(){
        String b="yellow";
        System.out.println("Fruit colour: "+b);
    }
    public void Fruit_price(){
        String c="40/kg";
        System.out.println("Fruit price: "+c);
    }
    public void Fruit_shape(){
        String d="oval";
        System.out.println("Fruit shape: "+d);
    }
}
class Fruit_interface{
    public static void main(String args[]){
        F1 obj=new F1();
        obj.Fruit_name();
        obj.Fruit_colour();
        obj.Fruit_price();
        obj.Fruit_shape();
    }
}
