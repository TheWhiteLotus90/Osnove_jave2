package d06_09_2022;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	
	private boolean reciklira;
	private double osnovnaCena;
	
	
	
	public Tetrapak(String barkod, String artikl, double netoTezina, double brutoTezina, boolean reciklira, double osnovnaCena) {
		super(barkod, artikl, netoTezina, brutoTezina);
		this.reciklira = reciklira;
		this.osnovnaCena = osnovnaCena;
		// TODO Auto-generated constructor stub
	}
	public boolean isReciklira() {
		return reciklira;
	}
	public void setReciklira(boolean reciklira) {
		this.reciklira = reciklira;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	

	@Override
	double cena() {
		if(reciklira == true) {
			return tezinaPakovanja() * 1.5 + osnovnaCena;
		}return this.osnovnaCena;
	}
	@Override
	void stampaj() {
		System.out.println("Naziv: "+ this.getArtikl());
		System.out.println("Barkod: "+ this.getBarkod());
		System.out.println("BRuto tezina: "+ this.getBrutoTezina());
		System.out.println("Neto tezina: "+ this.getNetoTezina());
		if(reciklira == true) {
			System.out.println("Reciklirajuca");
		}else {
			System.out.println("Nije reciklirajuca");
		}
		System.out.println("Cena: "+ this.osnovnaCena);
		
	}
}
