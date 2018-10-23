package topic_1;

public class Path {

	public String next;		// the id of the Node the Path leads to
	public String previous; // the id of the Node the Path leads from
	public int weight;		// the weight (distance) of the Path

	/** Parameterized constuctor
  * @param next is the id of the Node object that the Path object leads to
  * @param previous is the id of the Node object that the Path object leads from
  * @param weight is the distance of the Path object
	 */
	public Path(String next, String previous, int weight) {
		this.next = next;
		this.previous = previous;
		this.weight = weight;
	}
	
	/** accessor & instance method
	 * @return the id of the node that the path leads to
	 */
	public String getNext() {
		return next;
	}

	/** accessor & instance method
	 * @return the id of the node that the path leads from
	 */
	public String getPrevious() {
		return previous;
	}

	/** accessor & instance method
	 * @return the distance of the path
	 */
	public int getWeight() {
		return weight;
	}

}
