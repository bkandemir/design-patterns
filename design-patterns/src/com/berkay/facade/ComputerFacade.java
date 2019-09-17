package com.berkay.facade;

public class ComputerFacade {
	private CPU processor;
	private HardDrive hd;
	private Memory ram;
	
	public ComputerFacade(CPU processor, HardDrive hd, Memory ram) {
		super();
		this.processor = processor;
		this.hd = hd;
		this.ram = ram;
	}
	
	public void start() {
		processor.freeze();
		ram.load(132, hd.read(3456, 89));
		processor.jump(132);
		processor.execute();
	}
	
	

}
