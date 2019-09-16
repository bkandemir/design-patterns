package com.berkay.command;

public class MarioRightCommand implements Command {
	private MarioCharacter marioCharacter;
	
	
	MarioRightCommand(MarioCharacter marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		marioCharacter.moveRight();
		
	}

}
