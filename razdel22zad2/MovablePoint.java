package razdel22zad2;

public class MovablePoint 
	implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	public void moveUp(){
	y++;
	}
	public void moveDown(){
		y--;
	}
	public void moveLeft(){
		x--;
	}
	public void moveRight(){
		x++;
	}
	MovablePoint(int x,int y,int xSpeed,int ySpeed){
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.x=xSpeed;
	}
	MovablePoint(){
	
	}
}
