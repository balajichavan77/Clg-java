import java.io.*;
class if2
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n;
		try
		{
			System.out.print("Enter a one Number:");
			s=di.readLine();
			n=Integer.parseInt(s);
			if(n>0)
			System.out.print(n+" is Positive Number");
			else if(n<0)
			System.out.print(n+" is Negative Number");
			else
			System.out.print(n+" is Neutrial Number");
		}catch(IOException ex){}
	}
}