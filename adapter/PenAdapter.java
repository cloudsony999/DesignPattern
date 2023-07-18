public class PenAdapter implements Pen{
	private FountainPen fountainPen = new FountainPen();
	
	@Override
	public void write(String content){
		this.fountainPen.writeSmoothly(content);
	}
}
