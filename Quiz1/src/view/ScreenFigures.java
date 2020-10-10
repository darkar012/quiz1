package view;

import controller.Control;
import processing.core.PApplet;

public class ScreenFigures {
	PApplet app;
	Control control;

	public ScreenFigures (PApplet app) {
		this.app=app;
		control = new Control(app);
	}
	public void drawFigure() {
		control.drawFigure();
	}
	
	public void randomPaint() {
		control.randomPaint();
	}
	public void randomSetup() {
		control.randomSetup();
	}
	/*
	public void readText() {
		control.readtext();
	}*/

}
