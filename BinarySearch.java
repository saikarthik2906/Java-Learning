import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target=10;
        System.out.println(binarysearch(arr,target));

    }
    static int binarysearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        int s=0;
        int e=arr.length-1;
        

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(target<arr[mid])
            {
                e=mid-1;
            }
            if(target>arr[mid])
            {
                s=mid+1;

            }
            if(arr[mid]==target)
            {
                return mid;
            }
        }

        return -1;

    }
}
