
public class DynamicQueue {
	
	private Node first;
	private Node last;

	public DynamicQueue(){
		first = new Node();
		last = first;
	}
	
	public void add(int x){
		
		Node aux;
		aux = new Node(x,null);
		last.setSeg(aux);
		last = aux;
	}
	
	public void remove(){
		Node aux;
		aux = first.getSeg();
		if(first == last) System.out.println("No hi han elements!");
		else {
			first.setSeg(aux.getSeg());
			if(first.getSeg()==null){
				last=first;
			}
		}
	}
	public int first(){
		int aux=-1;
		if (first !=last){
			aux = first.getSeg().getX();
		}
		else System.out.println("No hi han elements!");
		return aux;
	}
	public void removeAll(){
		if(first == last) System.out.println("No hi han elements!");
		else {
		last = first;
		}
	}
	public boolean empty(){
		return first.getSeg() == null;
	}

	public int elements(){
		Node aux; int i=0;
		aux = first;
		while(aux !=  null){
			aux = aux.getSeg();
			i++;
		}
		return i-1;
	}

	public void reverse(){
		Node aux = first.getSeg();
		int [] valors = new int [elements()];
		int i = 0;
		while (aux!=null){
			valors[i] = aux.getX();
			aux=aux.getSeg();
			++i;
		}
		aux = first.getSeg();
		i -=1;
		while (aux!=null){
			
			aux.setX(valors[i]);
			i--;
			aux= aux.getSeg();
		}
	}
	}