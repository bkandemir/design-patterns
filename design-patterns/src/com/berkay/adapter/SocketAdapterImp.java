package com.berkay.adapter;

public class SocketAdapterImp extends Socket implements SocketAdapter {

	@Override
	public Voltage get120Volts() {
		// TODO Auto-generated method stub
		return getVoltage();
	}

	@Override
	public Voltage get12Volts() {
		// TODO Auto-generated method stub
		Voltage v = getVoltage();
		return convertVolt(v,10);
	}

	@Override
	public Voltage get3Volts() {
		// TODO Auto-generated method stub
		Voltage v = getVoltage();
		return convertVolt(v,40);
	}

	@Override
	public Voltage get1Volt() {
		// TODO Auto-generated method stub
		Voltage v = getVoltage();
		return convertVolt(v,120);
	}
	
	public Voltage convertVolt(Voltage v,int i) {
		return new Voltage(v.getVolt()/i);		
	}

}
