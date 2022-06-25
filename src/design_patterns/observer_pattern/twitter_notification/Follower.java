package design_patterns.observer_pattern.twitter_notification;

public class Follower implements Observer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Follower(String name) {
		this.name = name;
	}

	@Override
	public void notification(String handle, String message) {
		System.out.printf("\n'%s' recieved notification from Handle : '%s', and the message is '%s'",this.name, handle, message);
	}

}
