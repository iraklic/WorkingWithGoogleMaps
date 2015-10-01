package myGUIModule;

import processing.core.*;

public class sunrise extends PApplet
	{
	private String URL = "http://www.ithhostels.com/wordpress/wp-content/uploads/2015/04/san-diego-beaches.jpg";
	private PImage backgroundImg; 
	public void setup()
		{
		size(500, 500);
		background(0, 255, 0);
		backgroundImg = loadImage(URL, "jpg");
		}

	public void draw()
		{
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		int daytime = (int) (255*second())/60;
		float y = 270 - second();
		float x = 300 + second();
		fill(daytime, daytime, 0);
		float angle1 = (float) (PI  + PI*(50.0 + second())/360.);
		float angle2 = (float) (TWO_PI - PI*(50.0 + second())/360.);
		arc(x, y, width/5, height/5, angle1, angle2);
//		ellipse(x, y, width/5, height/5);
		}

	}