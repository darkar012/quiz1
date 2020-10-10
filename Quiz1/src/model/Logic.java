package model;

import java.util.ArrayList;

import controller.Control2;
import processing.core.PApplet;

public class Logic extends PApplet{
	PApplet app;
	Control2 control;
	Figure ellipse;
	Figure square;
	ArrayList<String> words;
	String[] figureWords;
	ArrayList<Figure> figure;
	
	public Logic (PApplet app) {
		this.app=app;
		//ellipse= new Ellipse(50,50,0, 0, 0, display, display, this.app);
		control = new Control2(this.app);
		figure = new ArrayList<Figure>();
	}
	public void drawCircle() {
		ellipse.paintFigure();
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
			figureWords = control.getTxt();
			words = new ArrayList<String>();
			for (int i = 0; i < figureWords.length; i++) {
				String [] tempArray = figureWords[i].split(" ");
				for (int j = 0; j < tempArray.length; j++) {
					words.add(tempArray[j]);
				}
		}
			System.out.println(words);
		}
	}

