import java.io.*;
class A4
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n;
		try
		{
			System.out.print("Enter a one No=");
			s=di.readLine();
			n=Integer.parseInt(s);
			if(n%2==0)
			System.out.print("EVEN");
			else
			System.out.print("ODD");
		}catch(IOException ex){}
	}
}