//only the error we given first in try only will get executed
//finally will work
class exception2{
     public static void main(String[] args) {
// syntax of array: int[] arr={};
         try {
             int[] array = {1,2,3,4,5};
             System.out.println("my array" + array[8]);
             int i=2;
             int v=0;
             int div=i/v;
             System.out.println("div"+div);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("there is only 4 index position so it is error"+e);
         }
         catch (ArithmeticException e){
             System.out.println("zero error"+e);
         }
         finally{
             System.out.println("Both errors are solved");
         }
    }
}