import java.awt.*;
import java.util.*;
import java.awt.event.*;
class P13 extends Frame implements Runnable
{
    Random rg = new Random();    
    Thread th;
    P13(){
        setTitle("Screen Saver");
        setSize(500,500);
        setVisible(true);
        addWindowListener(new closingclass());
        th=new Thread(this);
        th.start();
    }
    public static void main(String args[]){
        new P13();
    }
    public void run(){
        try{
            for(;;){
                int R = rg.nextInt(256);
                int G = rg.nextInt(256);
                int B = rg.nextInt(256);
                Color c = new Color(R,G,B);
                
                setBackground(c);
                th.sleep(1000);
            }
        }catch(Exception e){}
    }
    class closingclass extends WindowAdapter{
        public void windowClosing(WindowEvent WE){
            System.exit(0);
        }
    }
}