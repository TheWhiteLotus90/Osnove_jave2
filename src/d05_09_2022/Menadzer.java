package d05_09_2022;

public class Menadzer extends Radnik {

	public Menadzer(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override-uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	@Override
		public double plata() {
			double sumaPlata = 0;
			for (int i = 0; i < nizSektora.size(); i++) {
				sumaPlata = sumaPlata + nizSektora.get(i).getPlata();
			}
			return sumaPlata;
		}


}
