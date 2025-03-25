import java.util.Scanner;
class Students{
    private String S_id;
    private String S_name;
    Students(String S_id,String S_name){
        this.S_id=S_id;
        this.S_name=S_name;
    }
    public String getId(){
        return S_id;
    }
    public String getName(){
        return S_name;
    }
}
class Attendance{
    private Students studs;
    private boolean present;

    Attendance(Students studs,boolean present){
        this.studs=studs;
        this.present=present;
    }
    public boolean isPresent(){
        return present;
    }
    public void checkAttendance(){
        if(present){
            System.out.println("StudentId: "+studs.getId());
            System.out.println("StudentName: "+studs.getName());
            System.out.println("Student status: present");
        }else{
            System.out.println("StudentId: "+studs.getId());
            System.out.println("StudentName: "+studs.getName());
            System.out.println("Student status: Absent");
        }
    }
}


class Student_attendence_synchronization{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student id");
        String a0=s.nextLine();
        System.out.println("Enter student name");
        String b0=s.nextLine();
        System.out.println("Enter Student id");
        String a3=s.nextLine();
        System.out.println("Enter student name");
        String b3=s.nextLine();
        System.out.println("Enter Student id");
        String a5=s.nextLine();
        System.out.println("Enetr name");
        String b5=s.nextLine();

        Students s1=new Students(a0,b0);
        Students s2=new Students(a3,b3);
        Students s3=new Students(a5,b5);


        Attendance a1=new Attendance(s1,true);
        Attendance a2=new Attendance(s2,false);
        Attendance a8=new Attendance(s3,true);

        int p=0;
        if(a1.isPresent()){
            p++;
        }
        if(a2.isPresent()){
            p++;
        }
        if(a8.isPresent()){
            p++;
        }

        a1.checkAttendance();
        a2.checkAttendance();
        a8.checkAttendance();

        System.out.println("The total no of presentees are: "+p);

    }
}