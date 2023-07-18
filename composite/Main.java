public class Main{
	public static void main(String args[]){
		Component hdd = new Leaf("Seagate-HDD", 2500);
		Component ram = new Leaf("Hypex-DDR4", 3600);
		Component cpu = new Leaf("i7-11", 9800);
		Component mouse = new Leaf("Ant-Esports Mouse", 650);
		Component monitor = new Leaf("Frontech 18 inch", 3600);

		Component peripheral = new Composite("Peripheral");
		Component cabinet = new Composite("Cabinet");
		Component motherboard = new Composite("MotherBoard");
		Component computer = new Composite("Computer");

		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);

		motherboard.addComponent(cpu);
		motherboard.addComponent(ram);

		cabinet.addComponent(hdd);
		cabinet.addComponent(motherboard);

		computer.addComponent(cabinet);
		computer.addComponent(peripheral);
		
		ram.showPrice();
		System.out.println();
		cabinet.showPrice();
		System.out.println();
		computer.showPrice();
	}
}
