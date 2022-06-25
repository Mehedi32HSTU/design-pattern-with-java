package design_patterns.observer_pattern.twitter_notification;

public class ObserverDriverClass {
	public static void main(String[] args) {

		PublicFigure mehedi = new PublicFigure("Mehedi Hasan", "mhasan");
		PublicFigure angshuman = new PublicFigure("Angshuman Bhattacharjee", "a.bhattacharjee");
		PublicFigure bappy = new PublicFigure("Sayeed Bappy", "sbappy");

		Follower aaa = new Follower("A");
		Follower bbb = new Follower("B");
		Follower ccc = new Follower("C");
		Follower ddd = new Follower("D");
		Follower eee = new Follower("E");
		mehedi.addSubscriber(aaa);
		mehedi.addSubscriber(eee);
		mehedi.addSubscriber(ccc);
		mehedi.addSubscriber(ddd);
		mehedi.tweet("Hello Friends");

		bappy.addSubscriber(ddd);
		bappy.addSubscriber(bbb);
		bappy.tweet("Hello there, I am Bappy and this is my first tweet.");
		bappy.removeSubscriber(bbb);

		mehedi.removeSubscriber(eee);
		mehedi.tweet("One subscriber remved");
		bappy.tweet("I also removed One.");

		angshuman.tweet("Hello there, though I don't have any subscribers, also I am tweeting for the first time.");

	}

}
