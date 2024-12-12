public class P3 {
    /*
     * 1 2 3 4 5
     * 2 3 4 5 6
     * 3 4 5 6 7 
     * 4 5 6 7 8
     * 5 6 7 8 9
     */
    public static void main(String[] args) {
        int count;
        for(int i=0;i<5;i++){
            count=i+1;
            for(int j=0;j<5;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
