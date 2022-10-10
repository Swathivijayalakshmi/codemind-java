import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,sum=0;
        x=sc.nextInt();
        for (int i=1;i<=x/2;i++)
        {
            if (x%i==0)
            {
                sum=sum+i;
            }
            
        }
        if (sum>x)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}