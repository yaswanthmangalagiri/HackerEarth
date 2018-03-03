import java.util.*;
public class Square

{      
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Transaction");
        int N=in.nextInt();  
        int sum=0; String sq="";
       int str[]=new int[N];
        int a[]=new int[N];
        System.out.println("Enter the array");
         for(int n=0;n<N;n++)
        {
            a[n]=in.nextInt();
        }
         System.out.println("Enter the Queries");
        int Q=in.nextInt(); 
                int k[]=new int[Q];
        System.out.println("Enter the array");
        for(int q=0;q<Q;q++)
        {
            k[q]=in.nextInt();
        }
         for(int i=0;i<N;i++)
        {
            sum+=a[i];
        str[i]= sum;
        }        
        for(int x=0;x<k.length;x++)
        {
            for(int z=0;z<N;z++)
            {
               	if(str[z]>=k[x])
               	{
               	sq+=(z+1)+"\n";
               	break;
            }}
            if(k[x]>str[N-1])
            {
            sq+="-1"+"\n";
        }}
        System.out.println(sq);
   }   
}