package com.berkay.command;

public class MarioUpCommand implements Command {
	private MarioCharacter marioCharacter;
	
		
	MarioUpCommand(MarioCharacter marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		marioCharacter.moveUp();
		
	}

}
