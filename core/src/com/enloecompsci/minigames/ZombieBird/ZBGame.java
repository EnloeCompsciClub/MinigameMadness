package com.enloecompsci.minigames.ZombieBird;

import com.badlogic.gdx.Game;
import com.enloecompsci.minigames.Screens.SplashScreen;
import com.enloecompsci.minigames.ZBHelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}