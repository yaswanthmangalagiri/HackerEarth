import java.util.*;
public class Pokemon
{      
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
        int T=in.nextInt();  
        String food="";        
        int count=0; int l=0;
          for(int i=1;i<=T;i++)
          {
              count=0; 
        System.out.println("Enter the N");
         int N=in.nextInt();
         int A[]=new int[N];
        int B[]=new int[N];
        for(int j=0;j<N;j++)
         {             
             int a=in.nextInt();
             A[j]=a;
             int b=in.nextInt();
             B[j]=b;
            }
             for(int x=0;x<B.length;x++)
             {
                 for(int y=x;y>=0;y--)
                 {
                     if(B[x]==A[y])
                     {
                         count=0;
                         break;
                        }
                         else if(B[x]!=A[y])
                         {
                    count=1;
                }
                }                
                l+=count;
            }       
                   food+=l+"\n";
    } 
    System.out.println(food);         
     }    
}    
                

