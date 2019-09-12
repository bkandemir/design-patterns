package com.berkay.observer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailTopic topic = new EmailTopic();
		Observer firstObserver = new EmailTopicSubscriber("firstObserver");
		Observer secondObserver = new EmailTopicSubscriber("secondObserver");
		Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");
		
		topic.register(firstObserver);
		topic.register(secondObserver);
		topic.register(thirdObserver);
		
		firstObserver.setSubject(topic);
		secondObserver.setSubject(topic);
		thirdObserver.setSubject(topic);
		
		firstObserver.update();
		secondObserver.update();
		thirdObserver.update();
		
		topic.postMessage("Hello World!");
		
		topic.unregister(thirdObserver);
		
		topic.postMessage("Hello World Again!");
		

	}

}
