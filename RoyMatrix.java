import java.util.*;
public class RoyMatrix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        for(int x=0;x<T;x++)
        {
            int N=in.nextInt();
            int Matrix[][]=new int[N+1][N+1];
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    Matrix[i][j]=j-i;
                    if(Matrix[i][j]<0)
                    {
                        Matrix[i][j]=Matrix[i][j]*(-1);
                    }
                    System.out.print(Matrix[i][j]+"  ");
                }
                System.out.println();
            }
            int sum=0;
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    sum+=Matrix[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}