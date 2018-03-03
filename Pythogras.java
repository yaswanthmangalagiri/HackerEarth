import java.util.*;
public class Pythogras
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the test cases");
        int T=in.nextInt();
        String triplet="";       
        for(int i=1;i<=T;i++)
        {
        System.out.println("Enter the N");
        double N=in.nextInt();
        int count=0; double c=1; double b=1;
        double A=1; double B=1; double C=1;
        for(c=1;c<=N;c++)
        {
          C=(c*c);//C=(int)Math.pow(c,2);
           
            for( b=1;b<N;b++)
            {
               //B=(int)Math.pow(b,2);
               B=(b*b); 
                for(double a=1;a<b;a++)
                {
                   // A=(int)Math.pow(a,2);
                   A=(a*a);
                    if(C==(A+B))
                    {
                    count++;
                }
                
                }
            }
        }
        triplet+=count+"\n";
    }
    System.out.println(triplet);
    }
}
