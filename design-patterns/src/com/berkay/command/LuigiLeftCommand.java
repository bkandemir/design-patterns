package com.berkay.command;

public class LuigiLeftCommand implements Command {
	private LuigiCharacter luigiCharacter;
	
	
	LuigiLeftCommand(LuigiCharacter luigiCharacter) {
		this.luigiCharacter = luigiCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		luigiCharacter.moveLeft();
		
	}

}
