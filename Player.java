

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite implements Gameconstants {
private ArrayList<Bullet> bulletList =  new ArrayList<>() ;
	
	
	
	public ArrayList<Bullet> getBulletList() {
		return bulletList;
	}
	public void setBulletList(ArrayList<Bullet> bulletList) {
		this.bulletList = bulletList;
	}

	private boolean isJump ;
	private int acc;
	public Player(){
		x = 100;
		w = 100;
		h = 100;
		y = FLOOR - (h-20);
		
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	public void drawPlayer(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}
	public void fire(){
		Bullet bullet = new Bullet(x+w/4,y+h/4);
		bulletList.add(bullet);
		
	
	}

	public void move(){
		x += speed;
	}
	
	public void jump(){
		if(!isJump){
		acc = -20;
		 y = y + acc;
		isJump = true;
		}
	}
	public void fall(){
		if(y<(FLOOR - (h-22))){
			acc = acc + GRAVITY;
			y = y + acc;
		}
		if(y>=(FLOOR - (h-22))){
			isJump = false;
		}
	}
}
