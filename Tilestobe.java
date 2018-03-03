import java.util.*;
public class Tilestobe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases");
        int T=in.nextInt();
        for(int t=0;t<T;t++)
        {
        int N=in.nextInt();
        int Grid[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                Grid[i][j]=in.nextInt();
            }
        }
        int Q=in.nextInt();int ways=1;
        for(int i=0;i<Q;i++)
        {
            int S=in.nextInt();
            int D=in.nextInt();
            int sub=0;
            for(int k=0;k<N;k++)
            {
                int count=0;
                for(int j=0;j<N;j++)
                {
                    if(Grid[k][j]==S+1)
                    {
                        count++;
                        sub=Grid[k][j];
                    }
                }
                ways*=count;
                S=sub;
            }
        }
        System.out.println(ways);
    }
}
}
                    