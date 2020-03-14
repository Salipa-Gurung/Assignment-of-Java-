import java.awt.*;  
import java.awt.event.*;  

class CloseFrame extends WindowAdapter{  
    Frame f;  

    CloseFrame()
    {  
        f=new Frame();  
        f.addWindowListener(this);  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }

    public void windowClosing(WindowEvent e) 
    {  
         f.dispose();  
    }  

    public static void main(String[] args) 
    {  
        new CloseFrame();  
    }  
}  