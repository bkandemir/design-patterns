package com.berkay.command;

public class LuigiRightCommand implements Command {
	private LuigiCharacter luigiCharacter;
	
	
	LuigiRightCommand(LuigiCharacter luigiCharacter) {
		this.luigiCharacter = luigiCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		luigiCharacter.moveRight();
		
	}

}
