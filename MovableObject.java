public interface MovableObject {
	
	public boolean isSpeedConstant();
	
	public void accelerate();
	
	public void brake();
	
	public double getTimeToMove(double time);
}
