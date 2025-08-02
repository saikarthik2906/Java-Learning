
import java.util.*;
public class ReverseArr
{
    public static void main(String[] arg)  
    {
        Scanner scan = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6}; 
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    static void reverse(int[] arr)
    {
        int start=0;
        int end =arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr,int start,int end)
    {
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
