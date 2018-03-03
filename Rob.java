import java.util.*;
public class Rob
{
    public static void main(String args[]) throws Exception
    {
        Scanner in=new Scanner(System.in); 
           System.out.println("Test cases: ");
        int n=in.nextInt(); String prime="";        
        for(int i=1;i<=n;i++)
        {     long inte=0; long NC=0;  long P=0;
             System.out.println("N:");
              long N=in.nextInt(); 
              for(long x=1;x<N;x++)
               {       if(x==1)
                   {
                       P++;
                        System.out.println("K: "+x);
                    }
                    else if(N%x!=0)
                       {
                       P++;
                       System.out.println("K: "+x);
                       }
                     
                }                           
                for(long x=1;x<=P;x++)
                {
                    if(P%x==0)
                    {
                        inte++;
                    }
                }
             if(inte==2)
              {
                        prime+="TRUE"+"\n";}
                        else
                        {
                        prime+="FALSE"+"\n";}   
                             }               
                             System.out.println(prime);                                
                }                
                }
            