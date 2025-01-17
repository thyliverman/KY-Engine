import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import ky.KYscreen;
import ky.Sprite;
import ky.Text;
import ky.Vector2D;

public class Main extends KYscreen {

	static int windowWidth = 1280;
	static int windowHeight = 720;
	static String windowTitle = "Project Name";
	static boolean windowResizable = false;
	static int fpsCap = 120;

	Sprite background;
	Player player;
	double cameraOffset = 100; 
	boolean cameraFollow = true;

	public Main() {
		super(windowWidth, windowHeight, windowTitle, windowResizable, fpsCap);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.start();
		m.run();
	}

	@Override
	public void start() {
		background = new Sprite("SuperToastBrosAssets/background.png", new Vector2D(0, 100), 0);
		background.setPos(400, 500);
		background.setVisible(true);
		background.setScale(new Vector2D(1, 2));
		add(background);
		
		player = new Player(windowWidth/2, windowHeight/2, 171, 185, 5);
		add(player);
		
		setDebugMode(true);
	}

	@Override
	public void update() {
		// logic
		if(getKeyStatus(KeyEvent.VK_G)) cameraFollow = !cameraFollow;
		
		if(!cameraFollow) return; // camera following stuff
		setCameraPos(player.getX() - getWidth()/2, player.getY() - getHeight()/2 - cameraOffset);
	}

	@Override
	public void keyPressed(int keyCode) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(int keyCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(int keyCode) {
		// TODO Auto-generated method stub
		
	}

}
