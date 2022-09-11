import java.util.Scanner;
class sample
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,r;
        n=sc.nextInt();
        n=Math.abs(n);
        int temp=n;
        while (n>0)
        {
           r=n%10;
           sum=sum*10+r;
           n=n/10;
        }
        if (sum==temp)
        {
            System.out.println("True");
        }
            
        else
        {
            System.out.println("False");
        }
            
    }
}