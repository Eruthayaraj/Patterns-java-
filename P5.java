public class P5 {
    /*
     *                    *
     *                   * *
     *                  * * *
     *                 * * * *
     *                * * * * *
     */

     public static void main(String[] args) {
        int i,k,j;
        int n=10;
        for(i=1;i<=n;i++){
            for(k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
}
