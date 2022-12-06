import java.awt.*;
import java.awt.event.*;

class P23 extends Frame implements ActionListener
{
    Label lb1=new Label("Student Name :");
    Label lb2=new Label("Q1.What is Your Name ?");
    Label lb3=new Label("Q2.What is Your Brother Name ?");
    Label lb4=new Label("Q3.What is Your Class Name ?");
    Label lb5=new Label("Score :");

    CheckboxGroup cbg1=new CheckboxGroup();
    Checkbox cb1=new Checkbox("Mahesh",cbg1,false);
    Checkbox cb2=new Checkbox("Bala",cbg1,false);
    Checkbox cb3=new Checkbox("Balaji",cbg1,false);
    Checkbox cb4=new Checkbox("Balya",cbg1,false);

    CheckboxGroup cbg2=new CheckboxGroup();
    Checkbox cb5=new Checkbox("Adarsh",cbg2,false);
    Checkbox cb6=new Checkbox("Sunil",cbg2,false);
    Checkbox cb7=new Checkbox("Sachin",cbg2,false);
    Checkbox cb8=new Checkbox("Krishna",cbg2,false);

    CheckboxGroup cbg3=new CheckboxGroup();
    Checkbox cb9=new Checkbox("Bsc.Cs",cbg3,false);
    Checkbox cb10=new Checkbox("BI",cbg3,false);
    Checkbox cb11=new Checkbox("BT",cbg3,false);
    Checkbox cb12=new Checkbox("BCA",cbg3,false);

    Button b1=new Button("Submit");
    Button b2=new Button("Close");
    TextField tf1=new TextField(40);
    TextField tf5=new TextField(40);
    
    P23()
    {
        setSize(400,400);
        setTitle("Simple MCQ Test");
        setVisible(true);
        setLayout(new FlowLayout());

        add(lb1);add(tf1);

        add(lb2);
        add(cb1);add(cb2);add(cb3);add(cb4);

        add(lb3);
        add(cb5);add(cb6);add(cb7);add(cb8);

        add(lb4);
        add(cb9);add(cb10);add(cb11);add(cb12);

        add(b1);

        add(lb5);add(tf5);

        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        cb1.addMouseListener(new Eventclass());
        cb2.addMouseListener(new Eventclass());
        cb3.addMouseListener(new Eventclass());
        cb4.addMouseListener(new Eventclass());

        cb5.addMouseListener(new Eventclass());
        cb6.addMouseListener(new Eventclass());
        cb7.addMouseListener(new Eventclass());
        cb8.addMouseListener(new Eventclass());

        cb9.addMouseListener(new Eventclass());
        cb10.addMouseListener(new Eventclass());
        cb11.addMouseListener(new Eventclass());
        cb12.addMouseListener(new Eventclass());
        addWindowListener (new closeclass());
    }
    public static void main(String arg[])
    {
        new P23();
    }
    public void actionPerformed(ActionEvent ex)
    {
        if(ex.getSource()==b1)
        {
          int score=0;
          if (cb1.getState())
            score++;
          if (cb7.getState())
            score++;
          if (cb12.getState()) 
            score++;
            tf5.setText(""+ score); 
        }  
        else
        {
            System.exit(0);
        }
    }
    class Eventclass extends MouseAdapter
    {
        public void mouseClicked(MouseEvent ex)
        {   
           
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