import java.io.*;
class if4
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n1,n2,n3;
		try
		{
			System.out.print("Enter a 1st Number:");
			s=di.readLine();
			n1=Integer.parseInt(s);
			
			System.out.print("Enter a 2nd Number:");
			s=di.readLine();
			n2=Integer.parseInt(s);
			
			System.out.print("Enter a 3rd Number:");
			s=di.readLine();
			n3=Integer.parseInt(s);
			
			System.out.print("N1===="+n1+"\t\tN2===="+n2+"\t\tN3===="+n3);
			
			if(n1>n2 && n1>n3)
			System.out.print("\nLargest value is="+n1);
			else if(n2>n1 && n2>n3)
			System.out.print("\nLargest value is="+n2);
			else if(n3>n1 && n3>n2)
			System.out.print("\nLargest value is="+n3);
			else
			System.out.print("\nBoth are Equal values");
		}catch(IOException ex){}
	}
}