package map;

public class User {
	
	public int id;
	public double xVal;
	public double yVal;
	public static int numUsers;
	
	/** TODO: Complete the constructor, add any needed helper methods or variables
	 * Constructor for the User class
	 * @param id is the unique id of the User dependent on the number of Users in the Map
	 * @param xVal is the x-coordinate of the User on the Map
	 * @param yVal is the y-coordinate of the User on the Map
	 * PRECONDITION: xVal and yVal are non-negative, and id is not already used
	 * POSTCONDITION: New User object is instantiated
	 */
	public User(double xVal, double yVal) {
		numUsers++;
		this.xVal = xVal;
		this.yVal = yVal;
		this.id = numUsers;
	}
	
	/**
	 * PRECONDITION: User object exists
	 * @return the id of the User
	 */
	public int getUserID() {
		return this.id;
	}
	
	/**
	 * PRECONDITION: User object exists
	 * @return the x-coordinate of the User
	 */
	public double getXVal() {
		return this.xVal;
	}
	
	/** 
	 * PRECONDITION: User object exists
	 * @return the y-coordinate of the User
	 */
	public double getYVal() {
		return this.yVal;
	}
	
	/** TODO: Implement this method
	 * PRECONDITION: User object exists, dist is positive and is less than yVal
	 * POSTCONDITION: User object moved up by dist
	 * @param dist is the distance to move up by
	 */
	public void moveUp(double dist) {
		this.yVal -= dist;
	}
	
	/** TODO: Implement this method
	 * PRECONDITION: User object exists, and dist is positive
	 * POSTCONDITION: User object moved down by dist
	 * @param dist is the distance to move down by
	 */
	public void moveDown(double dist) {
		this.yVal += dist;
	}
	
	/** TODO: Implement this method
	 * PRECONDITION: User object exists, and dist is positive and is less than xVal
	 * POSTCONDITION: User object moved left by dist
	 * @param dist is the distance to move left by
	 */
	public void moveLeft(double dist) {
		this.xVal -= dist;
	}
	
	/** TODO: Implement this method
	 * PRECONDITION: User object exists, and dist is positive
	 * POSTCONDITION: User object moved right by dist
	 * @param dist is the distance to move right by
	 */
	public void moveRight(double dist) {
		this.xVal += dist;
	}

}
