import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,square,r,sum=0;
        n=sc.nextInt();//12
        square=n*n;//144
        while (square>0)
        {
           r=square%10;//4
           sum=sum+r;
           square=(int)square/10;
           
        }
        if (sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        
    }
}
