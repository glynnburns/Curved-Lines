// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		
		
		// Draw Random Lines
		Random rndLine = new Random();
		for (int k = 1; k < 100; k++)
		{
			int x1 = rndLine.nextInt(390)+10;
			int y1 = rndLine.nextInt(290)+10;
			int x2 = rndLine.nextInt(390)+10;
			int y2 = rndLine.nextInt(290)+10;
			
		Random rndInt = new Random();
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);
			g.setColor(new Color(red,green,blue));
			g.drawLine(x1, y1, x2, y2);
			
		}
		// Draw Random Squares
		Random rndSq = new Random();
		for (int s = 1; s < 100; s++)
		{
			int x3 = rndSq.nextInt(340)+400;
			int y3 = rndSq.nextInt(240)+10;
			
			Random rndInt = new Random();
			int re = rndInt.nextInt(256);
			int gr = rndInt.nextInt(256);
			int bl = rndInt.nextInt(256);
			g.setColor(new Color(re,gr,bl));
			g.fillRect(x3, y3, 50, 50);
		}

		// Draw Random Circles
		Random rndCr = new Random();
		for (int c = 1; c < 100; c++)
		{
			int c1 = rndCr.nextInt(200);
			
			int x4 = rndCr.nextInt(390-c1)+10;
			int y4 = rndCr.nextInt(290-c1)+300;
			
			Random rndInt = new Random();
			int re = rndInt.nextInt(256);
			int gre = rndInt.nextInt(256);
			int blu = rndInt.nextInt(256);
			g.setColor(new Color(re,gre,blu));
			g.drawOval(x4, y4, c1, c1);
			
		}
		
		// Draw 3-D Box	
		Polygon cube1 = new Polygon ();
		cube1.addPoint(550, 400);
		cube1.addPoint(550, 500);
		cube1.addPoint(650, 500);
		cube1.addPoint(650, 400);
		//g.drawPolygon(cube1);
		int red = 250;
		int green = 20;
		int blue = 20;
		g.setColor(new Color(red,green,blue));
		g.fillPolygon(cube1);
		
		Polygon object2 = new Polygon ();
		object2.addPoint(550, 400);
		object2.addPoint(500, 350);
		object2.addPoint(500, 450);
		object2.addPoint(550, 500);
		g.drawPolygon(object2);
		int rojo = 20;
		int verde = 250;
		int azul = 20;
		g.setColor(new Color(rojo,verde,azul));
		//g.drawPolygon(object2);
		g.setColor(new Color(rojo,verde,azul));
		g.fillPolygon(object2);
		
		Polygon object3 = new Polygon();
		object3.addPoint(500, 350);
		object3.addPoint(615, 350);
		object3.addPoint(615, 400);
		object3.addPoint(550, 400);
		//g.drawPolygon(object3);
		int red1 = 255;
		int green1 = 255;
		int blue1 = 0;
		g.setColor(new Color(red1,green1,blue1));
		g.fillPolygon(object3);
	
		Polygon tri = new Polygon();
		tri.addPoint(615, 350);
		tri.addPoint(650, 400);
		tri.addPoint(615, 400);
		//g.drawPolygon(tri);
        int red2 = 0;
        int green2 = 0;
        int blue2 = 204;
        g.setColor(new Color(red2,green2,blue2));
        g.fillPolygon(tri);
		
	}
		
}



    
 