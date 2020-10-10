package model;

import processing.core.PApplet;

public class Ellipse extends Figure{

	public Ellipse(int x, int y, PApplet app) {
		super(x, y, app);
	}

	protected void paintFigure() {
	app.ellipse(getX(), getY(), 50, 50);
	}	
}
