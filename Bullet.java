import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Sprite implements Gameconstants{
	private boolean isVisible;
	
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public Bullet(int x, int y){
		this.x = x;
		this.y = y;
		this.speed = 8;
		this.h = this.w = 10;
		isVisible = true;
	}
	public void drawBullet(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, w, h);
	}
	public void move(){
		x+=speed;
	}
	public void outOfScreen(){
		if(x>=GAME_WIDTH){
			isVisible = false;
		}
	}
}
