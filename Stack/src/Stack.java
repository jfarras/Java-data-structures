
public class Stack {
	private int[] elements;
	private int indexTop;
	
	public Stack() {
		elements = new int[10];
		indexTop= -1; //Per indicar el buit
	}
	
	public Stack(int size) {
		elements = new int [size];
		indexTop = -1;
	}
	
	public void push(int element){
	if (indexTop!= elements.length-1){
			indexTop++;
			elements[indexTop] = element;
	}
	else{
		System.out.println("error");
	}
	}
	public void pop(){
		if  (indexTop !=-1) indexTop--;
		else {
			System.out.println("Error");			
		}
	}
	public boolean empty(){
		return (-1 == indexTop);
	}
	public int top(){
		int element=-1;
		if (indexTop==-1) System.out.println("error");
		else {
			element = elements[indexTop];
		}
		return element;
	}
	public void imprimir(){
		for (int i=0;i<elements.length;++i){
			System.out.println(elements[i]);	
		}
	}
	public String print(){
		String content = new String();
		for(int i = 0;i<elements.length;i++){
			content = content + " "+elements[i];
			return content;
	}
	
		}
	
	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}

	public int getIndexTop() {
		return indexTop;
	}

	public void setIndexTop(int indexTop) {
		this.indexTop = indexTop;
	}

}