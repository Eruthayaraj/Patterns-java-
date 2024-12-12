public class Dimond {
    /*
     *    *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
*********************
 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */
    public static void main(String[] args) {
        int row=3;
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int l=1;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<row-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<row-1;k++){
                System.out.print("*");
            }
           for(int m=i+1;m<row-1;m++){
            System.out.print("*");
           }
            System.out.println();
        }
    }
}
