import java.io.*;
   class A4
     {
	    public static void main(String args[])
		  {
		     DataInputStream di = new DataInputStream(System.in);
			 int t1,t2,t3,total; String temp; double avg;
			 {
				 System.out.print("Enter a Student Name=");
				 String temp=di.readLine();
				 System.out.print("Enter a Test 1 marks=");
				 temp=di.readLine();
				 t1=Integer.parseInt(temp);
				 System.out.print("Enter a Test 2 marks=");
				 temp=di.readLine();
				 t2=Integer.parseInt(temp);
				 System.out.print("Enter a Test 3 marks=");
				 temp=di.readLine();
				 t3=Integer.parseInt(temp);
				 total=t1+t2+t3;
				 avg=t1+t2+t3/3;
				 System.out.print("Total="+total);
				 System.out.print("Avg="+avg);
			}
				
		  }
     }