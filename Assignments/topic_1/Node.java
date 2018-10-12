package topic_1;

public class Node {
	
	public String id;    // name of the node (A-G)
	public Path[] paths; // array of Path objects leading from the Node 
	
	/** TODO: What type of constructor is this and what does it do? Does it have any parameters?
	 * 
	 */
	public Node(String id, Path[] paths) {
		this.id = id;
		this.paths = paths;
	}
	
	/** TODO: What type of method is this, what does it do, and what should it return?
	 * 
	 * @return
	 */
	public String getID() {
		return id;
	}
	
	/** TODO: What type of method is this, what does it do, and what should it return?
	 * 
	 * @return
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
	
	/** TODO: What type of method is this, what does it do, what are its parameters, and what should it return?
	 * 
	 * @return
	 * @param
	 * @param
	 */
	public Path[] findShortestRoute(Node start, Node end) {
		
		Path[] shortestRoute = null;
		int smallestWeight = 0;
		
		/* implementation code */
		
		return shortestRoute;
		
	}

	/**
	 *  TODO: Look up what null means in Java online, and explain it in your own words.
	 */
}
