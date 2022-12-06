import java.io.*;
class convert 
{
public static void main(String args[])
{
DataInputStream di=new DataInputStream(System.in); 
String s;char ch;
try
{
System.out.print("Enter an charater:");
s=di.readLine();
ch=s.charAt(0);
System.out.println("Original Alphabet :"+ch);
ch=ch+32;
System.out.println("Opposite Case Alphabet");
}catch(IOException e){}
}
}