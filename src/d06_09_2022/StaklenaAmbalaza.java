package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	private int kaucija;
	private boolean placanjeKaucije;
	private double osnovnaCena;
	
	 
	
	public StaklenaAmbalaza(String barkod, String artikl, double netoTezina, double brutoTezina, int kaucija,
			boolean placanjeKaucije, double osnovnaCena) {
		super(barkod, artikl, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.placanjeKaucije = placanjeKaucije;
		this.osnovnaCena = osnovnaCena;
	}
	public int getKaucija() {
		return kaucija;
	}
	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}
	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	double cena() {
		if(placanjeKaucije == true) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}return this.osnovnaCena * 1.2;
	}
	@Override
	void stampaj() {
		System.out.println("Naziv: "+ this.getArtikl());
		System.out.println("Barkod: "+ this.getBarkod());
		System.out.println("BRuto tezina: "+ this.getBrutoTezina());
		System.out.println("Neto tezina: "+ this.getNetoTezina());
		if(placanjeKaucije == true) {
			System.out.println("Kaucija se placa.");
			System.out.println("Kaucija je "+ this.kaucija);
		}else {
			System.out.println("Kaucija se ne placa.");
		}
		System.out.println("Cena: "+ this.osnovnaCena);
		
	}
	
	
	
}
