import java.awt.*;
import java.applet.*;
public class Api5 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Graphics Demo",300,20);
		g.drawLine(298,40,400,40);
		g.drawRect(10,50,100,90);
		g.fillRect(10,150,100,100);
		g.drawRect(170,50,30,90);
		g.fillRect(170,150,90,30);
		g.drawOval(270,150,100,100);
		g.fillOval(370,150,100,100);
	}
}
/*<Applet code="Api5"width=700 height=700></applet>*/