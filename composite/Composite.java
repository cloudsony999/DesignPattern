import java.util.List;
import java.util.ArrayList;

public class Composite implements Component{
	String name;
	List<Component> components = new ArrayList<>();
	
	public Composite(String name){
		this.name = name;
	}
	
	@Override
	public void addComponent(Component component){
		this.components.add(component);
	}

	@Override
	public void showPrice(){
		for (Component component : components){
			component.showPrice();
		}
	}
}
