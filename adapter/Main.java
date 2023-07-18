public class Main{
	public static void main(String args[]){
		Pen pen = new PenAdapter();
		// FountainPen fountainPen = new FountainPen();
		Assignment assignment = new Assignment();
		assignment.setPen(pen);
		assignment.write("This is the content of assignment");
	}
}
