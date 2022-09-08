package d05_09_2022;

public class Sektor {
//	Kreirati klasu Sektor koja ima:
//	naziv sektora
//	platu koja je za taj sektor
	
	protected String sektor;
	protected double plata;
	
	
	public Sektor(String sektor, double plata) {
		super();
		this.sektor = sektor;
		this.plata = plata;
	}
	public String getSektor() {
		return sektor;
	}
	public void setSektor(String sektor) {
		this.sektor = sektor;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	
}
