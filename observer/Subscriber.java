public class Subscriber{
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name, Channel channel){
		this.name = name;
		this.channel = channel;
	}
	
	public void update(){
		System.out.println(name + ": Video Uploaded - " + channel.getTitle());
	}
	
	public void subscribe(){
		this.channel.getSubscribers().add(this);
	}
	
	public void unsubscribe(){
		this.channel.getSubscribers().remove(this);
	}
}
