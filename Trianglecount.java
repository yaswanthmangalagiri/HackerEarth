import java.util.*;
public class Trianglecount
{      
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Triangle");
        int N=in.nextInt();  
       String str[]=new String[N];
         int sq=0;       
        System.out.println("Enter the array");
        for(int i=0;i<N;i++)
         {  
        long a=in.nextLong();
          long b=in.nextLong();
          long c=in.nextLong();                     
             long sum=0;  
              sum=a+b+c;   
             String strsum=Long.toString(sum);
            str[i]=strsum;            
       System.out.println("The sum :"+str[i]);   
    }
    for(int x=0;x<N;x++)
         {           
             int count=0;
             for(int k=0;k<N;k++)
             {
                 if(str[x].equals(str[k]))
                 {
                     count++;   
                    }               
                }                      
        if(count==1)
            {
                sq++;     
                System.out.println("The unique "+sq);   
            }
        } System.out.println(sq);   
     }    
    }    
                

