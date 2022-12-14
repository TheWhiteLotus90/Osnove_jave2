package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati 
//		platu za svakog

		Magacioner mika = new Magacioner("Mika MIkic");
		Menadzer pera = new Menadzer("Pera Peric");

		Sektor proizvodnja = new Sektor("proizvodnja", 55000);
		Sektor nabavka = new Sektor("trgovina", 48000);

		mika.zaposliuSektor(proizvodnja);
		pera.zaposliuSektor(nabavka);
		pera.zaposliuSektor(nabavka);

		System.out.println("Radnik " + mika.punoIme);
		System.out.println("Sektor " + mika.nizSektora.get(0).getSektor());
		System.out.println("Plata " + mika.plata());
		System.out.println();
		System.out.println("Radnik " + pera.punoIme);
		System.out.println("Sektor " + pera.nizSektora.get(0).getSektor());
		System.out.println("Plata " + pera.plata());

		

	}

}
