import java.util.*;
public class Coin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String result=""; 
        System.out.println("Enter the N,M,A,B&C");
        for(int i=1;i<=T;i++)
        {
            int N=in.nextInt();
            int M=in.nextInt();
            int A=in.nextInt();
            int B=in.nextInt();
            int C=in.nextInt();
            
            int sum[]=new int[100000];
            if(N<M)
            {int j=0;
            for(int n=0;n<=N;n++)
            {
                sum[j]=(N-n)*A+(M-n)*B+2*n*C;
            j++;
        }
        }
        else
        {int j=0;
         for(int n=0;n<=M;n++)
            {
                sum[j]=(N-n)*A+(M-n)*B+2*n*C;
            j++;
        }
    }
            int max=sum[0];
            for(int l=0;l<sum.length;l++)
            {
                if(sum[l]!=0)
                {
            if(max<sum[l])
            {
                max=sum[l];
            }
        }
        }
        result+=max+"\n";
    }    
        System.out.println(result);
}
}