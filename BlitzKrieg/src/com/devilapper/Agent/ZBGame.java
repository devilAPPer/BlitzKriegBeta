package com.devilapper.Agent;

import com.badlogic.gdx.Game;
import com.devilapper.Screens.GameScreen;
import com.devilapper.zbHelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		System.out.println("BlitZKrieg Created!");
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
