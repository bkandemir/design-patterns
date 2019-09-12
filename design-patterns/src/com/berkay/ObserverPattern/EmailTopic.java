package com.berkay.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
	List<Observer> observers = new ArrayList<Observer>();
	private String message;

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		if(observer==null) {
			throw new NullPointerException("observer is null.");
		}
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
		
	}

	@Override
	public void unregister(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer observer) {
		// TODO Auto-generated method stub
		return message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to topic :" + msg);
		message=msg;
		notifyObservers();
	}

}
