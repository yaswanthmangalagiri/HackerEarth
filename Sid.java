import java.util.*;
import java.lang.*;
public class Sid
{
    public static void main(String args[]) throws Exception
    {
        Scanner in=new Scanner(System.in);  String result="";
            System.out.println("Enter the no cases");
            
        int n=in.nextInt(); 
        for(int i=1;i<=n;i++)
        {     double vol,height=0;
          
            System.out.println("Enter the nos");
        double a=in.nextDouble();
        double H=in.nextDouble();
        double thetamax=in.nextDouble();
        double radian=Math.toRadians(thetamax);
        if(radian<Math.atan(H/a))
        {
            vol=0.5*a*a*Math.tan(radian)*a;
            double h1=vol/(a*a);
            double A=H-(a*Math.tan(radian));
            height=A+h1;
        }
        else if(radian>=Math.atan(H/a))
        {
            vol=0.5*H*(H/Math.tan(radian))*a;
            height=vol/(a*a);
        }       
        if(((int)height<height)&&(height<=(int)(height+1)))
        {
           result+=((int)(height)+1)+"\n";
        }
        else if(height==(int)height)
        {
           result+=(int)height+"\n";
        }
        }
        System.out.print(result);
    }
}

        
        