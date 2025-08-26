public class ArrayForEachLoop {
    public static void main(String[] args) {
        //{
        //for-each loop 
        // used to run loooop on collection 
        // directly on value
        // sentex
        //for(d_type loopvariable: collection_name)
        //body
        //}
        int a[]={10,20,30};
        for(int eachValue:a)
        {
            System.out.println(eachValue *eachValue);
        }
        String[] name={"Thanuja","lalitha","mohana","Teju"};
        //run a for each loop
        for(String eachChar:name)
        {
          System.out.println(eachChar.charAt(0));
          System.out.println(eachChar);
        }
    }
}
