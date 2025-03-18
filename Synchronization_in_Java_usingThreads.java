//if we have 5 threads we can get output in an order is known as synchronization
class Printer{  //parent class
    synchronized void message(String msg){
        System.out.print("["+msg);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class MyThread extends Thread{  //child or thread class
    Printer print_msg;
    String msg;

    MyThread(Printer print_msg,String msg){  //child constructor
        this.print_msg = print_msg;
        this.msg = msg;
    }
    public void run(){
        print_msg.message(msg);
    }
}
class Synchronization_in_Java_usingThreads{
    public static void main(String args[]){
        Printer p=new Printer();
        MyThread m1=new MyThread(p,"Hello");
        MyThread m2=new MyThread(p,"Hi");
        MyThread m3=new MyThread(p,"I'm");
        MyThread m4=new MyThread(p,"Faiz");
        MyThread m5=new MyThread(p,"Hello!!!!!!!!!!!!!!!");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}