import java.awt.*;
import java.awt.event.*;
class P18 extends Frame implements ActionListener
{   
    int qty;
    double amt=0,rate=0,disc=0,vat=0,promo=0,other=0,totamt=0,famt=0;
    Checkbox cb1=new Checkbox("Promo");
    Checkbox cb2=new Checkbox("Other");
	Label lb1=new Label("Prod Name");
	Label lb2=new Label("Rate");
    Label lb3=new Label("Qty");
    Label lb4=new Label("Amount");
    Label lb5=new Label("Disc(5.5%)");
    Label lb6=new Label("VAT(3.9%)");
    Label lb7=new Label("tot Amount");
    Label lb8=new Label("Final Amount");
    Button b1=new Button("Ok");
    Button b2=new Button("Exit");
    TextField tf1=new TextField(20);
    TextField tf2=new TextField(20);
    TextField tf3=new TextField(20);
    TextField tf4=new TextField(20);
    TextField tf5=new TextField(20);
    TextField tf6=new TextField(20);
    TextField tf7=new TextField(20);
    TextField tf8=new TextField(20);
    P18()
    {
    	setSize(400,400);
    	setTitle("Employee4");
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

        add(cb1);add(cb2);

        add(lb8);add(tf8);
    	add(b2);	
    }
    public static void main(String arg[])
    {
    	new P18();
    }
    public void actionPerformed(ActionEvent ex)
    {
      rate=Double.parseDouble(tf2.getText());
      qty=Integer.parseInt(tf3.getText());
      amt=Integer.parseInt(tf2.getText())*Integer.parseInt(tf3.getText());
      disc=(amt*5.5)/100;
      vat=(amt*3.9)/100;
      totamt=(amt+vat)-disc;
      if(ex.getSource()==b1)
      {
        tf4.setText(""+amt);
        tf5.setText(""+disc);
        tf6.setText(""+vat);
        tf7.setText(""+totamt);
      }
    }
    class Eventclass extends MouseAdapter
    {
        public void mouseClicked(MouseEvent ae)
        {
            if(cb1.getState())
                promo=5;
            else
                promo=0;
            if(cb2.getState())
                other=10;
            else
                other=0;
            
            totamt=Double.parseDouble(tf7.getText());
            famt=totamt-promo-other;
            tf8.setText(""+famt);
        }
    }
    class closeclass extends WindowAdapter
    {
        public void windowClosing(WindowEvent ex)
        {
    	    System.exit(0);
        }
    }
     
}