interface MotorBike
{
	int speed = 50;
	int totalDistance = 1000;
	public void speed();
}
interface Cycle_
{
	int distance =150;
	public void speed();
}
public class TwoWheeler implements MotorBike,Cycle_{
	int avgSpeed;
	public void totalDistance() {
		totalDistance = speed*distance;
		System.out.println("Total Distance Travlled :" + totalDistance);
	}
	
	public void speed()
	{
		int avgSpeed = totalDistance/distance;
		System.out.println("Average Speed maintained:"+avgSpeed);
	}
	
	public static void main(String[] args)
	{
		TwoWheeler t1 = new TwoWheeler();
		//t1.totalDistance();
		t1.speed();
	}

}
