package design_patterns.observer_pattern.twitter_notification;

public interface Subject {
	public void addSubscriber(Observer observer);
	public void removeSubscriber(Observer observer);
	public void notifySubscriber(String message);

}
