public class Phone{
	private String os;
	private int ram;
	private String processor;
	private double screen;
	private int battery;
	
	public Phone(String os, int ram, String processor, double screen, int battery){
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screen = screen;
		this.battery = battery;
	}
	
	@Override
	public String toString(){
		return "[" + os + ", " + ram + ", " + processor + ", " + screen + ", " + battery + "]";
	}
}
