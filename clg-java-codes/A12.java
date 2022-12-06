import java.lang.*;
import java.io.*;
   class A4
     {
	    public static void main(String arg[])
		  {
		     DataInputStream di = new DataInputStream(System.in);
			 int t1,t2,t3,tot; string temp,sname; double avg;
                 try
					{
				System.out.print("Enter the name of student=");
				String sname=di.readLine();
				
				System.out.println("Enter the marks of 3 test:");
				temp=di.readLine();
				t1=Interger.parseInt(temp);
				temp=di.readLine();
				t2=Interger.parseInt(temp);
				temp=di.readLine();
				t3=Interger.parseInt(temp);
				
				temp=di.readLine();
				tot=Interger.parseInt(temp);
				tot=t1+t2+t3;
				
				temp=di.readLine();
				avg=Double.parseDouble(temp);
				avg=tot/3;
				
				System.out.println("Student Name="+(sname));
				System.out.println("Test 1="+(t1));
				System.out.println("Test 2="+(t2));
				System.out.println("Test 3="+(t3));
				System.out.println("Total ="+(tot));
				System.out.print("Average =" + (avg));
				} catch(IOException ex)  {}
				
			}
     }