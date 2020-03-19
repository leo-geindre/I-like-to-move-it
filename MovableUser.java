public class MovableUser {

	public static double getTotalTime(MovableObject movable) {
		double time;
		if (!movable.isSpeedConstant()) {
			time = movable.getTimeToMove(1000);
			movable.brake();
			time += movable.getTimeToMove(100);
			movable.accelerate();
			time += movable.getTimeToMove(1000);
		}
		else
			time = movable.getTimeToMove(2100);
		return time;
	}
	
	public static void main(String[] args) {
		ConstantSpeedMovable MovConst = new ConstantSpeedMovable(50);
		GenericMovable Mov1 = new GenericMovable(50);
		GenericMovable Mov2 = new GenericMovable(50);
		Mov1.accelerate();
		System.out.println("Constant movable has travelled 1000 meters in " + MovConst.getTimeToMove(1000) + " minutes.");
		System.out.println("Movable 1 has travelled 1000 meters in " + Mov1.getTimeToMove(1000) + " minutes.");
		System.out.println("Movable 2 has travelled 1000 meters in " + Mov2.getTimeToMove(1000) + " minutes.");
		System.out.println("Constant movable has complete the circuit in " + getTotalTime(MovConst) + " minutes");
		System.out.println("Movable 1 has complete the circuit in " + getTotalTime(Mov1) + " minutes");
		System.out.println("Movable 2 has complete the circuit in " + getTotalTime(Mov2) + " minutes");
	}

}
