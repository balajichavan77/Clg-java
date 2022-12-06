import java.io.*;
   class A7
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
				int=Interger.parseInt(temp);
				tot=t1+t2+t3;
				avg=tot/3;
				
				System.out.println("Student Name="+(sname));
				System.out.println("Test 1="+(t1)"Test 2="+(t2)"Test 3="+(t3));
				System.out.println("Total ="+(tot));
				System.out.print("Average =" + (avg));
				} catch(IOException ex)  {}
				
			}
     }