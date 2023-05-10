import java.lang.*;

class While

{
    public static void main(String arg[])
     {  int n = 5;
        int  i = 0;
       
        while(i< n){
                 int j = 0;
              while(j< n){
                      
                    System.out.println(" * ");
                     j++;
                     //System.out.println("\t");
                }
                
                i++;
                System.out.println();

            }
      }
}




import java.lang.*;

 public class While1 {

     public static void main(String[] args){
          int x = 1; 
          System.out.println("Before the loop: ");
          while (x <= 4){
              System.out.println("In the loop: ");
              System.out.println("Value of X is : " + x);
               x = x + 1;                
          }
          System.out.println("This is After the loop ");
     }
 }






public class WhileB {
    public static void main(String[] args) {
        int i = 1;
        while (i<100) {
            System.out.println(i);
            i = i * 2;
        }
        int ii =1;
        do{
            System.out.println(ii);
            ii = ii * 2;
        }
        while(ii<100);
}

}
