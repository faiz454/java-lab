//method overloading
public class Overload{
    public int meth1(int a,int b){
        return a+b;
    }
    public float meth1(float a,float b){
        return a+b;
    }
    public double meth1(double a,double b){
        return a+b;
    }
    public String meth1(String a,String b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println("Method overloading");
        System.out.println("--------------------");
        Overload obj=new Overload();
        System.out.println(obj.meth1(50,50));
        System.out.println(obj.meth1(60,50));
        System.out.println(obj.meth1(10000,10500));
        System.out.println(obj.meth1("Muhd"," Faiz"));

    }
}