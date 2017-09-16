//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//
//public class Camera implements Gameconstants {
//	BufferedImage image;
//	int x ;
//	int y;
//	int speed;
//	public  void loadImage(){
//		
//		try {
//			// Load Full Image in Memory
//			 image = ImageIO.read(Camera.class.getResource("bg5.jng"));
//			 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//		}
//		
//		
//	}
//	public void left(){
//		speed = -5;
//	}
//	public void right(){
//		speed = 5;
//	}
//	
//	public void move(){
//		x = x + speed;
//	}
//	
//	public void drawCameraImage(Graphics g){
//		Image img = image.getSubimage(x, y, GAME_WIDTH, GAME_HEIGHT);
//		g.drawImage(img, 0, 0,GAME_WIDTH,GAME_HEIGHT , null);
//	}
//	
//}
