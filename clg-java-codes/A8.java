import java.io.*;
class A8
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int s1,s2,s3;
		try
		{
			System.out.print("Enter a sub1 marks=");
			s=di.readLine();
			s1=Integer.parseInt(s);
			System.out.print("Enter a sub2 marks=");
			s=di.readLine();
			s2=Integer.parseInt(s);
			System.out.print("Enter a sub3 marks=");
			s=di.readLine();
			s3=Integer.parseInt(s);
			if(s1>=30)
			System.out.println("sub1 result=PASS")
			else
			System.out.println("sub1 result=FAIL")
			if(s2>=30)
			System.out.println("sub2 result=PASS")
			else
			System.out.println("sub2 result=FAIL")
			if(s3>=30)
			System.out.println("sub3 result=PASS")
			else
			System.out.println("sub3 result=FAIL")
			
		}catch(IOException ex){}
	}
}