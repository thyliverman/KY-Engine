import java.awt.event.KeyEvent;
import java.util.ArrayList;

import ky.Sprite;
import ky.CollisionEntity;
import ky.*;

public class Player extends CollisionEntity {

	Sprite playerSprite;
	public static int speedMultiplier = 1000;
	
	public Player(double x, double y, int collisionBoxWidth, int collisionBoxHeight, int layer) {
		super(x, y, collisionBoxWidth, collisionBoxHeight, layer);
		playerSprite = new Sprite("SuperToastBrosAssets/crown.png", new Vector2D(0,0), 1, "player");
		playerSprite.setVisible(true);
		add(playerSprite);
		setCollision(true);
		setVisible(true);
	}
	
	@Override
	public void update(double deltaT, ArrayList<Integer> keyCodes) {
		int x = 0;
		int y = 0;
		
		// bit gross buit its 1233 am lol
		if(keyCodes.contains(KeyEvent.VK_A)) {
			x = -1;
		}
		if(keyCodes.contains(KeyEvent.VK_D)) {
			x = 1;
		}
		if(keyCodes.contains(KeyEvent.VK_W)) {
			y = -1; // as y increases we move down
		}
		if(keyCodes.contains(KeyEvent.VK_S)) {	
			y = 1;
		}
		
		addPos(Vector2D.multiply(new Vector2D(x,y), speedMultiplier * deltaT));
	}
	

}
