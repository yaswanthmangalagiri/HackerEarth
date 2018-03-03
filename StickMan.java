import java.util.*;
public class StickMan
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);   
        System.out.println("Enter the N & M");
        int N=in.nextInt();
        int M=in.nextInt();
        int NA[][]=new int[M][2];
        for(int n=0;n<M;n++)
        {
            for(int c=0;c<2;c++)
            {
                NA[n][c]=in.nextInt();
            }
        }
        int count[]=new int[M];
        int k=0; int stick=0;
        for(int i=1;i<=N;i++)
        {
            int countnum=0;
            for(int j=0;j<M;j++)
            {
                for(int c=0;c<2;c++)
                {
                    if(NA[j][c]==i)
                    {
                        countnum++; 
                    }
                }
            }
            if(countnum>=4)
            {
                count[k]=countnum;
                stick+=count[k]-3;
                k++;
            }            
        }                
                System.out.println("Count "+stick);
            }
            }
/*
  3 2
7 3
7 1
4 1
3 6
1 3
2 1
4 7
6 4
4 5
6 7
2 5
6 2
1 5
6 5
6 1
2 7
2 4
5 7
3 4
5 3
  */