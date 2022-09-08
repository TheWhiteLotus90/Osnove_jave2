package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
//		Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
	
	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.nizAmbalaza.add(ambalaza);
	}

    private double cenaSaPopustom(double popust) {
    	double zbirCenaSaPopustom = 0;
    	for (int i = 0; i < nizAmbalaza.size(); i++) {
    		double cenaSaPopustom = nizAmbalaza.get(i).cena() - popust;
    		zbirCenaSaPopustom = zbirCenaSaPopustom + cenaSaPopustom;
    	}
		return zbirCenaSaPopustom;
    	}


    public double ukupnaCenaKorpe(SuperKartica superKartica) {
    	double ukupnaCena = this.cenaSaPopustom(superKartica.getPopust());
    	return ukupnaCena;

    }

}
