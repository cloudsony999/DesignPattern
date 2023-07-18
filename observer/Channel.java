import java.util.List;
import java.util.ArrayList;

public class Channel{
	private String title;
	private List<Subscriber> subscribers = new ArrayList<>();

	public List<Subscriber> getSubscribers(){
		return this.subscribers;
	}

	public String getTitle(){
		return this.title;
	}

	public void notifySubscriber(){
		for (Subscriber subscriber : subscribers){
			subscriber.update();
		}
	}
	
	public void upload(String title){
		this.title = title;
		this.notifySubscriber();
	}
}
