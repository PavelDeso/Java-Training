package fuhrpark;

public class Scooter extends Roller{

	static Integer anzahlScooter = 0;
	private Integer gewicht;
	private boolean klappbar;
	
	Scooter(String fahrzeugKennung ){
		super(fahrzeugKennung);
		anzahlScooter++;
	}
	
	Scooter(String fahrzeugKennung, int gewicht){
		super(fahrzeugKennung);
		anzahlScooter++;
		this.gewicht = gewicht;
	}
	
	Scooter(String fahrzeugKennung, int gewicht, boolean klappbar){
		super(fahrzeugKennung);
		this.gewicht = gewicht;
		this.klappbar = klappbar;
		anzahlScooter++;
	}
	
	public Integer getAnzahlScooter() {
		return anzahlScooter;
	}
	public void setAnzahlScooter(Integer anzahlScooter) {
		this.anzahlScooter = anzahlScooter;
	}
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
	
	
	
	
}
