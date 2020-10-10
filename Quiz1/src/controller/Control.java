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
	public void drawCircle() {
		logic.drawCircle();
	}
}