import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
class File_handling_car_reading_example{
    public static void main(String args[]){
        try{
            FileWriter writer=new FileWriter("D:/CAR DETAILS.txt");
            writer.write("CAR1 DETAILS\n-----------\ncarname:brezza\ncar color:blue\ncar number plate:kl55u454\ncar country:india\ncar price:1200000\nCAR2 DETAILS\n-----------\ncarname:crysta\ncar color:black\ncar number plate:kl34y3456\ncar country:india\ncar price:1340000\nCAR3 DETAILS\n-----------\ncarname:porsche\ncar color:brown\ncar number plate:kl66h8428\ncar country:india\ncar price:15700000");
            writer.close();
            System.out.println("Java OOP concept added successfully");
        }catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }try{
            FileReader reader=new FileReader("D:/CAR DETAILS.txt");
            BufferedReader bufferedReader=new BufferedReader(reader);
            String java;
            while((java=bufferedReader.readLine())!=null){
                System.out.println(java);
            }
            bufferedReader.close();
            reader.close();
        }catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}