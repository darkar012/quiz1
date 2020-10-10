package model;

import processing.core.PApplet;

public class Square extends Figure{

	public Square(int posX, int posY, int sizeX, int sizeY, int r, int g, int b, PApplet app) {
		super(posX, posY, sizeX, sizeY, r, g, b, app);
	}

	protected void paintFigure() {
		app.fill (getR(),getG(),getB());
		app.rect(getPosX(), getPosY(), getSizeX(), getSizeY());
	}	
}

