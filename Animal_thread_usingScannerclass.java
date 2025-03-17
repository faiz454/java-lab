import java.util.Scanner;
class Animl extends Thread{
    public void animal(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter animal1 name");
        String a = s.nextLine();
        System.out.println("Enter animal1 colour");
        String b = s.nextLine();
        System.out.println("Enter animal1 age");
        int c = s.nextInt();
        System.out.println("Enter animal1 price");
        int d = s.nextInt();
        s.nextLine(); // Consume leftover newline

        System.out.println("Enter animal2 name");
        String e = s.nextLine();
        System.out.println("Enter animal2 colour");
        String f = s.nextLine();
        System.out.println("Enter animal2 age");
        int g = s.nextInt();
        System.out.println("Enter animal2 price");
        int h = s.nextInt();
        s.nextLine(); // Consume leftover newline

        System.out.println("Enter animal3 name");
        String i = s.nextLine();
        System.out.println("Enter animal3 colour");
        String j = s.nextLine();
        System.out.println("Enter animal3 age");
        int k = s.nextInt();
        System.out.println("Enter animal3 price");
        int l = s.nextInt();
        s.nextLine(); // Consume leftover newline

        System.out.println("Enter animal4 name");
        String m = s.nextLine();
        System.out.println("Enter animal4 colour");
        String n = s.nextLine();
        System.out.println("Enter animal4 age");
        int o = s.nextInt();
        System.out.println("Enter animal4 price");
        int p = s.nextInt();
        s.nextLine(); // Consume leftover newlineff

        System.out.println("Enter animal5 name");
        String q = s.nextLine();
        System.out.println("Enter animal5 colour");
        String r = s.nextLine();
        System.out.println("Enter animal5 age");
        int z = s.nextInt();
        System.out.println("Enter animal5 price");
        int t = s.nextInt();


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
        System.out.println("Animal Age: "+z);
        System.out.println("Animal Price: "+t);
    }
}
class Animal_thread_usingScannerclass{
    public static void main(String args[]){
        Animl obj=new Animl();
        obj.animal();
    }
}