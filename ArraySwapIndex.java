import java.util.*;
public class ArraySwapIndex 
{
    public static void main(String[] arg)  
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};  
        int index1=scan.nextInt();
        int index2=scan.nextInt();
        swap(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
