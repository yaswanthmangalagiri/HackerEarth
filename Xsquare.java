import java.util.*;
public class Xsquare
{      
    public static void main(String args[]) 
    {       
         Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size");
        int N=in.nextInt();
        int A[]=new int[N];
        int B[]=new int[N];
        String sum="";
        System.out.println("Enter the Queries");
        int Q=in.nextInt();
         int Qu[][]=new int[Q][3];
         System.out.println("Enter the Arrays");
        for(int i=0;i<N;i++)
        {
             A[i]=in.nextInt();
            }
            for(int i=0;i<N;i++)
        {
             B[i]=in.nextInt();
        } 
        System.out.println("The Query is:");
        for(int q=0;q<Q;q++)
        { 
            for(int l=0;l<3;l++)
            { 
                Qu[q][l]=in.nextInt();
            }
        }
         for(int q=0;q<Q;q++)
        { 
                        int sum1=0;int sum2=0;
                if(Qu[q][0]==1)
                {
                    for(int a=Qu[q][1]-1;a<Qu[q][2];a+=2)
                    {
                          System.out.println("a "+a);
                          System.out.println("A[a] "+A[a]);
                          sum1+=A[a];
                          if((a+1)<Qu[q][2])
                          {
                          sum1+=B[a+1];
                        }
                       }                 
                 sum+=sum1+"\n";
                    }
                else if(Qu[q][0]==2)
                {      
                    for(int a=Qu[q][1]-1;a<Qu[q][2];a+=2)
                    {
                            sum2+=B[a];
                            if((a+1)<Qu[q][2])
                          {
                          sum2+=A[a+1];
                    }
                }
                      sum+=sum2+"\n";
            }            
        }
        System.out.println("The result "+sum);
    }
}
                    