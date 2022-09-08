package d06_09_2022;

public class SuperKartica {
//		Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	
	private int brKartice;
	private String punoIme;
	private double popust;
	public SuperKartica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperKartica(int brKartice, String punoIme, double popust) {
		super();
		this.brKartice = brKartice;
		this.punoIme = punoIme;
		this.popust = popust;
	}
	public int getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(int brKartice) {
		this.brKartice = brKartice;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public double getPopust() {
		return popust;
	}
	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public void stampaj() {
		System.out.println("Broj kartice:"+ this.brKartice );
		System.out.println("Ime i prezime: "+ this.punoIme);
		System.out.println("Popust: "+ this.popust);
	}
}
