 import java.lang.*;
	import java.io.*;
	class ary9
	{
	  public static void main (String ar[])
	   {
	     DataInputStream di=new DataInputStream (System.in);
		  int n[][]=new int [5][5],i,j,sum; String s;
		  
		  try
		    {
			  for (i=0;i<=4;i++)
			   {
			     for (j=0;j<=4;j++)
				 {
				 System.out.print("Enter a value : ");
				 s=di.readLine();
				 n[i][j]=Integer.parseInt(s);
				 }
			   }
			   sum=0;
			   for (i=0;i<=4;i++)
			    {
				  for (j=0;j<=4;j++)
				  {
				  System.out.print(n[i][j]+ "\t");
				  sum=sum+n[i][j];	
				  }
				  System.out.print("\n");
				}
				  System.out.print("\n Sum of the elements = " + sum);				
			}catch (IOException ex) {}  
		}
    }		