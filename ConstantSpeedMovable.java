public class ConstantSpeedMovable implements MovableObject{
	
	private double speed;
	
	public ConstantSpeedMovable(double speed) {
		this.speed = speed;
	}

	public boolean isSpeedConstant() {
		return false;
	}
	
	public void accelerate() {}
	
	public void brake() {}
	
	public double getTimeToMove(double distance) {
		double time = distance / 1000 / speed * 60;
		return time;
	}
}
