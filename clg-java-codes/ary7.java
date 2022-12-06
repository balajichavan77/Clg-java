import java.io.*;
class ary7
{
	public static void main(String arg[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n[]=new int[5],x,i;
		try
		{
			for(i=0;i<=4;i++)
			{
				System.out.print("Enter a number:");
				s=di.readLine();
				n[i]=Integer.parseInt(s);
			}
			System.out.print("Enter One Data Element:");
				s=di.readLine();
				x=Integer.parseInt(s);
				System.out.print("Array Element=\t");
				for(i=0;i<=4;i++)
					System.out.print("\t"+n[i]);
				System.out.print("\n Data Element="+x);
				int fq=0;
				for(i=0;i<=4;i++)
				{
					if(x==n[i])
					{fq++;}
				}
				System.out.print("\tFrequency of "+x+" in Array is="+fq);
		}catch (IOException ex){}
	}
}