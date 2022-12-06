import java.lang.*;
import java.io.*;
class case1
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n,ch;
		try
		{
			System.out.print("Enter a Number=");
			s=di.readLine();
			n=Integer.ParseInt(s);
			System.out.print("\t1.Square\n\t2.Square root\n\t3.Cube\t\tEnter Your Choice=");
			s=di.readLine();
			ch=Integer.ParseInt(s);
			switch(ch)
			{
				case 1:
				System.out.print("Square="+(n*n));
				break;
				case 2:
				System.out.print("Square root="+math.sqrt(n));
				break;
				case 3:
				System.out.print("Cube="+(n*n*n));
				break;
				default:
				System.out.print("WRONG CHOICE");
			}
        }catch(IOException e){}
    }
}