import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class set_scannnerclass_fruits{
    public static void main(String args[]){
        Set<String>fruit=new HashSet<>();
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("enter fruit name: type 'done' to finish");
            String f=s.next();
            if(f.equalsIgnoreCase("done")){
                break;
            }
            fruit.add(f);
        }
        System.out.println("fruits: "+fruit);
    }
}