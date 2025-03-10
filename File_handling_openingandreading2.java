import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
class File_handling_openingandreading2{
    public static void main(String args[]){
        try{
            FileReader read2=new FileReader("D:\\JAVA OOP.txt");
            BufferedReader bufferedReader=new BufferedReader(read2);
            String java;
            while((java=bufferedReader.readLine())!=null){
                System.out.println(java);
            }
            bufferedReader.close();
            read2.close();
        } catch(IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}