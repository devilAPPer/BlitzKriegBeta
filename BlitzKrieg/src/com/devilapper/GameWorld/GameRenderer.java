package com.devilapper.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.devilapper.GameObjects.Baby;
import com.devilapper.zbHelpers.AssetLoader;

public class GameRenderer {

	private GameWorld myWorld;
	private OrthographicCamera cam;
	private ShapeRenderer shapeRenderer;
	private SpriteBatch batcher;
	private int midPointY;
	private int gameHeight;

	public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
		myWorld = world;

		// The word "this" refers to this instance.
		// We are setting the instance variables' values to be that of the
		// parameters passed in from GameScreen.
		this.gameHeight = gameHeight;
		this.midPointY = midPointY;

		cam = new OrthographicCamera();
		cam.setToOrtho(false, 137, 204);
		batcher = new SpriteBatch();
		// Attach batcher to camera
		batcher.setProjectionMatrix(cam.combined);

		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(cam.combined);
	}

	public void render(float runTime) {
		// We will move these outside of the loop for performance later.
		Baby baby = myWorld.getBaby();

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		// Begin SpriteBatch
		batcher.begin();

		// Draw bird at its coordinates. Retrieve the Animation object from
		// AssetLoader
		// Pass in the runTime variable to get the current frame.
		batcher.draw(AssetLoader.birdAnimation.getKeyFrame(runTime),
				baby.getX(), baby.getY(), baby.getWidth(), baby.getHeight());

		// End SpriteBatch
		batcher.end();

	}

}
