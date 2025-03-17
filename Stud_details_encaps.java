//encapsulation only for private modifier
//student details using getter and setter methods in encapsulation
class Stud{
    private String a;
    private static int stud_id=100;
    public int getId(){//getter method for id
        return stud_id;
    }
    public String getName(){//getter method for name
        return a;
    }
    public void setName(String a){
        this.a=a;
    }
}
class Stud_details_encaps{
    private static int stud_id=100;
    public static void main(String args[]){
        Stud obj=new Stud();
//        System.out.println("Student id: "+stud_id);
//        System.out.println("Student name: "+obj.getName());
        System.out.println("Student id: "+obj.getId());
        obj.setName("Faiz");//set value of name variable
        System.out.println("Student name: "+obj.getName());
    }
}