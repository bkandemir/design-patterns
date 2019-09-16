package com.berkay.command;

public class GameBoy {
	private Command upCommand, downCommand, leftCommand, rightCommand;

	GameBoy(Command upCommand, Command downCommand,
					Command leftCommand, Command rightCommand) {
		super();
		this.upCommand = upCommand;
		this.downCommand = downCommand;
		this.leftCommand = leftCommand;
		this.rightCommand = rightCommand;
	}
	
	public void arrowUp() {
		upCommand.execute();
	}
	public void arrowDown() {
		downCommand.execute();
	}
	public void arrowLeft() {
		leftCommand.execute();
	}
	public void arrowRight() {
		rightCommand.execute();
	}
	
	
}
