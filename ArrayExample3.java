import java.util.Scanner;

public class ArrayExample3 {
   public static void main(String[] args) {
    //declare and read  length of array
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();//reading array length
//declare an array of length n
int[] arr=new int[n];
//reading array elem
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();

}
//runing the same loop to access all array 
//elementd
for(int i=0;i<n;i++)
{
  
    System.out.println(arr[i]*arr[i]);
}
String[] name=new String[n] ;
for(int i=0;i<n;i++)
{
    name[i]=sc.next();

}
for(int i=0;i<n;i++)
{
    System.out.println(name[i]);

}



   }
}
