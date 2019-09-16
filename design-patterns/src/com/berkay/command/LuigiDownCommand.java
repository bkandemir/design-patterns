package com.berkay.command;

public class LuigiDownCommand implements Command {
	private LuigiCharacter luigiCharacter;
	
	
	LuigiDownCommand(LuigiCharacter luigiCharacter) {
		this.luigiCharacter = luigiCharacter;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		luigiCharacter.moveDown();
		
	}

}
