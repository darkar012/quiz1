package view;

import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	PApplet app;
	ScreenFigures sf;
	

	public void settings () {
		size(500,500);
	}
	public void setup() {
		sf=new ScreenFigures(this);
	}
	public void draw() {
		background (0);
		sf.drawCircle();
	}

}

