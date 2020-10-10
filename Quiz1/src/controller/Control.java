package controller;

import model.Logic;
import processing.core.PApplet;

public class Control {
	PApplet app;
	Logic logic;
	
	public Control (PApplet app) {
		this.app=app;
		logic= new Logic(app);
	}
	public void drawFigure() {
		logic.drawFigure();
	}

	public void randomPaint() {
		logic.randomPaint();
	}
	public void randomSetup() {
		logic.randomSetup();
	}
	/*
	public void readtext(){
		logic.readText();
	}*/

}
