public class Butterfly {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=row;k>i;k--){
                System.out.print(" ");
            }
            for(int l=i;l<row;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
