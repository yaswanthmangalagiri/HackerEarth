import java.util.*;
public class BrioHouse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        String result=""; 
        for(int x=1;x<=T;x++)
        {
            double side[]=new double[3];
            for(int i=0;i<3;i++)
            {
               side[i]=in.nextFloat();
            }
            double max=side[0];
            for(int j=0;j<3;j++)
            {
                if(max<side[j])
                {
                    max=side[j];
                }
            }
            Formatter fmt = new Formatter();
            double arg=((side[1]*side[1])+(side[2]*side[2])-(side[0]*side[0]))/(2*side[1]*side[2]);
            double A=Math.acos(arg);
            double r=side[0]/(2*Math.sin(A));
            double area=3.1415*r*r;
            fmt.format("%.4f",area);       
            result+=fmt+"\n";
        }
        System.out.println(result);
    }
}
