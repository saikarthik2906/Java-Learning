import java.util.Scanner;
class  LinearSearchString 
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        String name = "Saikarthik";
        char target = 'r';
        System.out.println(LinearSearchString(name,target));
    }
    static boolean LinearSearchString(String str,char target)
    {
        if(str.length()<=0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                return true;
            }
        }
        return false;
    }
}
