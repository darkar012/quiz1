package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {

	private int x;
	private int y;
	PApplet app;
	
		public Figure (int x, int y, PApplet app) {
			this.x=x;
			this.y=y;
			this.app=app;
		}
	protected abstract void paintFigure();
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
