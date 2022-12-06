import java.lang.*;
import java.io.*;
   class A4
     {
	    public static void main(String arg[])
		  {
		     DataInputStream di = new DataInputStream(System.in);
			 int t1,t2,t3,total; double avg;
			 {
				 System.out.print("Enter a Student Name=");
				 String name=di.readLine();
				 System.out.print("Enter a Test 1 marks=");
				 t1=Integer.parseInt(di.readLine());
				 System.out.print("Enter a Test 2 marks=");
				 t2=Integer.parseInt(di.readLine());
				 System.out.print("Enter a Test 3 marks=");
				 t3=Integer.parseInt(di.readLine());
				 total=t1+t2+t3;
				 avg=t1+t2+t3/3;
				 System.out.print("Total="+total);
				 System.out.print("Avg="+avg);
			}
				
		  }
     }