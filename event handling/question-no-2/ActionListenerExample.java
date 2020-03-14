import java.awt.*;
import java.awt.event.*;

class ActionListenerExample implements ActionListener
{
	TextField tf;
	ActionListenerExample()
	{
		Frame f = new Frame();

			f.setSize(300, 300);
			f.setVisible(true);
			f.setLayout(null);

		Button btn = new Button("Click Here");
		btn.setBounds(100,120,80,30);
		btn.addActionListener(this);
		
		tf = new TextField("");
		tf.setBounds(60,50,170,20);

		f.add(tf);
		f.add(btn);

	}

	public void actionPerformed(ActionEvent e)
	{  
		tf.setText("Button clicked");  
	}  

	public static void main(String[] args) 
	{
		new ActionListenerExample();
	}
}