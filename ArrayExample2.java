public class ArrayExample2 {
     public static void main(String[] args)
     {
        //hoow to initialize an array 
        int[] arr={10,20,30,40,50};
                  //0,1,2,3,4,5
        //lenght of arry can be obtained using arr_name. length
        System.out.println(arr.length );//finding length
        System.out.println(arr[5]);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i + "-->" + arr[i]);
        }
        //System.out.println(arr[6]);//it gives the error ->out of bounds error

        String[] name={"Thanuja ","lalitha ","mohana","teju"};
        for(int i=((name.length)-1);i>=0;i--)
        {
            System.out.println(i + "-->" + name[i]);
        }
        System.out.println(name.length);//giving the length of the string
        System.out.println(name[2]);//prints the second name;

     }
}
