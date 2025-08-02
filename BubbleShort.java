import java.util.*;
class BubbleShort
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,324,24,5,223,4,2};
        BubbleShort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleShort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;    
                    boolean a = true ;             
                }
            }
        }
    }
}