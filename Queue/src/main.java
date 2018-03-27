
public class main {
	public static void main(String[] args) {
		ArrayQueue cua ;
		cua = new ArrayQueue(20);
		System.out.println("N elements:"+cua.elements());//Ha de dir 0 elements
		cua.add(2);
		cua.add(3);
		System.out.println("N elements:"+cua.elements());//Ha de dir 2 elements
		System.out.println("Buida?"+cua.empty());//Ha de dir false
		System.out.println("Primer:"+cua.first());//Ha de dir 2
		cua.remove();
		System.out.println("Primer:"+cua.first());//Ha de dir 3
		cua.add(4);
		cua.removeAll();
		cua.reverse();//No ha de fer res
		System.out.println("Primer:"+cua.first());//Ha de dir no i -1
		cua.add(1);
		cua.add(2);
		cua.add(3);
		cua.reverse();
		int q = cua.elements();
		for(int i=0;i<q;++i){//Nums revés
			System.out.println("Primer:"+cua.first());
			cua.remove();
		}
		System.out.println("N elements:"+cua.elements());//Ha de dir 0 elements
		cua.add(2);
		cua.add(3);
		System.out.println("N elements:"+cua.elements());//Ha de dir 2 elements
	}
}

