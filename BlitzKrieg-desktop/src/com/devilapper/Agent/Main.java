package com.devilapper.Agent;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.devilapper.Agent.ZBGame;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "blitZKrieg";
		cfg.useGL20 = false;
		cfg.width = 272;
		cfg.height = 408;
		
		new LwjglApplication(new ZBGame(), cfg);
	}
}
