package com.berkay.adapter;

public class SocketObjectAdapterImp implements SocketAdapter {
	
	Socket s = new Socket();

	@Override
	public Voltage get120Volts() {
		// TODO Auto-generated method stub
		return s.getVoltage();
	}

	@Override
	public Voltage get12Volts() {
		// TODO Auto-generated method stub
		return convertVolt(s.getVoltage(),10);
	}

	@Override
	public Voltage get3Volts() {
		// TODO Auto-generated method stub
		return convertVolt(s.getVoltage(),40);
	}

	@Override
	public Voltage get1Volt() {
		// TODO Auto-generated method stub
		return convertVolt(s.getVoltage(),120);
	}
	
	public Voltage convertVolt(Voltage v,int i) {
		return new Voltage(v.getVolt()/i);		
	}

}
