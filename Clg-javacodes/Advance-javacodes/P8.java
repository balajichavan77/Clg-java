import java.awt.*;
import java.awt.event.*;
class P8 extends Frame implements ActionListener
{
	Button Addition=new Button("+");
	Button Substraction=new Button("-");
	Button Multiplication=new Button("*");
	Button Divison=new Button("/");
	Button Remender=new Button("%");
	P8()
	{
		setSize(400,400);
		setTitle("Calculator");
		setVisible(true);
		setLayout(new FlowLayout());
		addWindowListener(new closeclass());
		add(Addition);add(Substraction);add(Multiplication);add(Divison);add(Remender);

		Addition.addActionListener(this);
        Substraction.addActionListener(this);
        Multiplication.addActionListener(this);
        Divison.addActionListener(this);
        Remender.addActionListener(this);
    }
     class closeclass extends WindowAdapter
      {
        public void windowClosing(WindowEvent aw)
        {
    	
    	System.exit(0);
        }
       }
    public static void main(String arg[])
    {
    	new P8();
    }
    public void actionPerformed(ActionEvent ex)
    {
        int n=10, m=5;
        if(ex.getSource()==Addition)
        {
        	System.out.println("Addition="+(n+m));
        }
                else if(ex.getSource()==Substraction)
        {
        	System.out.println("Substraction="+(n-m));
        }
                else if(ex.getSource()==Multiplication)
        {
        	System.out.println("Multiplication="+(n*m));
        }
                else if(ex.getSource()==Divison)
        {
        	System.out.println("Divison="+(n/m));
        }
               else if(ex.getSource()==Remender)
        {
        	System.out.println("Remender="+(n%m));
        }
     
    }
}



