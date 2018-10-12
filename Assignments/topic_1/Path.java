package topic_1;

public class Path {
	
	public String next;		// the id of the Node the Path leads to
	public String previous; // the id of the Node the Path leads from
	public int weight;		// the weight (distance) of the Path
	
	/** TODO:  What type of constructor is this and what does it do? Does it have any parameters? 
	 * 
	 */
	public Path(String next, String previous, int weight) {
		this.next = next;
		this.previous = previous;
		this.weight = weight;
	}
	
	/** TODO: What type of method is this, what does it do, and what should it return?
	 * 
	 * @return
	 */
	public String getNext() {
		return next;
	}
	
	/** TODO: What type of method is this, what does it do, and what should it return?
	 * 
	 * @return
	 */
	public String getPrevious() {
		return previous;
	}
	
	/** TODO: What type of method is this, what does it do, and what should it return?
	 * 
	 * @return
	 */
	public int getWeight() {
		return weight;
	}

}