interface Employee1{
    void employee1_det();
}
interface Employee2{
    void employee2_det();
}
interface Employee3{
    void employee3_det();
}
interface Employee4{
    void employee4_det();
}
interface Employee5{
    void employee5_det();
}
class Emp1 implements Employee1{
    public void employee1_det(){
        System.out.println("Employee 1 details");
        System.out.println("------------------");
        System.out.println("Emp id: 001");
        System.out.println("Emp name: Faiz");
        System.out.println("Emp salary: 90k/month");
        System.out.println("Emp location: Kerala");
        System.out.println("Emp company: Wipro");
    }
}
class Emp2 implements Employee2{
    public void employee2_det(){
        System.out.println("------------------");
        System.out.println("Employee 2 details");
        System.out.println("------------------");
        System.out.println("Emp id: 002");
        System.out.println("Emp name: Fahadh");
        System.out.println("Emp salary: 1 lakh/month");
        System.out.println("Emp location: Kerala");
        System.out.println("Emp company: Google");
    }
}
class Emp3 implements Employee3{
    public void employee3_det(){
        System.out.println("------------------");
        System.out.println("Employee 3 details");
        System.out.println("------------------");
        System.out.println("Emp id: 003");
        System.out.println("Emp name: Fahmin");
        System.out.println("Emp salary: 80k/month");
        System.out.println("Emp location: Kerala");
        System.out.println("Emp company: Microsoft");
    }
}
class Emp4 implements Employee4{
    public void employee4_det(){
        System.out.println("------------------");
        System.out.println("Employee 4 details");
        System.out.println("------------------");
        System.out.println("Emp id: 004");
        System.out.println("Emp name: Khanif");
        System.out.println("Emp salary: 1.5 lakh/month");
        System.out.println("Emp location: Kerala");
        System.out.println("Emp company: Samsung");
    }
}
class Emp5 implements Employee5{
    public void employee5_det(){
        System.out.println("------------------");
        System.out.println("Employee 5 details");
        System.out.println("------------------");
        System.out.println("Emp id: 005");
        System.out.println("Emp name: Iqbal");
        System.out.println("Emp salary: 2 lakh/month");
        System.out.println("Emp location: Kerala");
        System.out.println("Emp company: Intel");
    }
}
class employee_details_using_multiple_interfaces_in_java {
    public static void main(String args[]){
        Emp1 obj1=new Emp1();
        obj1.employee1_det();
        Emp2 obj2=new Emp2();
        obj2.employee2_det();
        Emp3 obj3=new Emp3();
        obj3.employee3_det();
        Emp4 obj4=new Emp4();
        obj4.employee4_det();
        Emp5 obj5=new Emp5();
        obj5.employee5_det();
    }
}
