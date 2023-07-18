public class Main{
	public static void main(String args[]){
		Channel telusko = new Channel();
		Subscriber sayan = new Subscriber("Sayan", telusko);
		Subscriber santam = new Subscriber("Santam", telusko);
		
		sayan.subscribe();
		santam.subscribe();
		telusko.upload("How to create ArrayList in java?");
		System.out.println();
		santam.unsubscribe();
		telusko.upload("How to create HashMap in java?");
	}
}
