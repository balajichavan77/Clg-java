import java.io.*;
class if15
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;char ch;
		try
		{
			System.out.print("Enter one Alphabet=");
			s=di.readLine();
			ch=s.charAt(0);
			if(ch>='A' && ch<='Z')
			{
				System.out.print("Alphabet Entered="+ch);
				System.out.print("\n\t\tOpposite Case="+(char)(ch+32));
			}
			else if(ch>='a' && ch<='z')
			{
			    System.out.print("Alphabet Entered="+ch);
			    System.out.print("\n\t\tOpposite Case="+(char)(ch-32));
		    }
	     	else
		        System.out.print("\n\t\tNon-Alphabet");
		}catch(IOException ex){}
    }
}