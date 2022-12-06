import java.awt.*;
import java.awt.event.*;
class P15 extends Frame implements ActionListener
{
	Label lb1=new Label("Emp Name");
	Label lb2=new Label("Grade");
  Label lb3=new Label("Basic Sal");
  Label lb4=new Label("HRA");
  Label lb5=new Label("TA");
  Label lb6=new Label("DA");
  Label lb7=new Label("Ptax");
  Label lb8=new Label("Itax");
  Label lb9=new Label("NetSalary");
  Button b1=new Button("Submit");
  Button b2=new Button("Quit");
  TextField tf1=new TextField(20);
  TextField tf2=new TextField(20);
  TextField tf3=new TextField(20);
  TextField tf4=new TextField(20);
  TextField tf5=new TextField(20);
  TextField tf6=new TextField(20);
  TextField tf7=new TextField(20);
  TextField tf8=new TextField(20);
  TextField tf9=new TextField(20);
    P15()
    {
    	setSize(500,500);
    	setTitle("Employee2");
    	setVisible(true);
    	setLayout(new FlowLayout());
    	b1.addActionListener(this);
    	b2.addActionListener(this);
      
      addWindowListener(new closeclass());
    	add(lb1);add(tf1);
    	add(lb2);add(tf2);
      add(b1);
    	add(lb3);add(tf3);
    	add(lb4);add(tf4);
    	add(lb5);add(tf5);
    	add(lb6);add(tf6);
    	add(lb7);add(tf7);
      add(lb8);add(tf8);
      add(lb9);add(tf9);
    	add(b2);
    }
    public static void main(String arg[])
    {
    	new P15();
    }
    public void actionPerformed(ActionEvent ex)
    {
      char grade;
      double bsal,hra,ta,da,ptax,itax,netsalary;


      grade=tf2.getText().charAt(0);
      if(grade =='A'|| grade =='a')
        {
          if(ex.getSource()==b1)
          {
            bsal=10000;
            hra=(bsal*12.5)/100;
            ta=(bsal*13.9)/100;
            da=(bsal*14.6)/100;
            ptax=(bsal*5.7)/100;
            itax=(bsal*9.9)/100;
            netsalary=(bsal+hra+ta+da-(ptax+itax));

            tf3.setText(""+bsal);tf4.setText(""+hra);tf5.setText(""+ta);
            tf6.setText(""+da);tf7.setText(""+ptax);tf8.setText(""+itax);
            tf9.setText(""+netsalary);
          }
       }
      else if(grade =='B'|| grade =='b')
      {
        if(ex.getSource()==b1)
          {
            bsal=9000;
            hra=(bsal*11.4)/100;
            ta=(bsal*10.6)/100;
            da=(bsal*9.8)/100;
            ptax=(bsal*4.3)/100;
            itax=(bsal*7.3)/100;
            netsalary=(bsal+hra+ta+da-(ptax+itax));

            tf3.setText(""+bsal);tf4.setText(""+hra);tf5.setText(""+ta);
            tf6.setText(""+da);tf7.setText(""+ptax);tf8.setText(""+itax);
            tf9.setText(""+netsalary);
          }
     }
      else if(grade =='C'|| grade =='c')
      {
            if(ex.getSource()==b1)
          {
            bsal=8000;
            hra=(bsal*10.10)/100;
            ta=(bsal*9.1)/100;
            da=(bsal*8.3)/100;
            ptax=(bsal*3.9)/100;
            itax=(bsal*2.5)/100;
            netsalary=(bsal+hra+ta+da-(ptax+itax));

            tf3.setText(""+bsal);tf4.setText(""+hra);tf5.setText(""+ta);
            tf6.setText(""+da);tf7.setText(""+ptax);tf8.setText(""+itax);
            tf9.setText(""+netsalary);
          }
     }
     else
     {
      System.exit(0);
     }
     
  }
  class closeclass extends WindowAdapter
    {
      public void windowClosing(WindowEvent ex){
        System.exit(0);
      }
    } 
}