package topic_1;

public class Node {

	public String id;    // name of the node (A-G)
	public Path[] paths; // array of Path objects leading from the Node

  /** Parameterized constructor
	 * Constructs Node with specified id and array of Path objects leading from it
	 * @param id is the name of the Node
	 * @param paths are the Path objects leading from it
	 */
	public Node(String id, Path[] paths) {
		this.id = id;
		this.paths = paths;
	}

	/** accessor & instance method
	 * @return the name of the Node
	 */
	public String getID() {
		return id;
	}

	/** accessor and & instance method
	 * @return the paths leading from the Node object
	 */
	public Path[] getPaths() {
		return paths;
	}

	// Instantiations of all the Paths in the map problem image.
	// This is possible because the Path class and its constructor are public.
	Path AB = new Path("B", "A", 14);
	Path AD = new Path("D", "A", 22);
	Path AE = new Path("E", "A", 4);
	Path BG = new Path("G", "B", 3);
	Path CB = new Path("B", "C", 16);
	Path CD = new Path("D", "C", 12);
	Path ED = new Path("D", "E", 12);
	Path EF = new Path("F", "E", 10);
	Path GF = new Path("F", "G", 1);

	// Instantiations of all the Nodes in the map problem image.
	Path[] A_paths = {AB, AD, AE};
	Node A = new Node("A", A_paths);

	Path[] B_paths = {BG};
	Node B = new Node("B", B_paths);

	Path[] C_paths = {CB, CD};
	Node C = new Node("C", C_paths);

	Path[] D_paths = null; // empty array since there are no paths leading from Node D
	Node D = new Node("D", D_paths);

	Path[] E_paths = {ED, EF};
	Node E = new Node("E", E_paths);

	Path[] F_paths = null; // empty array since there are no paths leading from Node F
	Node F = new Node("F", F_paths);

	Path[] G_paths = {GF};
	Node G = new Node("G", G_paths);

	/** Instance method
   * Finds the shortest route between the given starting and ending nodes
	 * @return an array of Path objects representing the shortest route
	 * @param start is the starting Node object
	 * @param end is the ending Node object
	 */
	public Path[] findShortestRoute(Node start, Node end) {

		Path[] shortestRoute = null;
		int smallestWeight = 0;

		/* implementation code */

		return shortestRoute;

	}

	/**
	 *  A null reference or pointer is a reference that is unintialized.
   *  E.g. a variable with the identifier D_paths has been created above, but it does not have any value because there are no Path objects for D based on the image.
   *  Invoking an instance method with a null reference may cause termination of program execution if it throws a NullPointerException.
	 */
}
