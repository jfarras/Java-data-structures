
public class DynamicList {
	private Node first;
	private Node ant;

	public DynamicList() {
		first = new Node(null, null);
		ant = first;
	}
	
	public void insert(Student student) {
		Node newNode = new Node(ant.getNext(), student);
		ant.setNext(newNode);
	}
	
	public Student get() {
		if (ant.getNext() != null) {
			return ant.getNext().getElement();			
		} else {
			return null;
		}
	}
	
	public void delete() {
		if (ant.getNext() != null) {
			ant.setNext(ant.getNext().getNext());
		}
	}
	
	public void first() {
		ant = first;
	}
	
	public void next() {
		if (ant.getNext() != null) {
			ant = ant.getNext();
		}
	}
	
	public boolean end() {
		return ant.getNext()==null;
	}
	
	public boolean empty() {
		return first.getNext()==null;
	}
	
}