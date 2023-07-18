public class PhoneBuilder{
	private String os;
	private int ram;
	private String processor;
	private double screen;
	private int battery;
	
	public PhoneBuilder os(String os){
		this.os = os;
		return this;
	}
	
	public PhoneBuilder ram(int ram){
		this.ram = ram;
		return this;
	}
	
	public PhoneBuilder processor(String processor){
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder screen(double screen){
		this.screen = screen;
		return this;
	}
	
	public PhoneBuilder battery(int battery){
		this.battery = battery;
		return this;
	}
	
	public Phone buildPhone(){
		return new Phone(os, ram, processor, screen, battery);
	}
}
