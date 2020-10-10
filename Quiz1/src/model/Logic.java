package model;

import java.util.ArrayList;


import processing.core.PApplet;

public class Logic extends PApplet{
	PApplet app;
	Figure ellipse;
	Figure square;
	ArrayList<String> words;
	ArrayList<Figure> figure;
	
	public Logic (PApplet app) {
		this.app=app;
		ellipse= new Ellipse(50,50, 50, 50, 0, 255, 0, app);
		figure = new ArrayList<Figure>();
	}
	public void drawCircle() {
		ellipse.paintFigure();
		ellipse.moveAlt();
	}
	public void drawSquare() {
		ellipse.paintFigure();
	}
	public void randomPaint() {
		for (int i = 0; i < figure.size(); i++) {
			figure.get(i).paintFigure();
			figure.get(i).moveAlt();
		}
	}

	public void randomSetup() {
		
		int posX = (int) random (0,500);
		int posY = (int) random (0,500);
		int sizeX = (int) random (30,80);
		int sizeY = (int) random (30,80);
		int r = (int) random (0,255);
		int g = (int) random (0,255);
		int b = (int) random (0,255);
		int gen = (int) random (0,2);
		
		switch (gen) {
		case 0:
			figure.add(new Ellipse(posX,posY,sizeX,sizeY,r,g,b,app));
		break;
		case 1:
			figure.add (new Square(posX,posY,sizeX,sizeY,r,g,b,app));
		break;
		}
	}	
	
	public void readText () {
			
			System.out.println(words);
		}
	}

