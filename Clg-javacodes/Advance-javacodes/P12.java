import java.awt.*;
import java.awt.event.*;
class P12 extends Frame implements ActionListener
{
	Label lb1=new Label("Enter a 1st No");
	Label lb2=new Label("Enter 2nd NO");
	Label lb3=new Label("Results");
	Button b1=new Button("+");
	Button b2=new Button("-");
	Button b3=new Button("*");
	Button b4=new Button("/");
	Button b5=new Button("%");
	TextField tf1=new TextField(15);
	TextField tf2=new TextField(15);
	TextField tf3=new TextField(15);
	P12()
	{
		setSize(500,500);
		setTitle("Calculator");
		setVisible(true);
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		add(lb1);add(tf1);add(lb2);add(tf2);add(b1);add(b2);add(b3);add(b4);add(b5);add(lb3);add(tf3);
	}
	public static void main(String arg[])
	{
		new P12();
	}
	public void actionPerformed(ActionEvent we)
	{
		 int n,m;
		 n=Integer.parseInt(tf1.getText());
		 m=Integer.parseInt(tf2.getText());
		 if(we.getSource()==b1)
		 {
		 	tf3.setText(""+(n+m));
		 }
		 else if(we.getSource()==b2)
		 {
		 	tf3.setText(""+(n-m));
		 }
		 else if(we.getSource()==b3)
		 {
		 	tf3.setText(""+(n*m));
		 }
		 else if(we.getSource()==b4)
		 {
		 	tf3.setText(""+(n/m));
		 }
		 else if(we.getSource()==b5)
		 {
		 	tf3.setText(""+(n%m));
		 }
	}
}