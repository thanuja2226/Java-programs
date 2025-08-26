import java.util.Scanner;
public class Two_D_Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //dimension
        int r= sc.nextInt();//rows
        int c=sc.nextInt();//colums
        int[][] mat=new int[r][c];
        //reading values into matrix
        for(int i=0;i<r;i++)
        {
             for(int j=0;j<c;j++)
             {
                mat[i][j]=sc.nextInt();
             }
        }
         //assining the elements
         // run on rows
        for(int i=0;i<r;i++)
        {
            //run on colum
             for(int j=0;j<c;j++)
             {
                System.out.println(mat[i][j] * mat[i][j] + " ");
             }
        }
        System.out.println();


    }

    
}
