public class ArrayBubleShort {
    public static void main(String[] args) {
        int[] a ={36,19,29,5,12};
        int temp;
        for (int i = 0; i < a.length; i++) {
            int flag = 0 ;
            System.out.print(a[i]+" ");
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                     temp = a[j];
                     a[j] = a[j+1];
                     a[j+1]= temp;
                     flag = 1;


                }
               
                
            }
            if(flag==0){
                break;
            }
            
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        // Buble Short In String Method

        String[] b = {"deepak","amit","veronica","zebra","marcus"};
        String tempr;

        for (int i = 0; i < b.length; i++) {
            
            int flag =0;
            for (int j = 0; j < b.length-1-i; j++) {
                if (b[j].compareTo(b[j+1]) > 0) {
                    tempr = b[j];
                    b[j] = b[j+1];
                    b[j+1] = tempr;
                    flag = 1;
                }
                
            }
            if (flag==0) {
                break ;
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }


    }
}
