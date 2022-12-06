import java.lang.*;
class got2
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=6;i++)
{
for(j=1;j<=i;j++)
{
if(i%2==0)
System.out.print("*\t");
}
if(i%2!=0){
System.out.print(i);
System.out.print("\n");
}
}	
}

}