package com.berkay.command;

public class MainClass {

	public static void main(String[] args) {
		MarioCharacter m = new MarioCharacter();
		m.setName("Mario");
		
		LuigiCharacter l = new LuigiCharacter();
		l.setName("Luigi");
		
		MarioUpCommand upMario = new MarioUpCommand(m);
		LuigiUpCommand upLuigi = new LuigiUpCommand(l);
		
		MarioDownCommand downMario = new MarioDownCommand(m);
		LuigiDownCommand downLuigi = new LuigiDownCommand(l);
		
		MarioRightCommand rightMario = new MarioRightCommand(m);
		LuigiRightCommand rightLuigi = new LuigiRightCommand(l);
		
		MarioLeftCommand leftMario = new MarioLeftCommand(m);
		LuigiLeftCommand leftLuigi = new LuigiLeftCommand(l);
		
		
		
		GameBoy g = new GameBoy(upMario,downMario,leftMario,rightMario);
		GameBoy g2 = new GameBoy(upLuigi,downLuigi,leftLuigi,rightLuigi);
		
		g2.arrowLeft();
		g2.arrowUp();
		g.arrowUp();
		g.arrowDown();

	}

}
