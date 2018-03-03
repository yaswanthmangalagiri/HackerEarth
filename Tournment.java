import java.util.*;
public class Tournment
{      
    public static void main(String args[]) throws NullPointerException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Matches");
        int N=in.nextInt();
       String VS[]=new String[2*N];
       String Name[]=new String[2*N];
        int Namecount[]=new int[2*N];
        String ind[]=new String[2*N];
         String same[]=new String[2*N];
       String company="";  
       System.out.println("Enter the array");
        for(int t=1;t<=(2*N);t++)
        {
            VS[t-1]=in.next();
            Name[t-1]=VS[t-1];
        }
        int n=0;
           for(int i=0;i<(2*N);i++)
            {
                int count=0;
                for(int k=0;k<(2*N);k++)
                {
                    if(Name[k]!=null)
                    {
                    if(VS[i].equals(Name[k]))
                    {
                        count++; 
                      
                    if(count>1)
                    {
                        
                        Name[k]=null;
                    }
                }
                }
                } 
            }
            for(int i=0;i<(2*N);i++)
            {
                  int count=0;
                if(Name[i]!=null)
                {
                for(int k=0;k<(2*N);k++)
                {
                    if(Name[i].equals(VS[k]))                    {
                       
                        count++;
                    }
                }
            }
                Namecount[i]=count;
            }
               int max=Namecount[0];
            for(int x=0;x+1<(2*N);x++)
            {  
                if(Namecount[x]!=0)
                {
                if(max<Namecount[x+1])
                {
                    max=Namecount[x+1];
                }    
            }
            }
            int x=0; int count=0;
         for(int l=0;l<(2*N);l++)
        {
            if(max==Namecount[l])
            {               
                count++;
                same[x]=Name[l];
                x++;
        }
    }
    if(count>1)
    { 
        for(int j=0;j<(2*N);j++)
        { 
             if(same[j]!=null)
             {
            for(int m=j+1;m<(2*N);m++)            
            {         
                if(same[m]!=null)
                {
                    if(same[m].compareTo(same[j])<0)
                    {
                        String al=same[j];
                        same[j]=same[m];
                        same[m]=al;
                    }                     
            }
        }
            company+=same[j]+"\n";
        }
    }
    }
     else
     {
             company=same[0];
    }  
       System.out.println("The Alphabet: "+company);
}
}          