import java.util.*;
public class Triangle
{
    public static void main(String arg[]) 
    {
        Scanner in=new Scanner(System.in);
        String result="";
        System.out.println("Enter the cases");
        int T=in.nextInt();
        for(int t=1;t<=T;t++)
        {
            long sum=0;
            long N=in.nextLong();
           for(long i=1;i<=N;i++)
           {
               if(i>1)
               {
                   sum+=8+(2*3);
                }
                else
                {
                     sum+=8;
                }
            }
            result+=sum+"\n";
        }
        System.out.println(result);
    }
}