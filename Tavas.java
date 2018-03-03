import java.util.*;
public class Tavas
{      
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<Integer>();
        System.out.println("Enter N & K");
        int N=in.nextInt();
        int K=in.nextInt();
         int count=0;
        for(int i=1;i<=N;i++)
        {
             int counter=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)  
                { 
                    counter++;
                }
            }
                if(counter==2)
                {
                    li.add(i);
                } 
            }      
            for(int m=0;m<li.size();m++)
        {
            System.out.println("The prime "+li.get(m));
        }
            for(int a=1;a<=N;a++)
        {
             int sum=0;
            for(int l=0;l<li.size();l++)
            {        
            if(a%li.get(l)==0)
            {
            sum+=li.get(l);
            }
        }
        if(sum==K)
        {
            count++;
        }
        }   
        System.out.println(count);
    }
}
     