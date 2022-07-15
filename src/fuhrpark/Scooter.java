package fuhrpark;

public class Scooter extends Roller{

	private static Integer anzahlScooter = 0;
	private Integer gewicht;
	private boolean klappbar;
	private String klappbarDeutsch;
	
	Scooter(String fahrzeugTyp, String fahrzeugKennung){
		super(fahrzeugTyp, fahrzeugKennung);
		anzahlScooter++;
	}
	
	Scooter(String fahrzeugTyp, String fahrzeugKennung, int gewicht){
		super(fahrzeugTyp, fahrzeugKennung);
		if (gewicht > 0) {
		this.gewicht = gewicht;
		}
		else { this.gewicht = 9999;
		}
		anzahlScooter++;
	}
	
	Scooter(String fahrzeugTyp, String fahrzeugKennung, int gewicht, int zuladungInKG){
		super(fahrzeugTyp, fahrzeugKennung, zuladungInKG);
		this.gewicht = gewicht;
		anzahlScooter++;
	}
	
	public Scooter(String fahrzeugTyp, String fahrzeugKennung, String farbe, int zuladungInKG, double kaufpreis, boolean verfuegbar, int gewicht, boolean klappbar) {
		super(fahrzeugTyp, fahrzeugKennung, farbe, zuladungInKG, kaufpreis, verfuegbar);
		this.gewicht = gewicht;
		this.klappbar = klappbar;
		anzahlScooter++;
	}

	public static Integer getAnzahlScooter() {
		return anzahlScooter;
	}
//	public void setAnzahlScooter(Integer anzahlScooter) {
//		this.anzahlScooter = anzahlScooter;
//	}
	public Integer getGewicht() {
		return gewicht;
	}
	public void setGewicht(Integer gewicht) {
		this.gewicht = gewicht;
	}
	public boolean isKlappbar() {
		return klappbar;
	}
	public void setKlappbar(boolean klappbar) {
		this.klappbar = klappbar;
	}
	
	public String AusgabeKlappbarDeutsch(boolean klappbar) {
		if (klappbar == true) {
			this.klappbarDeutsch = "Ja";
		}
		else {this.klappbarDeutsch = "Nein";
		
		}
		return klappbarDeutsch;
	}
}
