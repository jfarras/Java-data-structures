
public class Node {
	private int x;
	private Node seg;

	public Node(){
		x = -3;
		seg = null;
	}
	public Node(int x,Node seg){
		this.x = x;
		this.seg = seg;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Node getSeg() {
		return seg;
	}
	public void setSeg(Node seg) {
		this.seg = seg;
	}
}
	
