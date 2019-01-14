package map;

public class UnitTestMap {
	
	public static void main(String[] args) {
		User user1 = new User(20, 50);
		User user2 = new User(30, 40);
		User user3 = new User(10, 60);
		User user4 = new User(25, 65);
		
		testGetUserID(user1, 1);
		testGetUserID(user4, 4);
		testGetXVal(user2, 30);
		testGetYVal(user3, 60);
		
		user1.moveUp(10);
		testMoveUp(user1, 40);
		
		user2.moveDown(20);
		testMoveDown(user2, 60);
		
		user3.moveRight(30);
		testMoveRight(user3, 40);
		
		user4.moveLeft(5);
		testMoveLeft(user4, 20);
		
		Map map = new Map();
		testGetNumUsers(map, 0);
		map.addUser(user1);
		map.addUser(user2);
		map.addUser(user3);
		map.addUser(user4);
		testGetNumUsers(map, 4);
		
		User res = map.findClosest(user1);
		testFindClosest(res, 2);
		res = map.findClosest(user2);
		testFindClosest(res, 3);
		res = map.findClosest(user3);
		testFindClosest(res, 2);
		res = map.findClosest(user4);
		testFindClosest(res, 2);
	}
	
	public static void testGetUserID(User u, int ans) {
		if (u.getUserID() == ans) {
			System.out.println("PASSED - User getUserID: " + ans);
		} else {
			System.out.println("FAILED - User getUserID: " +u.getUserID());
		}
	}
	
	public static void testGetXVal(User u, double ans) {
		if (u.getXVal() == ans) {
			System.out.println("PASSED - User getXVal: " + ans);
		} else {
			System.out.println("FAILED - User getXVal: " + u.getXVal());
		}
	}
	
	public static void testGetYVal(User u, double ans) {
		if (u.getYVal() == ans) {
			System.out.println("PASSED - User getYVal: " + ans);
		} else {
			System.out.println("FAILED - User getYVal: " + u.getYVal());
		}
	}
	
	public static void testMoveUp(User u, double ans) {
		if (u.getYVal() == ans) {
			System.out.println("PASSED - User moveUp: " + ans);
		} else {
			System.out.println("FAILED - User moveUp: " + u.getYVal());
		}
	}
	
	public static void testMoveDown(User u, double ans) {
		if (u.getYVal() == ans) {
			System.out.println("PASSED - User moveDown: " + ans);
		} else {
			System.out.println("FAILED - User moveDown: " + u.getYVal());
		}
	}
	
	public static void testMoveLeft(User u, double ans) {
		if (u.getXVal() == ans) {
			System.out.println("PASSED - User moveLeft: " + ans);
		} else {
			System.out.println("FAILED - User moveLeft: " + u.getXVal());
		}
	}
	
	public static void testMoveRight(User u, double ans) {
		if (u.getXVal() == ans) {
			System.out.println("PASSED - User moveRight: " + ans);
		} else {
			System.out.println("FAILED - User moveRight: " + u.getXVal());
		}
	}
	
	public static void testGetNumUsers(Map m, int ans) {
		if (m.getNumUsers() == ans) {
			System.out.println("PASSED - Map getNumUsers: " + ans);
		} else {
			System.out.println("FAILED - Map getNumUsers: " + m.getNumUsers());
		}
	}
	
	public static void testFindClosest(User u, int ans) {
		if (u.getUserID() == ans) {
			System.out.println("PASSED - Map findClosest: " + ans);
		} else {
			System.out.println("FAILED - Map findClosest: " + u.getUserID());
		}	
	}

}
