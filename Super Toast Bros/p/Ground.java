package p;

import ky.Sprite;
import ky.CollisionEntity;
import ky.Vector2D;

public class Ground extends CollisionEntity {

	public Ground(double x, double y, int collisionBoxWidth, int collisionBoxHeight, int layer, String name) {
		super(x, y, collisionBoxWidth, collisionBoxHeight, layer, name);
		Sprite wall = new Sprite("SuperToastBrosAssets/grass.png", new Vector2D(0, 0), 0, "grass");
		wall.setVisible(true);
		
		for(int i = -20; i < 50; i++) {
			Sprite clone = wall.clone();
			clone.setPos(i * wall.getWidth(), wall.getY());
			add(clone);
		}

		setStaticCollision(true);
		setCollision(true);
		setVisible(true);
		
	}

}
