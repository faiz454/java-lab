//in method part part we should take public mandatory because we dont have parent class
class Run extends Thread{ //child or thread class
    public void running(){
        for (int i=1;i<5;i++){
            System.out.println("running....."+i);
        try{
            Thread.sleep(5000);//2000 means 2 seconds if 5000 means 5seconds
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
class Running_threads{
    public static void main(String args[]){
        Run obj=new Run();
        obj.running();
    }
}