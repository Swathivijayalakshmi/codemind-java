import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max,lcm,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        for (i=max;;i=i+max)
        {
            if (i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
        
    }
}