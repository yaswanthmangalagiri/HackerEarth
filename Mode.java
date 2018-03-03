import java.util.*;
import java.lang.*;
public class Mode
{      
    public static void main(String args[]) throws NullPointerException
    {       
         Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
        int T=in.nextInt();
       String company=""; 
        for(int t=1;t<=T;t++)
        {
             ArrayList<Integer> li=new ArrayList<Integer>();
        ArrayList<Integer> ll=new ArrayList<Integer>();       
            System.out.println("Enter the no.");
             int N=in.nextInt();               
             int num[]=new int[N];
             int counter[]=new int[N];
             System.out.println("Enter the array");
        for(int n=0;n<N;n++)
        {
            num[n]=in.nextInt();           
            li.add(num[n]);
        }       
          int count=0;
           for(int i=0;i<li.size();i++)
            {
                count=0;
                for( int k=0;k<li.size();k++)
                {
                    if(li.get(i)==li.get(k))
                    {
                        count++;                        
                        if(count>1)
                        {
                        li.remove(k);    
                        k--;
                        }
                    }                    
                    counter[i]=count;  
                }
            } 
            int max=counter[0]; int ind=0;
            for(int x=1;x<counter.length;x++)
            {  
                if(max<counter[x])
                    {
                    max=counter[x];
                }     
        }
         for(int l=0;l<counter.length;l++)
        {
            if(max==counter[l])
            {               
                ll.add(li.get(l));
        }
    }
      for(int j=0;j<ll.size();j++)
        { 
            for(int m=j+1;m<ll.size();m++)            
            {         
                    if(ll.get(m)>ll.get(j))
                    {
                       int al=ll.get(j);
                        ll.set(j,ll.get(m));
                        ll.set(m,al);
                    }                     
            }
            company+=ll.get(j)+" ";
        }
        company+="\n";
    }   
       System.out.println("The Alphabet: "+company);
}          
}