import java.io.*;
class A3
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s,pname;int rate,qty;double amt,disc,tax,netamt;
		try
		{
			System.out.println("Enter a product Name=");
			s=di.readLine();
			System.out.println("Enter a rate values=");
			s=di.readLine();
			rate=Integer.parseInt(s);
			System.out.println("Enter a qty values=");
			s=di.readLine();
			qty=Integer.parseInt(s);
			System.out.println("Amount="+(rate*qty));
			amt=rate*qty;
			disc=(amt*4.3)/100;
			tax=(amt*5.8)/100;
			netamt=("Net Amount="+netamt);
		}catch(IOException ex){}
	}
}