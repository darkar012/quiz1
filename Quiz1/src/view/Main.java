package view;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	PApplet app;
	ScreenFigures sf;
	String[] figureWords;
	ArrayList<String> words;


	public void settings () {
		size(500,500);
		
		sf= new ScreenFigures(app);
	}
	public void setup() {
		/*figureWords = loadStrings("../resources/figurePainting.txt");
		sf.readText();
		/*words = new ArrayList<String>();
		for (int i = 0; i < figureWords.length; i++) {
			String [] tempArray = figureWords[i].split(" ");
			for (int j = 0; j < tempArray.length; j++) {
				words.add(tempArray[j]);
			}
	}*/
	}
	
	
	public String[] getFigureWords() {
		return figureWords;
	}
	public void setFigureWords(String[] figureWords) {
		this.figureWords = figureWords;
	}
	public void draw() {
		background (0);
		sf.randomPaint();
		/*for (int i = 0; i < words.size(); i++) {
			
			if (words.get(i).equals("Cuadrado") && words.get(i).equals("50") && words.get(i).equals("400") && words.get(i).equals("30") &&  words.get(i).equals("-1")) {
				
				sf.drawCircle();
			}*/
	}
	public void mouseClicked() {
		sf.randomSetup();
	}


}

