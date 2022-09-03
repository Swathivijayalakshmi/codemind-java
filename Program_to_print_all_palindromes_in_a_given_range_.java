import java.util.Scanner;
class sample
{
    
    public static boolean ispalindrome(int n)
    {
        int temp=n;
        int sum=0,r;
        while (n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if (sum==temp)
            return true;
        else
            return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for (i=a;i<=b;i++)
        {
            if (ispalindrome(i))
            {
                System.out.print(i+" ");
               
                
            } 
           
            
        }
         
        
        
    }
}