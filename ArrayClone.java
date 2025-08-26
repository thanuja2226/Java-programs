public class ArrayClone {
    public static void main(String[] args) {
        int a[]={10,20,30};
        int[] b=a.clone();//clone is directtly copy the dublicate value using clone
        b[1]=200;
        System.out.println(a[1]);
    }
}
