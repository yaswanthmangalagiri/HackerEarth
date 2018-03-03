import java.util.*;
public class Timeworld
{      
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Cases");
        int T=in.nextInt();
        String result="";  
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                B[i][j]=A[i][j];  
                for(int k=i+1;k<N;k++)
                {
                    B[i][j]=B[i][j]%A[k][j];
                }
                int palpak=1;
                for(int l=0;l<N;l++)
                {
                    sum=0;
                    for(int m=0;m<M;m++)
                    {
                        sum=sum+B[i][j];
                        palpakArr[i]=palpak*sum;
                    }
                }
        