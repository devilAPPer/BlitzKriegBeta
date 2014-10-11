package com.devilapper.GameObjects;

import com.badlogic.gdx.math.Vector2;

public class Baby {
	private Vector2 position;
	private Vector2 velocity;
	// private Vector2 accelerationR;
	// private Vector2 accelerationL;

	private float rotation; // For handling babys rotation
	private int width;
	private int height;

	public Baby(float x, float y, int width, int height) {
		this.width = width;
		this.height = height;
		position = new Vector2(x, y);
		velocity = new Vector2(0, 0);
		// accelerationR = new Vector2(10, 0);
	}

	public void update(float delta) {

		/*
		 * velocity.add(acceleration.cpy().scl(delta));
		 * 
		 * if (velocity.y > 200) { velocity.y = 200; } else if(velocity.x > 200)
		 * { velocity.x = 200; }
		 */
		velocity.y += 1 * delta;
		position.add(velocity.cpy().scl(delta));

	}

	public void rightSwipe() {
		System.out.println("Right");
		velocity.x += 20;
		// velocity.add(accelerationR.cpy());

	}

	public void leftSwipe() {
		System.out.println("left");
		velocity.x -= 20;
		// velocity.add(accelerationL.cpy());
	}

	/*
	 * public void onClick() { velocity.y = -140; }
	 */

	public float getX() {
		return position.x;
	}

	public float getY() {
		return position.y;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public float getRotation() {
		return rotation;
	}
}
