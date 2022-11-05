import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int count=0;
        while (n>0)
        {
            int r1=n%10;
            n=n/10;
            int temp=n;
            while (temp>0)
            {
                int r2=temp%10;
                if (r2==r1)
                {
                    count=1;
                    break;
                }
                temp=temp/10;
            }
        }
        if (count==0)
        {
            System.out.println("Unique Number");
        }
        else
        {
             System.out.println("Not Unique Number");
        }
        
    }
}