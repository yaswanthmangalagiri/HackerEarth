import java.util.*;
public class FindingDinosaurs
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
         System.out.println("Enter the num");
        int N=in.nextInt();
        int K=in.nextInt();
        int L=in.nextInt();
        int Q=in.nextInt();
        String NA[]=new String[N];
        int KA[][]=new int[N][K];
        for(int n=0;n<N;n++)
        {   
            NA[n]=in.next();
            for(int c=0;c<K;c++)
            {
                KA[n][c]=in.nextInt();
            }
        }
        for(int q=0;q<Q;q++)
        {
            int QA[][]=new int[1][K];
            for(int c=0;c<K;c++)
            {
                QA[0][c]=in.nextInt();
            }
            int decision=0;
            for(int i=0;i<N;i++)
            {
                System.out.println("i "+i);
                for(int k=0;k<K;k++)
                {
                    if(QA[0][k]==KA[i][k])
                    {                        
                        decision=1;
                    }
                    else
                    {
                        decision=0;
                        break;
                    }
                }
                if(decision==1)
                {
                    System.out.println(NA[i]);
                    break;
                }
            }
                if(decision==0)
                {
                    System.out.println("You cant fool me :P");
                }
        }
    }
}

        