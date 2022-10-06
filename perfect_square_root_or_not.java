import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double sqrt;
        double sqrt1;
        n=sc.nextInt();
        sqrt=Math.sqrt(n);
        sqrt1=(int)Math.sqrt(n);
        if ((sqrt-sqrt1)==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}