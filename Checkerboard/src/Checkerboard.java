import java.awt.*;
import javax.swing.*;

public class Checkerboard extends Canvas 
	{
 
	private static final long	serialVersionUID	= 1L;

    public static void main(String[] args) 
    		{
        Checkerboard canvas = new Checkerboard();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setResizable(false);
        frame.setVisible(true);
    		}

    public void paint(Graphics graphics) 
    		{
	        graphics.setColor(Color.blue);
	 
	        for (int y = 10; y < 160; y = y + 40)
	        	{
		        for ( int x = 10; x < 160; x = x + 40)
		        	{
			        graphics.drawRect(x,      y,      19, 19);
		        	graphics.fillRect(x + 20, y,      20, 20);
		        	}
	        	}
	        for (int y = 30; y < 160; y = y + 40)
	        	{
		        for ( int x = 10; x < 160; x = x + 40)
		        	{
			        graphics.fillRect(x,      y,      20, 20);
			        graphics.drawRect(x + 20, y,      19, 19);
		        	}
	        	}
    		}
	}