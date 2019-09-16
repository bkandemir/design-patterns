package com.berkay.command;

public class MarioLeftCommand implements Command {
	private MarioCharacter marioCharacter;
	
	
	MarioLeftCommand(MarioCharacter marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		marioCharacter.moveLeft();
		
	}

}
