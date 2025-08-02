import java.util.Scanner;
class PrintingSquare 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();   
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(j==1 || j==a || i==1 ||i==a )
                System.out.print("*");
                else
                System.out.print(" ");
                
            }    
            System.out.print("\n");
        }
            
    }
}      
        
