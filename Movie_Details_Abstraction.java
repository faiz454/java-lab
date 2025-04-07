abstract class Movie_details{
    public abstract void movie_det();
}
class Names extends Movie_details{
    @Override
    public void movie_det(){
        System.out.println("Movie Details");
        System.out.println("-------------");
        System.out.println("1.L2:E.M.P.U.R.A.A.N");
        System.out.println("2.Lucifer");
        System.out.println("3.Raayan");
    }
}
class Movie_Details_Abstaction{
    public static void main(String args[]){
        Names obj=new Names();
        obj.movie_det();
    }
}