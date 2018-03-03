import java.util.*;
import java.lang.*;
public class Sum2
{
	public static void main(String arg[]) throws NumberFormatException
	{
		Scanner in=new Scanner(System.in);
		String result="";
		ArrayList<Integer> li=new ArrayList<Integer>();
		System.out.println("Enter the numbers");
		int a=in.nextInt();
			int b=in.nextInt();
			String A=Integer.toString(a);
			String B=Integer.toString(b);
			int a2=0;int b2=0;
			String sA="";
			for(int i=0;i<A.length();i++)
			{
				if(A.charAt(i)=='5')
				{
					sA=A.replace('5','6');
					a2=Integer.valueOf(sA);
				}
				else if(A.charAt(i)=='6')
				{
					sA=A.replace('6','5');
					a2=Integer.valueOf(sA);
				}
				else
				{
					a2=Integer.valueOf(A);
				}
			String sB=""; int sum=0;
			for(int j=0;j<B.length();j++)
			{
				if(B.charAt(j)=='5')
				{
					sB=B.replace('5','6');
					b2=Integer.valueOf(sB);
					sum=a2+b2;System.out.println("The Sum1: "+sum);
					li.add(sum);
				}
				else if(B.charAt(j)=='6')
				{
					sB=B.replace('6','5');
					b2=Integer.valueOf(sB);
					sum=a2+b2; System.out.println("The Sum2: "+sum);
					li.add(sum);
				}
				else 
				{
					b2=Integer.valueOf(B);
					sum=a2+b2;System.out.println("The Sum3: "+sum);
					li.add(sum);
				}
			}
			}
			int max=li.get(0);
			for(int l=1;l<li.size();l++)
			{
			    System.out.println("The entering sum: "+li.get(l));
				if(max<li.get(l))	
				{
					max=li.get(l);
					li.set(l,max);
				}
			}
			int min=li.get(0);
			for(int m=1;m<li.size();m++)
			{
				if(li.get(m)<min)
				{
					min=li.get(m);
					li.set(m,min);
				}
			}
			System.out.println(min+" "+max);
	}
}