package view;

import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	ScreenFigures sf;

	public void settings () {
		size(500,500);
		sf= new ScreenFigures(this);
	}
	public void setup() {
		
	}
	
	public void draw() {
		background (0);
		sf.randomPaint();
		sf.drawFigure();
	}
	public void mouseClicked() {
		sf.randomSetup();
	}


}

