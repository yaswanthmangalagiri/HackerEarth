import java.util.*;
public class JosephArray
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N And M");
        int N=in.nextInt();
        int M=in.nextInt();
        long[] MA=new long[N];
        System.out.println("Array");
        for(int i=0;i<N;i++)
        {
            MA[i]=in.nextLong();
        }
        long quality=1;
        for(int i=0;i<N;i++)
        {
            quality*=MA[i];
        }
        long divisors=1;int k=0;
        Long[] Div=new Long[M];
        for(int i=1;i<=quality;i++)
        {
            divisors=quality/i;
            if(divisors==(int)divisors)
            {
                Div[k]=divisors;
                k++;
            }
        }
    }
    }
        
        