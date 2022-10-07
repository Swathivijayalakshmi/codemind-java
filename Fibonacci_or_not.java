import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0,n;
        n=sc.nextInt();
        while (c<n)
        {
            c=a+b;
            a=b;
            b=c;
            
        }
        if (c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}