import java.awt.*;
import java.awt.event.*;
class P27 extends Frame implements ItemListener,ActionListener
 {
     Label lb1 = new Label ("Select State");
     Label lb2 = new Label ("List of Cities");
     Button b1=new Button("Exit");
     Choice ch = new Choice();

     List l = new List(5);
     

      P27()
       {
           setSize(500,500);
           setTitle("State & Its Cities");
           setLayout (new FlowLayout());
           setVisible(true);
           add(lb1); add(ch); add(lb2); add(l);add(b1);
           
           b1.addActionListener(this);
           addWindowListener (new closeclass());
           ch.addItemListener(this);
           ch.add("Maharashtra"); ch.add("Telangana"); ch.add("U.P");

       }
       public static void main (String ar[])
        {
            new P27();
        }
        public void actionPerformed(ActionEvent ae)
        {
            System.exit(0);
        }

        public void itemStateChanged(ItemEvent ae)
         {
             if(ch.getSelectedIndex()==0)
              {
                l.removeAll();
                l.add("Mumbai");
                l.add("Pune");
                l.add("Nanded");
                l.add("Nashik");
              }
              
                
              else if(ch.getSelectedIndex()==1)
              {
                l.removeAll();
                l.add("Hyderabad");
                l.add("Nalgonda");
                l.add("Warangal");
                l.add("Nizamabad");
              }
              
                  
              else if(ch.getSelectedIndex()==2)
              {
                l.removeAll();
                l.add("Lucknow");
                l.add("Varanasi");
                l.add("Agra");
                l.add("Noida");
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