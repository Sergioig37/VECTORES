package vectores;

public class Start {

		public static void main(String[] args) {

			Vectorx v = new Vectorx();
			v.add(2);
			v.add(100);
			v.add(7);
			v.add(8);
			v.add(100);
			v.add(20);
			v.add(100);
			v.add(100);
			v.add(650);
			
			
			
			
			System.out.println(v);
			v.borrarNumero(650);
			System.out.println(v);
			v.borrarNumero(100);
			System.out.println(v);
			v.borrarNumero(7);
			System.out.println(v);
		}

}
