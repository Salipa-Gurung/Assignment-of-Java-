import java.awt.*;
import java.awt.event.*;

public class HouseDemo1 extends Canvas
{

	/*HouseDemo1()
	{
		super("2D House Demo");
		setSize(1500,900);
		setVisible(true);
		setBackground(new Color(0,255,0));
	}   */

	public void paint(Graphics g)
	{
		//super.paint(g);
		g.setColor(Color.red);
		g.fill3DRect(550,350,300,200,false);
		g.setColor(Color.black);
		g.drawRect(550,350,300,200);

		g.setColor(Color.white);
		g.fill3DRect(625,410,150,70,false);

		g.setColor(new Color(160, 110, 40));
		int[] x= {500,700,900,500};
		int[] y= {350,210,350,350};
	
		g.fillPolygon(x,y,4);   

		g.setColor(Color.black);
		g.drawRect(625,410,150,70);
		g.drawLine(662,410,662,480);
		g.drawLine(699,410,699,480);
		g.drawLine(736,410,736,480);
		g.drawPolygon(x,y,4);

		g.setColor(Color.yellow);
		g.fillOval(1000,90,70,70);
		// g.drawLine(500,350,700,210);
		// g.drawLine(700,210,900,350);
		// g.drawLine(500,350,900,350);     
	}

	public static void main(String[] args) 
	{
		HouseDemo1 demo=new HouseDemo1();
			Frame f=new Frame();

			f.setSize(1500,900);
			f.setVisible(true);
			f.setBackground(new Color(0,100,0));
			f.add(demo);
	}
}
