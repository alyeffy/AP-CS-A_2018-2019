package map;

import java.util.*;

public class Map {
	
	public List<User> users;
	public int numUsers;
	
	/** Constructor for Map object
	 *  POSTCONDITION: Creates Map object with 0 Users
	 */ 
	public Map() {
		this.users = new ArrayList<User>();
	}
	
	/**
	 * PRECONDITION: Map Object exists
	 * @return the number of Users on the Map
	 */
	public int getNumUsers() {
		return this.numUsers;
	}
	
	/**
	 * PRECONDITION: Map object exists and User is not already on Map
	 * POSTCONDITION: User should be on Map
	 * @param u is the User to add to the Map
	 */
	public void addUser(User u) {
		this.users.add(u);
		this.numUsers++;
	}
	
	/**
	 * PRECONDITION: Map object exists and User is already on Map
	 * POSTCONDITION: User should no longer be on Map
	 * @param u is the User to remove from the Map
	 */
	public void delUser(User u) {
		this.users.remove(u);
		this.numUsers--;
	}
	
	/** TODO: Implement this method and ensure that all tests pass
	 * Finds the closest User to the input User based on displacement difference
	 * PRECONDITION: Map Object, User object input, and at least one other User object exists
	 * @param u is the User to find the closest neighbour for 
	 * @return the User closest to the input User
	 */
	public User findClosest(User u) {
		
		double shortestDist = 0;
		User closest = null;
		
		for (int i = 0; i < numUsers; i++) {
			
			User n = users.get(i);
			
			if (!u.equals(n)) {
				
				double uXDist = u.getXVal();
				double nXDist = n.getXVal();
				double xDist = uXDist - nXDist;
				
				double uYDist = u.getYVal();
				double nYDist = n.getYVal();
				double yDist = uYDist - nYDist;
				
				double displacement = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
				
				if (shortestDist == 0 || displacement < shortestDist) {
					shortestDist = displacement;
					closest = n;
				}
				
			}
		}
		
		return closest;
	}

}
