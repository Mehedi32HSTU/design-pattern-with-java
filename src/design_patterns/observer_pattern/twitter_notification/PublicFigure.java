package design_patterns.observer_pattern.twitter_notification;

import java.util.ArrayList;
import java.util.List;

public class PublicFigure implements Subject {

	private List<Observer> subscribers = new ArrayList<>();
	private String name;
	private String handle;

	public PublicFigure(String name, String handle) {
		this.name = name;
		this.handle = '#' + handle;
	}

	public String getName() {
		return name;
	}


	public String getHandle() {
		return handle;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void tweet(String tweetMessage) {
		System.out.printf("\n\n\t\t=================================\nName : '%s', Tweet : '%s'\n\t\t=================================\n\n",name, tweetMessage);
		notifySubscriber(tweetMessage);
	}

	@Override
	public synchronized void addSubscriber(Observer observer) {
		subscribers.add(observer);
	}

	@Override
	public synchronized void removeSubscriber(Observer observer) {
		subscribers.remove(observer);
	}

	@Override
	public void notifySubscriber(String message) {
		this.subscribers.forEach(subscriber -> subscriber.notification(this.handle, message));
	}

}
