import java.lang.*;
import java.io.*;
class grade 
{
public static void main(String args[])
{
DataInputStream di=new DataInputStream(System.in);
String g;char ch;double bsal,hra,ta,da,itax,ptax;
try
{
System.out.print("Enter Employee Name:");
g=di.readLine();
System.out.print("Enter Grade :");
g=di.readLine();
ch=g.charAt(0);
if(g<'A')
{
	System.out.print("bsal=1200;hra=32.5;ta=31.2;da=20.5;itax=19.9;ptax=18.6");	
}
if(g>='B' && g<'A')
{
	System.out.print("bsal=1500;hra=30.1;ta=29.8;da=27.2;itax=17.4;ptax=16.9");	
}
if(g>'C')
{
	System.out.print("bsal=9500;hra=23.6;ta=22.2;da=21.1;itax=11.7;ptax=10.3");
}
double netsal=(bsal+hra+ta+da)-(itax+ptax);
System.out.print("NetSalary ="+netsal);
}catch(IOException e){}
}
}