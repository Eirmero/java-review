public class Homework29 {
    public static void main(String[] args) {
        int YHTrangle[][] = new int[10][10];
        YHTrangle[0][0] = 1;

        for(int i=1; i<10; i++){
            for(int j=0; j<=i; j++){
                if (j==0){
                    YHTrangle[i][j] = 1;
                }
                else{
                    YHTrangle[i][j] = YHTrangle[i-1][j] + YHTrangle[i-1][j-1];
                }
                System.out.print(YHTrangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
