import java.io.*;
class A1
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n;
		try
		{
			System.out.print("Enter a one number=");
			s=di.readLine();
			n=Integer.parseInt(s);
			System.out.println("Square="+(n*n));
			System.out.println("Square Root="+Math.sqrt(n));
			System.out.println("Cube="+(n*n*n));
		}catch(IOException ex){}
	}
}