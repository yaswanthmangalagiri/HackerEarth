import java.util.*;
public class Wobbly
{      
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
         int T=in.nextInt();
         String result="";  
          System.out.println("Enter the N & K");
        for(int t=1;t<=T;t++)
        {
            int N=in.nextInt();
            int K=in.nextInt(); 
            String num[]=new String[100];            
            for(int A=1;A<=9;A++)
            {
                String a=Integer.toString(A);
                for(int B=0;B<=9;B++)
                {
                     String wn=""; int count=0;
                    String b=Integer.toString(B);
                    if(A!=B)
                    { 
                       for(int i=0;i<N;i+=2)
                       {
                          wn+=a;
                          if((i+1)<N)
                          {
                              wn+=b;
                            }
                        }   count++;                    
                        num[count]=wn;
                    }
                   }
                }            
            result+=num[K-1]+"\n";    
        }
           System.out.println(result);     
    }        
}

                    