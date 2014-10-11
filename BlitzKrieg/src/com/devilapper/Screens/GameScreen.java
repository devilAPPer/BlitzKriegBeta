package com.devilapper.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.input.GestureDetector;
import com.devilapper.GameWorld.GameRenderer;
import com.devilapper.GameWorld.GameWorld;
import com.devilapper.zbHelpers.InputHandler;

public class GameScreen implements Screen {

	private GameWorld world;
	private GameRenderer renderer;
	InputHandler controller;
	GestureDetector gestureDetector;
	private float runTime = 0;

	// This is the constructor, not the class declaration
	public GameScreen() {
		System.out.println("GameScreen Attached");

		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 136;
		float gameHeight = screenHeight / (screenWidth / gameWidth);

		int midPointY = (int) (gameHeight / 2);

		world = new GameWorld(midPointY);
		renderer = new GameRenderer(world, (int) gameHeight, midPointY);
		controller = new InputHandler(world.getBaby());
		gestureDetector = new GestureDetector(20, 0.5f, 2, 0.15f, controller);
		Gdx.input.setInputProcessor(gestureDetector);
	}

	@Override
	public void render(float delta) {
		runTime += delta;
		world.update(delta);
		renderer.render(runTime);
	}

	@Override
	public void resize(int width, int height) {
		System.out.println("GameScreen - resizing");
	}

	@Override
	public void show() {
		System.out.println("GameScreen - show called");
	}

	@Override
	public void hide() {
		System.out.println("GameScreen - hide called");
	}

	@Override
	public void pause() {
		System.out.println("GameScreen - pause called");
	}

	@Override
	public void resume() {
		System.out.println("GameScreen - resume called");
	}

	@Override
	public void dispose() {
		// Leave blank
	}

}
