import java.util.Scanner;
class Book_det{
    void head(){
        System.out.println("Book_Details");
        System.out.println("-------------");
    }
    synchronized void bk(String book){

        System.out.print("["+book);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class thread extends Thread{
    Book_det print_bk;
    String book;

    thread(Book_det print_bk,String book){
        this.print_bk=print_bk;
        this.book=book;

    }
    public void run(){
        print_bk.bk(book);
    }
}
class Book_details_Synchronization{
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter book name");
        String a=s.nextLine();
        System.out.println("Enter book author");
        String c=s.nextLine();
        System.out.println("Enter book publish date");
        String d=s.nextLine();
        System.out.println("Enter book price");
        int e=s.nextInt();
        Book_det b=new Book_det();
        b.head();
        thread a1=new thread(b,"book_name: "+a);
        thread a2=new thread(b,"book_author: "+c);
        thread a3=new thread(b,"book_publish_date: "+d);
        thread a4=new thread(b,"book_price: "+e);

        a1.start();
        a2.start();
        a3.start();
        a4.start();

    }
}