import java.awt.*;
import java.awt.event.*;
class Frame3 extends Frame
{
    Button b1= new Button("Submit");
    Button b2= new Button("Cancel");
   Frame3()
  {
     setSize(400,700);
     setTitle("Form");
     setVisible(true);
     addWindowListener(new closeclass());
     add(b1);add(b2);
     setLayout(new FlowLayout ());
  }
  public static void main(String arg[])
  { 
  new Frame3();
  }
   class closeclass extends WindowAdapter
  {
   public void windowClosing(WindowEvent w)  
    {
        System.exit(0);
   }
   }
}