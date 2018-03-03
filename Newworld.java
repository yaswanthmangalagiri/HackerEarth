import java.util.*;
public class Newworld
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String world="";
          for(int t=1;t<=T;t++)
        {
        ArrayList<Long> li=new ArrayList<Long>();
        int x=in.nextInt(); 
        Long N[]=new Long[x];
        int y=in.nextInt();
        long len=0;
        System.out.println("Enter the Array");
        for(int i=0;i<x;i++)
        { 
            N[i]=in.nextLong();
        }
       /*  for(int j=0;j<x;j++)
         { 
             if(y==1)
                    {
                        len=N[x-1]-N[0];
                        li.add(len);
                        break;
                    } 
                    int jump=y;
                for(int n=j+1;n<x;n++)
                { 
                     len=0;
                    if((jump>1)&&(n!=x-1))
                    {
                    len=N[n]-N[0];
                    jump--;
                    li.add(len);
                }
                    if((jump==1)&&(len!=(N[x-1]-N[0])))
                    {
                        len=N[x-1]-N[n];
                        li.add(len);
                        break;
                        }
                }
          }   */      
          for(int j=0;j<x;j++)
         {      
              if(y==1)
                    {
                        len=N[x-1]-N[0];
                        li.add(len);
                        break;
                    } 
                int jump=y;
                for(int n=j;n<x-1;n++)
                { 
                     if(jump>1)
                    {
                    len=N[n+1]-N[0];
                    jump--;
                    if((n+1)!=(x-1))
                    {
                    li.add(len);
                    }
                   if(jump==1)
                    {
                        len=N[x-1]-N[n+1];
                        li.add(len);
                        break;
                        }
                }
            }  
        }
       
      long max=li.get(0);   
        if(li.size()>1)
        {
        for(int l=0;l<li.size();l++)
        {
            System.out.println("In List: "+li.get(l));
            if(li.get(l)>max)
            max=li.get(l);
        }        
    }
        world+=max+"\n";
    }
    System.out.println("The minimum length: "+world);
}
}     