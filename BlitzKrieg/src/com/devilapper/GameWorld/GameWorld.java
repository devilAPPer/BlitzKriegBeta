package com.devilapper.GameWorld;

import com.devilapper.GameObjects.Baby;

public class GameWorld {
	private Baby baby;

	public Baby getBaby() {
		return baby;
	}

	public GameWorld(int midPointY) {
		baby = new Baby(33, midPointY - 5, 17, 12);
		
	}

	public void update(float delta) {
		baby.update(delta);
	}

}
