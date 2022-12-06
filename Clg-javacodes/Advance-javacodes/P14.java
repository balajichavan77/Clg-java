import java.awt.*;
import java.awt.event.*;
class P14 extends Frame implements ActionListener
{
	Label lb1=new Label("Prod Name");
	Label lb2=new Label("Rate");
    Label lb3=new Label("Qty");
    Label lb4=new Label("Amount");
    Label lb5=new Label("Disc(5.5%)");
    Label lb6=new Label("VAT(3.3%)");
    Label lb7=new Label("Total Amount");
    Button b1=new Button("Ok");
    Button b2=new Button("clear");
    Button b3=new Button("Exit");
    TextField tf1=new TextField(20);
    TextField tf2=new TextField(20);
    TextField tf3=new TextField(20);
    TextField tf4=new TextField(20);
    TextField tf5=new TextField(20);
    TextField tf6=new TextField(20);
    TextField tf7=new TextField(20);
    P14()
    {
    	setSize(400,400);
    	setTitle("Employee1");
    	setVisible(true);
    	setLayout(new FlowLayout());
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	addWindowListener(new closeclass());
    	add(lb1);add(tf1);
    	add(lb2);add(tf2);
    	add(lb3);add(tf3);
    	add(b1);
    	add(lb4);add(tf4);
    	add(lb5);add(tf5);
    	add(lb6);add(tf6);
    	add(lb7);add(tf7);
    	add(b2);
    	add(b3);	
    }
    public static void main(String arg[])
    {
    	new P14();
    }
    public void actionPerformed(ActionEvent ex)
    {
      double rate,amt,disc,vat,totamt;
      int qty;

      rate=Double.parseDouble(tf2.getText());
      qty=Integer.parseInt(tf3.getText());
      
      amt=rate*qty;
      disc=(amt*5.5)/100;
      vat=(amt*3.4)/100;
      totamt=(amt+vat)-disc;

      if(ex.getSource()==b1)
      {
      	tf4.setText(""+amt);
      	tf5.setText(""+disc);
      	tf6.setText(""+vat);
      	tf7.setText(""+totamt);
      }
      else
      {
      	tf1.setText("");
      	tf2.setText("");
      	tf3.setText("");
      	tf4.setText("");
      	tf5.setText("");
      	tf6.setText("");
      	tf7.setText("");
      }
    }
    class closeclass extends WindowAdapter
    {
    	public void windowClosing(WindowEvent ex){
    		System.exit(0);
    	}
    } 
}