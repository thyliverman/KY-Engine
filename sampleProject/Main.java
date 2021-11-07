import java.awt.Color;
import java.awt.Font;

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
		Sprite background = new Sprite("SuperToastBrosAssets/background.png", new Vector2D(0, 100), 0);
		background.setPos(400, 500);
		background.rescale(2);
		background.setVisible(true);
		add(background);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
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
