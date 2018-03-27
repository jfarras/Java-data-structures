
public class ArrayQueue {

		private int[] v;
		private int q;
		
		public ArrayQueue(int size){
			
			v = new int[size];
			q = 0;
		}
		public void add(int x){
			
			if (q>= v.length) System.out.println("No hi cap cap altre element!");
			else {
				v[q] = x;
				q++;
			}
		}
		public void remove(){
			if(q==0) System.out.println("No hi han elements");
			else{
				for(int i =0;i<q-1;++i){
				v[i]=v[i+1];
			}
			q--;
			}
		}
		public int first(){
			int aux=-1;
			if (q == 0) System.out.println("No hi han elements");
			else{
			aux = v[0];
			}
			return aux;
		}
		public void removeAll(){
			if(q==0) System.out.println("No hi han elements");
			
			for(int i=0; i<q-1;++i){
				v[i]=0;
			}
			q = 0;
		}
		public boolean empty(){
			return q==0;
		}
		public void reverse(){
			int [] aux;
			aux = new int[v.length];
			for(int i=0;i<q;++i){
				aux[i]=v[q-1-i];
			}
			v =aux;
		}
		public int elements(){
			return q;
		}
}
