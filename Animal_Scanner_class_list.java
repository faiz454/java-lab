import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;//* means for all
class Animal_Scanner_class_list {
    public static void main(String args[]){
        List<String>animals=new ArrayList<>();//empty list creation
        Scanner s=new Scanner(System.in);
        while(true) {
            System.out.println("Enter animal name :(type 'done' to finsh)");
            String animal = s.next();
            if(animal.equalsIgnoreCase("done")){
                break;
            }
            animals.add(animal);
        }
        System.out.println(animals);


    }
}