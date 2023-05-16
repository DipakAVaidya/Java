public class ArrayTraverse {
    public static void main(String[] args) {

         
        int[] a ={10,20,30,40};

        // Normal Araay Traversal  using forLopp:
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();


        // Travers Array Using ForEach loop:
        for (int x : a) {
            System.out.print(x+" ");
        }
        System.out.println(" ");




          // Traversal 2d Array using for
        int[][] b ={{10,20,40},{30,50,60,}};

          for(int i = 0; i< b.length; i++){
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
          }

          // Travers 2D Array Using ForEach
         
         



          // Traversal 3d Array using for

          int[][][] c ={{{40,60,50},{10,20,30,},{70,80},{90,100}}}; 
          for(int i = 0; i<c.length; i++){
            for(int j = 0; j<c[i].length; j++){
                for(int k = 0; k < c[i][j].length; k++){
                    System.out.print(c[i][j][k]+" ");
                }
                System.out.println(" ");
            }

          }
          





    }

    
}
