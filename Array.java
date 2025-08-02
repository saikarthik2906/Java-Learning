import java.util.*;
class Array
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));


        //String Array

        String[] str = new String[n];
        for(int i =0;i<n;i++)
        {
            str[i]=scan.next();
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(str[i]+" ");
        }

        System.out.println();

        System.out.println(Arrays.toString(str));


        //No Fixed Column

        int[][] arr2d = {
            {2,3,4,5},
            {3,4},
            {3}
        };

        for(int row =0;row<arr2d.length;row++)
        {
            for(int j=0;j<arr2d[row].length;j++)
            {
                System.out.print(arr2d[row][j]+" ");
            }
            System.out.println();
        }
    }
}
