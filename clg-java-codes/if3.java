import java.io.*;
class if3
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n,m;
		try
		{
			System.out.print("Enter a 1st Number:");
			s=di.readLine();
			n=Integer.parseInt(s);
			
			System.out.print("Enter a 2nd Number:");
			s=di.readLine();
			m=Integer.parseInt(s);
			
			System.out.print("N===="+n"\t\tM===="+m);
			
			if(n<m)
			System.out.print(n+" is Smaller");
			else if(m<n)
			System.out.print(m+" is Smaller");
			else
			System.out.print("Both are Equal values");
		}catch(IOException ex){}
	}
}