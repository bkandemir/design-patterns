package com.berkay.adapter;

public class MainClass {

	public static void main(String[] args) {
		testingObjectAdapter();

	}
	
	private static void testingObjectAdapter() {
		SocketAdapter s = new SocketObjectAdapterImp();
		Voltage v1 = getVoltage(s,1);
		Voltage v3 = getVoltage(s,3);
		Voltage v12 = getVoltage(s,12);
		Voltage v120 = getVoltage(s,120);
		
		System.out.println("V1 is using Object adapter " + v1.getVolt());
		System.out.println("V3 is using Object adapter " + v3.getVolt());
		System.out.println("V12 is using Object adapter " + v12.getVolt());
		System.out.println("V120 is using Object adapter " + v120.getVolt());
	}

	private static Voltage getVoltage(SocketAdapter s, int i) {
		// TODO Auto-generated method stub
		switch(i) {
		case 1: return s.get1Volt();
		case 3: return s.get3Volts();
		case 12: return s.get12Volts();
		case 120: return s.get120Volts();
		default :return s.get120Volts();
		}
	}

}
