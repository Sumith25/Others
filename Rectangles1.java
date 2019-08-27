public class Rectangles1 implements Shapes {
	
	private double width;
	private double height;
	
	public Rectangles1 (double w , double h)
	{
		this.width = w;
		this.height = h;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Recatangles:");

	}

	@Override
	public double get_area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

}
