package com.berkay.command;

public class LuigiUpCommand implements Command {
	private LuigiCharacter luigiCharacter;
	
	
	LuigiUpCommand(LuigiCharacter luigiCharacter) {
		this.luigiCharacter = luigiCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		luigiCharacter.moveUp();
		
	}

}
