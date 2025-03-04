//map is same as dictionary which has key value pair
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class maps{
    public static void main(String args[]){
        Map<String,Integer>countries=new HashMap<>();//creating empty map
        System.out.println("COUNTRY DETAILS: ");
        System.out.println("----------------");
        countries.put("India",1);
        countries.put("UK",2);
        countries.put("Russia",3);
        System.out.println("Countries: "+countries);
        for(Map.Entry<String,Integer>entry:countries.entrySet()){
            System.out.println("countries: "+entry.getKey()+":"+entry.getValue());
        }



    }
}
