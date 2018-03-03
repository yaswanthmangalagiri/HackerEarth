import java.util.*;
public class Equation
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter the T ");
        int T=in.nextInt();
        for(int t=0;t<T;t++)
        {
        long N=in.nextLong(); int decision=0;long sq=0;
        for(long x=1;x<N;x++)
        {
            long div=x;
            long rem=0;long sum=0;
            while(div!=0)
            {            
                rem=div%10;
                div=div/10;
                sum+=rem;
            }
            if((x*x)==(N-sum*x)) 
            {
                decision=1; sq=x;
                System.out.println("sum: "+sum);
                break;
            }
        }
        if(decision==1)
        {
            System.out.println(sq);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
 }    
        