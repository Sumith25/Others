
public class ShapeTest {
	public static void main(String[] args)
	{
		Circles shape = new Circles(10);
//		Circles c = new Circles(5);
		
		shape.draw();
		System.out.println("Area ="+shape.get_radius());
		System.out.println("Area ="+shape.get_area());
		
		Rectangles1 shape1 = new Rectangles1(10,10);
		shape1.draw();
		System.out.println("Area = "+shape1.get_area());
	}

}