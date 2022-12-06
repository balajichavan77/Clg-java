import java.io.*;
class if10
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String Ename;char grade;int Bsal=0;double HRA=0,TA=0,DA=0,Itax=0,Ptax=0,NetSal=0; 
	   String s;
		try
		{
			System.out.print("Enter a Employee Name=");
			Ename=di.readLine();
			System.out.print("Enter Emp Grade=");
			s=di.readLine();
			grade=s.charAt(0);
			System.out.print("Emp Name\tGrade\tBsal\tHRA\tTA\tDA\tItax\tPtax\tNetSal");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			if(grade=='A')
			{
			    Bsal=12000; HRA(Bsal*32.5)/100; TA=(Bsal*31.2)/100; DA=(Bsal*20.5)/100; Itax(Bsal*19.9)/100;
			Itax=Math.round(Itax);
			Ptax=Math.round((Bsal*18.6)/100;
			}
			else if(grade=='B')
			{
				Bsal=11500; HRA(Bsal*30.1)/100; TA=(Bsal*29.8)/100; DA=(Bsal*27.2)/100; Itax(Bsal*17.4)/100;
			Itax=Math.round(Itax);
			Ptax=Math.round((Bsal*16.9)/100;
			}
			else if(grade=='C')
			{
				Bsal=9500; HRA(Bsal*23.6)/100; TA=(Bsal*22.2)/100; DA=(Bsal*21.1)/100; Itax(Bsal*11.7)/100;
			Itax=Math.round(Itax);
			Ptax=Math.round((Bsal*10.3)/100;
			}
			NetSal=(Bsal+HRA+TA+DA)-(Ptax+Itax);
			System.out.println(Ename+"\t\t"+grade+"\t"+Bsal+"\t"+HRA+"\t"+TA+"\t"+DA+"\t"+Itax+"\t"+Ptax+"\t"+NetSal);
		}catch(IOException ex){}
	}
}