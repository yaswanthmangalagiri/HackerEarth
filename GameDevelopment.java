import java.util.*;
public class GameDevelopment
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N ,M & Q");
        int N=in.nextInt();
        int M=in.nextInt();
        int Q=in.nextInt();
        String result="";
        int MA[][]=new int[N][M];
        int QA[][]=new int[Q][N];
        for(int n=0;n<N;n++)
        {
            for(int m=0;m<M;m++)
            {
                MA[n][m]=in.nextInt();
            }
        }
        for(int q=0;q<Q;q++)
        {
            int level[]=new int[N];
            for(int n=0;n<N;n++)
            {
                QA[q][n]=in.nextInt();
               for(int m=0;m<M;m++)
               {
                   if(QA[q][n]>=MA[n][m])
                   {
                       level[n]=m;
                   }
               }
            }
            int min=level[0];
            for(int i=0;i<N;i++)
            {
                if(min>=level[i])
                {
                    min=level[i];
                }
            }
            result+=min;            
        }
        System.out.println(result);
    }
}
        