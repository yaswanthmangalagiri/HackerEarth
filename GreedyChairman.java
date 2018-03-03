import java.util.*;
public class GreedyChairman
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N & M");
        int N=in.nextInt();
        int M=in.nextInt();
        int NA[]=new int[N];
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextInt();
        }
        for(int x=0;x<M;x++)
        {
            int MA[]=new int[3];
            for(int n=0;n<3;n++)
            {
                MA[n]=in.nextInt();
            }
            int min=NA[MA[0]-1];
            for(int i=MA[0];i<MA[1];i++)
            {
                if(NA[i-1]<=NA[i])
                {
                    min=NA[i-1];                    
                }
                else
                {
                    min=NA[i];                    
                }
                System.out.println("New Min: "+min);
            }
            int count=0;
            for(int i=MA[0];i<=MA[1];i++)
            {
                if(NA[i-1]==min)
                {
                    count++;
                }
            }
            if(count>=MA[2])
            {
                System.out.println(count%1000000007);
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}
