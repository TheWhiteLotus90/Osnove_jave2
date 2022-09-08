package d05_09_2022;

public class Magacioner extends Radnik{

	public Magacioner(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	private double avgPlata() {
		return 0;	
	}
	
	@Override
	double plata() {
		// TODO Auto-generated method stub
		double avgPlata = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			avgPlata = avgPlata + nizSektora.get(i).getPlata();
		}
		avgPlata = avgPlata / nizSektora.size() * 0.5;
		return avgPlata;
	}

	
}
