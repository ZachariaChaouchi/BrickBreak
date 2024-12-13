import java.awt.*;

public class Paddle {

	// your code here!

	// don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	// constructor(s):
	public Paddle(int initX, int initY, int initWidth, int initHeight) {
		this.x = initX;
		this.y = initY;
		this.width = initWidth;
		this.height = initHeight;
		velocity = 1;
	}

	// methods:

	public void draw(Graphics g) {
		g.fillRect(x,y,width,height);
	}

	public void move() {
		this.x += velocity;
	}

	public void addVelocity(int addV) {
		this.velocity += addV;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public void setVelocity(int newVelocity) {
		this.velocity = newVelocity;
	}
}
