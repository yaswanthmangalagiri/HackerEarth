import java.util.*;
public class AP
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String result=""; 
        for(int x=1;x<=T;x++)
        {
            int N=in.nextInt();
            int NArray[]=new int[N];
            for(int n=0;n<N;n++)
            { 
                NArray[n]=in.nextInt();
            } 
            Arrays.sort(NArray);
            int D=NArray[1]-NArray[0];   int count=0;
            int diff[]=new int[N-1];
            for(int i=0;i+1<N;i++)
            {      
                diff[i]=NArray[i+1]-NArray[i];
                if(diff[i]==D)
                {
                    count++;
                }
            }
            if(count==N-1)
            {
                result+="YES\n";
            }
            else
            {
                result+="NO\n";
            }
        }
        System.out.println(result);
    }
}
                
            