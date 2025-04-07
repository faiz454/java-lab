class Movie{
    public void Movie_det(){
        System.out.println("Movie Details");
        System.out.println("-------------");
    }
}
class Names extends Movie{
    public void Movie_names(){
        System.out.println("1.L2:Empuraan");
        System.out.println("2.Lucifer");
        System.out.println("3.Raayan");
    }
}
class Movie_Details_Inheritance{
    public static void main(String args[]){
        Names obj=new Names();
        obj.Movie_det();
        obj.Movie_names();
    }
}