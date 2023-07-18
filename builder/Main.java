public class Main{
	public static void main(String args[]){
		Phone phone = new PhoneBuilder().buildPhone();
		phone = new PhoneBuilder().screen(6.7).buildPhone();
		phone = new PhoneBuilder().os("ios").ram(4).processor("QualComm").screen(7.1).battery(5000).buildPhone();
		System.out.println(phone);
	}
}
