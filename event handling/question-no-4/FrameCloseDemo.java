import java.awt.*;  
import java.awt.event.*;  

class CloseFrameDemo extends WindowAdapter{  
    Frame f;  

    CloseFrameDemo()
    {  
        f = new Frame();  
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
        new CloseFrameDemo();  
    }  
}  