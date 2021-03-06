package UI.map;

import java.util.ArrayList;
import java.util.Collections;

import constants.Images;
import javafx.scene.canvas.GraphicsContext;
import sprite.HealthEntity;
import sprite.enemy.Enemy;

public class Map_StageBoss extends Map {
	private ArrayList<HealthEntity> enemies;
	private Enemy e1 = new Enemy(1, 690, 50,  150, 20, 15, 24, 10, "Enemy 1", Images.badWizardIdles, Images.badWizardAtks);
	private Enemy e2 = new Enemy(1, 850, 180, 400, 40, 20, 26, 10, "Boss", Images.bossIdles, Images.bossAtks);
	private Enemy e3 = new Enemy(1, 710, 330, 150, 20, 15, 25, 10, "Enemy 3", Images.badWizardIdles, Images.badWizardAtks);

	public Map_StageBoss() {
		super(constants.Images.bossBG, 6);
		enemies = new ArrayList<>();

		Collections.addAll(enemies, e1, e2, e3);
	}

	@Override
	public void draw(GraphicsContext gc) {
		gc.drawImage(mapImage, 0, 0);
		for (int i = 0; i < enemies.size(); ++i) {
			if (!enemies.get(i).isDead()) {
				enemies.get(i).draw(gc);
			}
		}
	}

	@Override
	public ArrayList<HealthEntity> getEnemies() {
		// TODO Auto-generated method stub
		return enemies;
	}
}
