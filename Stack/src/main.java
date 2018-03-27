
public class main {
	public static void main(String[] args) {
		Stack pila;
		pila = new Stack(20);
		System.out.println(pila.empty());
		pila.push(5);
		System.out.println(pila.top());
		pila.imprimir();
	}
}
