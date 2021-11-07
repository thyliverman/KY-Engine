package p;

import ky.Sprite;
import ky.CollisionEntity;
import ky.Vector2D;

public class Win extends CollisionEntity {
	public Win(double x, double y, int collisionBoxWidth, int collisionBoxHeight, int layer) {
		super(x, y, collisionBoxWidth, collisionBoxHeight, layer, "win");
		
		Sprite crown = new Sprite("SuperToastBrosAssets/crown.png", new Vector2D(0, 0), 0, "crown");
		crown.setVisible(true);
		add(crown);
		

		setStaticCollision(true);
		
		setVisible(true);
		
	}
}
