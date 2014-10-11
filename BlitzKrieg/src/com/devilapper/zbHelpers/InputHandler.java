package com.devilapper.zbHelpers;

import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;
import com.devilapper.GameObjects.Baby;

public class InputHandler implements GestureListener {

	private Baby myBaby;

	public InputHandler(Baby b) {
		// myBird now represents the gameWorld's bird.
		myBaby = b;
	}

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		if (Math.abs(velocityX) > Math.abs(velocityY)) {
			if (velocityX > 0) {
				myBaby.rightSwipe();// x cordinate
			} else if (velocityX < 0) {
				myBaby.leftSwipe();
			} else {
				// Do nothing.
			}
		} else { // up/down swipes
			if (velocityY > 0) {
				myBaby.downSwipe();
			} else if (velocityY < 0) {

				myBaby.upSwipe();
			} else {
				// Do nothing.
			}

		}
		return true;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean panStop(float x, float y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {
		// TODO Auto-generated method stub
		return false;
	}

}
