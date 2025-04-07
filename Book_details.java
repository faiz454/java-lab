import java.util.Scanner;

class Book{
    public void book1(){
        System.out.println("Book Details");
        System.out.println("------------");
    }
}
class Det extends Book{
    public void det1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Book Name");
        String a=s.nextLine();
        System.out.println("Enter Book Author");
        String b=s.nextLine();
        System.out.println("Enter book price");
        int c=s.nextInt();
        System.out.println("Book Name: "+a);
        System.out.println("Book Author: "+b);
        System.out.println("Book Price: "+c);
    }
}
class Book_details{
    public static void main(String args[]){
        Det obj=new Det();
        obj.book1();
        obj.det1();
    }
}