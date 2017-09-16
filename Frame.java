
import javax.swing.JFrame;

import jaco.mp3.player.MP3Player;

public class Frame extends JFrame implements Gameconstants {

	public Frame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		Board board = new Board();
		add(board);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Dave Game - 2017");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void PlaySong(){
	MP3Player mp3 =new MP3Player(Frame.class.getResource("music.mp3"));
	mp3.play();
}
	
	public static void main(String[] args) {
		Frame obj = new Frame();
		obj.PlaySong();
	}

}
