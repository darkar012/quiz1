package model;

import processing.core.PApplet;

public class Ellipse extends Figure{

	public Ellipse(int posX, int posY, int sizeX, int sizeY, int r, int g, int b, PApplet app) {
		super(posX, posY, sizeX, sizeY, r, g, b, app);
	}

	protected void paintFigure() {
	app.fill (getR(),getG(),getB());
	app.ellipse(getPosX(), getPosY(), getSizeX(), getSizeY());
	}

}
