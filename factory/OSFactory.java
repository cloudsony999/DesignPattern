public class OSFactory{
	public OS getOS(String osName){
		if (osName.equalsIgnoreCase("ios") || osName.equalsIgnoreCase("iphone"))
			return new IPhoneOS();
		else if (osName.equalsIgnoreCase("android"))
			return new AndroidOS();
		else if (osName.equalsIgnoreCase("windows"))
			return new WindowsOS();
		else
			return null;
	}
}
