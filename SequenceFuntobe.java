import java.util.*;
public class SequenceFuntobe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N And Array");
        int N=in.nextInt();
        int NA[]=new int[N];
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {    
            for(int j=i+1;j<N;j++)
            {                 
                int max=0;                
                if(NA[i]>=NA[j])
                {
                    max=NA[i];
                }
                else
                {
                    max=NA[j];
                }
                int count=0;
                for(int n=1;n<=max;n++)
                {
                    if((NA[i]%n==0)&&(NA[j]%n==0))
                    {
                        count++;
                    }
                }                
                if(count>1)
                {   
                   for(int k=j;k<N;k++)
            {                 
                max=0;                
                if(NA[i]>=NA[k])
                {
                    max=NA[i];
                }
                else
                {
                    max=NA[k];
                }
                count=0;
                for(int n=1;n<=max;n++)
                {
                    if((NA[i]%n==0)&&(NA[k]%n==0))
                    {
                        count++;
                    }
                }   
                if(count==1)
                {
                    int temp=NA[k];
                    NA[k]=NA[j];
                    NA[j]=temp;
                    break;
                }
            }
        }
                else
                {
                    break;
                }
            }  
             System.out.println(NA[i]+" ");
        }
        }
        
    }

