import java.awt.*;

public class Ball {
	// your code here!

	// don't forget you need instance variables:
	private int xpos;
	private int ypos;
	private int xVelocity;
	private int yVelocity;
	private int size;

	// constructor(s):
	public Ball(int initXPos, int initYPos, int initSize) {
		this.xpos = initXPos;
		this.ypos = initYPos;
		this.size = initSize;
		xVelocity = 1;
		yVelocity = 1;
	}
	// methods:

	public void move() {
		this.xpos += this.xVelocity;
		this.ypos += this.yVelocity;
	}

	public void draw(Graphics g) {
		g.fillOval(xpos,ypos,size,size);
	}

	public int getXpos() {
		return xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public int getSize() {
		return size;
	}

	public void setXVelocity(int newXVelocity) {
		this.xVelocity = newXVelocity;
	}

	public void setYVelocity(int newYVelocity) {
		this.yVelocity = newYVelocity;
	}

	public void setX(int newX) {
		this.xpos = newX;
	}

	public void setY(int newY) {
		this.ypos = newY;
	}

	public void reverseX() {
		this.xVelocity = -(this.yVelocity);
	}

	public void reverseY() {
		this.yVelocity = -(this.yVelocity);
	}
}
