import java.util.*;
public class PandaCombination
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);   
        System.out.println("Enter the cases");
        int T=in.nextInt();
        for(int x=0;x<T;x++)
        {
            long count=0;
            long N=in.nextLong();
            long M=in.nextLong();
            long diff=0;
            if(N>=M)
            {
            	diff=N-M;
            }
            else
            {
            	diff=N-(long)Math.pow(M,0);
            }            
            count++;
            while(diff!=0)
            {
                if(diff<N)
                {
                    double num=Math.pow(M,0);
                    diff-=(long)num;
                    count++;
                }
                else
                {
                    double num=Math.pow(M,0);
                    diff-=(long)num;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
    