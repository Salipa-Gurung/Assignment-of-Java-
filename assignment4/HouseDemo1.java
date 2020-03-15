import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class HouseDemo1 extends JFrame
{

	HouseDemo1()
	{
		// super("2D House Demo");
		setSize(1500,900);
		setVisible(true);
		setBackground(new Color(0,255,0));
	}

	public void paint(Graphics g)
	{
		// super.paint(g);
		//g.fillRoundRect(15,40,80,55,50,50);
		g.setColor(Color.red);
		g.fill3DRect(550,350,300,200,false);
		g.setColor(Color.black);
		g.drawRect(550,350,300,200);

		g.setColor(Color.white);
		g.fill3DRect(625,410,150,70,false);

	/*	g.setColor(Color.black);
		g.fillArc(400,100,400,200,60,-170);  */

		g.setColor(Color.black);
		g.drawRect(625,410,150,70);
		g.drawLine(662,410,662,480);
		g.drawLine(699,410,699,480);
		g.drawLine(736,410,736,480);


		// g.drawLine(500,350,700,210);
		// g.drawLine(700,210,900,350);
		// g.drawLine(500,350,900,350);
		g.setColor(new Color(155, 105, 35));
		int[] x= {500,700,900,500};
		int[] y= {350,210,350,350};
	
	//	g.drawPolygon(x,y,3);
		// g.drawPolygon(500, 350, 700, 210, 900, 350, 500, 350);
		g.fillPolygon(x,y,4);      

		//g.drawOval(195,40,80,55);
	}

	public static void main(String[] args) 
	{
		HouseDemo1 demo=new HouseDemo1();
	
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
/* 
<applet code="SetBackColor" width=200 height=200>
</applet>
*/