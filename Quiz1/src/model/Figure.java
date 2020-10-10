package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {

	protected int posX;
	protected int posY;
	protected int sizeX;
	protected int sizeY;
	protected int speed;
	protected int dirY;
	protected int dirX;
	protected int r;
	protected int g;
	protected int b;
	PApplet app;
	
		public Figure (int posX, int posY, int sizeX, int sizeY, int r, int g, int b, PApplet app) {
			this.sizeX=sizeX;
			this.sizeY=sizeY;
			this.app=app;
			this.posX=posX;
			this.posY=posY;
			this.r=r;
			this.g=g;
			this.b=b;
			this.speed = 5;
			this.dirY=1;
			this.dirX=1;
		}
		
	protected abstract void paintFigure();
	
	protected void moveAlt(){
		this.posY = this.posY + this.dirY*this.speed;
		if (this.posY >= 600 || this.posY <= 0) {
			this.dirY = this.dirY*(-1);
		}else if (this.posY == 500) {
			posY = 0;
		}else if (this.posY == 0) {
			posY = 500;
		}
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getDirY() {
		return dirY;
	}
	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
