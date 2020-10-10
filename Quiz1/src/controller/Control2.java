package controller;

import processing.core.PApplet;
import view.Main;

public class Control2 {
	PApplet app;
	Main main;
	
	public Control2 (PApplet app) {
		this.app=app;
		main = new Main ();
	}
	public String[] getTxt() {
		return main.getFigureWords();
	}

}
