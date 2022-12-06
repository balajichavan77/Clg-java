// Bill Program.

import java.awt.*;
import java.awt.event.*;
class P21 extends Frame implements ActionListener
  {
     Label lb1 =new Label ("Product Name : ");
     Label lb2 =new Label ("Product Rate: ");
     Label lb3 =new Label ("Product Quantity ");
     Label lb4 =new Label ("Amount ");
     Label lb5 =new Label ("Discount ");
     Label lb6 =new Label ("VAT ");
     Label lb7 =new Label ("Total Amount ");
     Label lb8 =new Label ("Apply Promocode");
     Label lb9 =new Label ("Final Amount");
     
     Button b1 =new Button ("OK");
     Button b2 =new Button ("Exit");
     
     TextField tf1 =new TextField (10);
     TextField tf2 =new TextField (10);
     TextField tf3 =new TextField (10);
     TextField tf4 =new TextField (10);
     TextField tf5 =new TextField (10);
     TextField tf6 =new TextField (10);
     TextField tf7 =new TextField (10);
     TextField tf9 =new TextField (10);

     Checkbox cb1 =new Checkbox ("(3.5%)");
     Checkbox cb2 =new Checkbox ("Other Discount (10 Rs)");

     int qty; double rate,amt,disc,vat;
     double totamt=0,fiamt=0,promo,other;
     P21()
      {
        setSize(1500,1400);
        setTitle("Bill");
        setVisible(true);
        setLayout (new FlowLayout());
        add(lb1); add(tf1); 
        add(lb2); add(tf2);
        add(lb3); add(tf3);		  
        add(b1); 
        add (lb4); add(tf4);
        add (lb5); add(tf5);
        add (lb6); add(tf6);
        add (lb8);
        add (cb1); add(cb2);
        add (lb7); add(tf7);
        add (lb9); add (tf9);
        add (b2);
        b1.addActionListener (this);
        b2.addActionListener (this);
        cb1.addMouseListener (new Eventclass ());
        cb2.addMouseListener (new Eventclass ());


        addWindowListener (new closeclass());
     }
      public static void main (String arg[])
         {
         new P21();
       }
       public void actionPerformed (ActionEvent ae)
          {
          // int qty; double rate,amt,disc,vat;
          // double totamt=0;
           
             rate = Double.parseDouble(tf2.getText());
                 qty =  Integer.parseInt(tf3.getText());
             amt = rate*qty;
             disc =( amt*5.5)/100;
             vat  = (amt*3.4)/100;
             totamt = (amt+vat)-disc;
             
             if (ae.getSource()==b1)
             {
               tf4.setText(" "+ (amt));
               tf5.setText(" "+ (disc));
               tf6.setText(" "+ (vat));
               tf7.setText(" "+ (totamt));
             }
             else
                 System.exit(0);
          }
              class Eventclass extends MouseAdapter
              {
                  public void mouseClicked (MouseEvent e)
                  {
                      if(cb1.getState())
                          promo= (totamt*3.5)/100;
                       else
                          promo=0;
                      
                       if(cb2.getState())
                          other=10;
                       else
                         {
                           other=0;
                         } 
                          fiamt=totamt-promo-other;
                          tf9.setText("" + fiamt);
                  }
              }
              class closeclass extends WindowAdapter
              {
                public void windowClosing (WindowEvent ex)
                {
                  System.exit(0);	
                }
              }
              
  }				
             
                  