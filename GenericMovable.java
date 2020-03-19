public class GenericMovable implements MovableObject{
	
	private double speed;
	
	public GenericMovable(double speed) {
		this.speed = speed;
	}
	
	public boolean isSpeedConstant() {
		return true;
	}
	
	public void accelerate() {
		speed += 10;
	}
	
	public void brake() {
		if (speed >= 10)
			speed -= 10;
	}
	
	public double getTimeToMove(double distance) {
		double time = distance / 1000 /speed * 60;
		return time;
	}
}
