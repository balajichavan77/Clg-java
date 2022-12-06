import java.io.*;
class A
{
	int n;
	String s;
	void input()
	{
		try
		{
			DataInputStream di=new DataInputStream(System.in);
			System.out.print("Enter a Number=");
			s=di.readLine(); n=Integer.parseInt(s);
		}catch (IOException ex){}
	}
	void output()
	{
		System.out.print("Square of"+n+" is "+(n*n));
	}
}
class demo1
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.input();
		obj.output();
	}
}