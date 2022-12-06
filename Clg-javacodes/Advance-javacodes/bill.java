import java.awt.*;
import java.awt.event.*;
class bill extends Frame implements ActionListener
  {
   Button b1=new Button("OK");
   Button b2=new Button("EXIT");
   Label lb1=new Label("product name");
   Label lb2=new Label("Rate");
   Label lb3=new Label("Quantity");
   Label lb4=new Label("Amount");
   Label lb5=new Label("Discount");
   Label lb6=new Label("VAT");
   Label lb7=new Label("Total Amount");
   TextField tf1=new TextField(50);
   TextField tf2=new TextField(50);
   TextField tf3=new TextField(50);
   TextField tf4=new TextField(50);
   TextField tf5=new TextField(50);
   TextField tf6=new TextField(50);
   TextField tf7=new TextField(50);
   Checkbox cb1=new Checkbox("apply promo code");
   Checkbox cb2=new Checkbox("online payment");
double tot=0; int qty;double rate,amt,disc,vat;
   bill()
   { 
     setSize(450,700);
     setTitle("bill");
     setVisible(true);
     addWindowListener(new closeclass());
     setLayout(new FlowLayout());
     add(lb1);add(tf1);add(lb2);add(tf2);add(lb3);add(tf3);add(b1);
     add(lb4);add(tf4);add(lb5);add(tf5);add(lb6);add(tf6);add(cb1);add(cb2);add(lb7);add(tf7);add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);
     cb1.addMouseListener(new Eventclass());
     cb2.addMouseListener(new Eventclass());
   }
 public static void main(String arg[])
  {
   new bill();
   }
   public void actionPerformed(ActionEvent ob)
   {
    
      rate=Double.parseDouble(tf2.getText());
      qty=Integer.parseInt(tf3.getText());
      amt=rate*qty;
      disc=(amt*5.5)/100;
      vat=(amt*3.4)/100;
     tot=(amt+vat-disc);
     if(ob.getSource()==b1)
      {
        tf4.setText(""+(amt));
        tf5.setText(""+(disc));
        tf6.setText(""+(vat));
        tf7.setText(""+(tot));
      }
   }       
  class Eventclass extends MouseAdapter
{
  public void mouseClicked(MouseEvent ob)
   {
 //  JOptionPane.showMessageDialog(new JFrame(),"cb1="+cb1.getState()+"  cb2="+cb2.getState());
     // tot=(amt+vat-disc);
if(cb1.getState())
{
//System.out.println("CB1");
   tot=(tot-(tot*3.5)/100); 
tf7.setText(""+(tot));
}
 if(cb2.getState())
 {
//System.out.println("CB2");
   tot=(tot-(tot*2.5)/100); 
tf7.setText(""+(tot));
    }
}
 }
  class closeclass extends WindowAdapter
   {
     public void windowClosing(WindowEvent we)
      {
        System.exit(0);
      }
   }
}