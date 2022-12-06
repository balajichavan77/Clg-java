import java.awt.*;
import java.applet.*;
public class Api4 extends Applet
{
	public void paint(Graphics g)
	{
		String studname=getParameter("Studname");
		String temp=getParameter("marks1");
		int m1=Integer.parseInt(temp);
		temp=getParameter("marks2");
		int m2=Integer.parseInt(temp);
		int tot=m1+m2;
		            g.drawString("Stud Name="+studname,10,20);
					g.drawString("Marks1="+m1,10,40);
					g.drawString("Marks2="+m2,10,60);
					g.drawString("Tot Marks="+tot,10,80);
	}
}
/*<Applet code="Api4"width=500 height=500>
<param name="Studname"value="Mahesh">
<param name="marks1"value="35">
<param name="marks2"value="45">
</applet>*/