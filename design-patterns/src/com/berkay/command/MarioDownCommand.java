package com.berkay.command;

public class MarioDownCommand implements Command {

	private MarioCharacter marioCharacter;
	
	
	MarioDownCommand(MarioCharacter marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		marioCharacter.moveDown();
		
	}

}
