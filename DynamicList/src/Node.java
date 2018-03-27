
public class Node {
	private Node next;
	private Student element;
	
	public Node(Node next, Student element) {
		this.next = next;
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Student getElement() {
		return element;
	}
	public void setElement(Student element) {
		this.element = element;
	}	
}
