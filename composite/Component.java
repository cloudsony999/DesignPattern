public interface Component{
	void showPrice();
	default void addComponent(Component component){
	}
}
