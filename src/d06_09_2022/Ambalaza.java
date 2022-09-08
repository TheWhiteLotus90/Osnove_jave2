package d06_09_2022;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	
	private String barkod;
	private String artikl;
	private double netoTezina;
	private double brutoTezina;
	
	
	public Ambalaza(String barkod, String artikl, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.artikl = artikl;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}


	public Ambalaza() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getArtikl() {
		return artikl;
	}

	public void setArtikl(String artikl) {
		this.artikl = artikl;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	
	public double tezinaPakovanja() {
		return this.brutoTezina - this.netoTezina;
	}
	
	abstract double cena();
	abstract void stampaj();
}
