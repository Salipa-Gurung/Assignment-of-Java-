import java.awt.*;  
import java.awt.event.*;  

public class MouseMotionListenerExample implements MouseMotionListener
{  

    MouseMotionListenerExample()
    {  
        Frame f = new Frame();

        f.addMouseMotionListener(this);  
          
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  

    public void mouseDragged(MouseEvent e) 
    {  
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),20,20);  
    }  
    public void mouseMoved(MouseEvent e) {}  
  
    public static void main(String[] args) 
    {  
        new MouseMotionListenerExample();  
    }  
}  