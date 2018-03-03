import java.util.*;
public class Blessing
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        for(int x=1;x<=T;x++)
        {
            double current=1.0;
            double P=in.nextDouble();
            double M=in.nextDouble(); Formatter fmt = new Formatter();
            double food=(P/current); double sum=food;
            for(double i=P+M;i<100;i=i+M)
            {
                 System.out.println("i "+i);
                 current=2*current;
                food=i/current;
                System.out.println("Food without fmt "+food);                 
                fmt = new Formatter();  
                 fmt.format("%.3f",food);
               String re=fmt.toString();
               double result=Double.valueOf(re); 
               System.out.println("Total "+result);             
                if(result==0.00)
                {
                    break;
                }
                else
                {
                    sum+=result;                
                }            
        }       
         System.out.println((int)sum);
    }
}
}
