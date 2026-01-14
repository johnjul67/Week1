import java.util.Scanner;
public class prime_7 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("n: ");
        int n=sc.nextInt();
        boolean flag=true;
        if (n<=1) 
            flag=false; 
        else 
        {
            for(int i=2;i*i<=n;i++) 
            {
                if (n%i==0) 
                    flag=false;
            }
        }
        if (flag)
            System.out.print("Prime");
        else
            System.out.print("Not Prime");
    }
}