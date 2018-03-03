import java.util.*;
import java.lang.*;
public class Sherif
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the no cases");
        int n=in.nextInt(); 
        ArrayList<String> li=new ArrayList<String>(); int ind=0;
        for(int i=1;i<=n;i++)
        { 
             int X=in.nextInt(); 
             int Y=in.nextInt(); 
             int R=in.nextInt(); 
             double y=0;double y2=0;  
             for(int x=X-R;x<=X+R;x++)
             {                    
                 System.out.println("X "+x);
                 int a=x-X;
                 y=(Math.sqrt((R*R)-(a*a)))+Y;
                 y2=-(Math.sqrt((R*R)-(a*a)))+Y;
                  System.out.println("Y1 "+y+"Y2 "+y2);
                 int b2=(int) y2;
                     for(int l=b2;l<=y;l++)
                     {
                         if(l>=y2)
                         {
                        System.out.println("L "+l);
                         if((x>=1)&&(x<=1000)&&(l>=1)&&(l<=1000))
                        {
                            String xy=x+" "+l; 
                           System.out.println("Equal point: "+xy);
                            li.add(xy);
                         }
                    }
                 }
             }
            } 
            int counter=0;
        for(int l=0;l<li.size();l++)
        {
            int count=0;
            for(int k=0;k<li.size();k++)
            {
                if(li.get(l).equals(li.get(k)))
                {
                    count++;
                    if(count>1)
                    {
                        System.out.println("Points: "+li.get(l));
                        counter++;
                         li.remove(k);
                    }
                }
            }
        }
        System.out.println("Result: "+counter);
        }
    }

