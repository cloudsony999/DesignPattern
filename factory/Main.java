public class Main{
	public static void main(String args[]){
		// code here...
		// OS os = new AndroidOS();
		OSFactory osFactory = new OSFactory();
		OS os = osFactory.getOS("windows");
		System.out.println(os);
		os.description();
	}
}
