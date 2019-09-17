package com.berkay.template;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play() {
		loadAssets();
		initialize();
		startPlay();
		if(addNewCharacter()) {
			addNewCharacterToTheGame();
		}
		endPlay();	
	}
	protected abstract void addNewCharacterToTheGame();
	
	void loadAssets() {
		System.out.println("Loading game assets...");
	}
	boolean addNewCharacter() {
		return true;
		
	}

}
