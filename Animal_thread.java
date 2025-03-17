class Animal extends Thread{
    public void animal(){
        String a="Tiger";
        String b="Orange";
        int c=10;
        int d=10000;

        String e="Lion";
        String f="Yellow";
        int g=13;
        int h=100000;

        String i="Leopard";
        String j="Pale yellow";
        int k=15;
        int l=1000000;

        String m="Deer";
        String n="dark brown";
        int o=9;
        int p=100000;

        String q="Bear";
        String r="Brown";
        int s=14;
        int t=10000000;

    System.out.println("Animal Name: "+a);
    System.out.println("Animal Color: "+b);
    System.out.println("Animal Age: "+c);
    System.out.println("Animal Price: "+d);
    System.out.println("\n");

    System.out.println("Animal Name: "+e);
    System.out.println("Animal Color: "+f);
    System.out.println("Animal Age: "+g);
    System.out.println("Animal Price: "+h);
    System.out.println("\n");

    System.out.println("Animal Name: "+i);
    System.out.println("Animal Color: "+j);
    System.out.println("Animal Age: "+k);
    System.out.println("Animal Price: "+l);
    System.out.println("\n");

    System.out.println("Animal Name: "+m);
    System.out.println("Animal Color: "+n);
    System.out.println("Animal Age: "+o);
    System.out.println("Animal Price: "+p);
    System.out.println("\n");

    System.out.println("Animal Name: "+q);
    System.out.println("Animal Color: "+r);
    System.out.println("Animal Age: "+s);
    System.out.println("Animal Price: "+t);
    }
}
class Animal_thread{
    public static void main(String args[]){
        Animal obj=new Animal();
        obj.animal();
    }
}