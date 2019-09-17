package com.berkay.facade;

public class MainClass {

	public static void main(String[] args) {
		 CPU cpu = new CPU();;
		 HardDrive hd=new HardDrive();
		 Memory memory = new Memory();
		
		ComputerFacade c = new ComputerFacade(cpu,hd,memory);
		c.start();
	}

}
