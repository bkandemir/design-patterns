package com.berkay.observer;

public class EmailTopicSubscriber implements Observer {
	private String message;
	private Subject topic;
	

	public EmailTopicSubscriber(String message) {
		super();
		this.message = message;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg = (String)topic.getUpdate(this);
		if(msg==null) {
			System.out.println(message+" No new message!");
		}else {
			System.out.println(message+" Retrieving message: "+msg);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		// TODO Auto-generated method stub
		topic=subject;
	}

}
