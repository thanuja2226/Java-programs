import java.util.Scanner;
public class Two_D_Array_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        //reading matrix
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            int sum=0;
            for(int j=0;j<c;j++)
            {
                sum+=mat[i][j];
            }
             System.out.println(sum);
        }
       
    } 
}
