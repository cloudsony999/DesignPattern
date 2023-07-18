public class Assignment{
	private Pen pen;
	
	public Pen getPen(){
		return this.pen;
	}
	
	public void setPen(Pen pen){
		this.pen = pen;
	}
	
	public void write(String content){
		this.pen.write(content);
		System.out.println("----- assignment done -----");
	}
}
