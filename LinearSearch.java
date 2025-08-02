import java.util.*;

class LinearSearch 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,2,1,3,45,35,46,2143,124,4234,5,23,4};
        int target=23;
        System.out.println(linearsearch(arr,target));
    }
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length<=0)
        {
            return -1;
        }        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return arr[i];
            }
        }
        return -1;
    }

}
