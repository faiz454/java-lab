import java.util.List;
import java.util.ArrayList;
class List1{
    public static void main(String args[]){
        List<String>list=new ArrayList<>();
        list.add("Faiz");
        list.add("Faa");
        list.add("Fah");
        list.add("Khan");
        System.out.println("FRUITS DETAILS");
        System.out.println("--------------");
        System.out.println(list);

        for (String names:list)
        {
        System.out.println(names);
        }
        //accessing element
        String find_fruit=list.get(1);
        System.out.println("using index "+find_fruit);
        //remove element
        list.remove("Faa");
        System.out.println("by removing the remaining elements list "+list);


        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("--------------------");
        System.out.println("Numbers from 1 to 5");
        System.out.println("-------------------");
        System.out.println(list2);
        for (int integers:list2)
        {
            System.out.println(integers);
        }
        System.out.println("-----------");
        int find_num=list2.get(3);
        System.out.println("using index "+find_num);
        list2.remove(4);
        System.out.println("after removing the elements "+list2);
    }
}