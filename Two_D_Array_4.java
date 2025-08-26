public class Two_D_Array_4 {
    public static void main(String[] args) {
        int[][] a={{10,20,30},{100,200,300},{1000,2000,3000}};
        //each element in 2-D array is a 1-Darray of integer
        for(int[] eachValue: a)
        {
            for(int eachValue:eachArray)
            {
                System.out.println(eachValue);
            }
        }
        String[][]names={{},{},{}};
        for(String[] eachStringArray: names)
        {
            for(String eachName:eachStringArray)
            {
                System.out.println(eachName + " ");
            }
        }
    }
}
