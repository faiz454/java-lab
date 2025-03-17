//in method part we should take public mandatory because we dont have parent class
class Runn extends Thread{ //child or thread class
    public void running(){
        int i=1;
        while(i<5)  {
            System.out.println("running....."+i);
            i++;
            try{
                Thread.sleep(2000);//2000 means 2 seconds if 5000 means 5seconds
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Running_threadsusing_whileloop{
    public static void main(String args[]){
        Runn obj=new Runn();
        obj.running();
    }
}