package fuhrpark;

//Escooter	String fahrzeugKennung, String farbe, int zuladungInKG, double kaufpreis,
//			boolean verfuegbar, String accuType,
//			String kfzKennzeichen, double akkuKapazitaet
public class Escooter extends Roller {

	private static Integer anzahlEscooter = 0;
	private String accuType;
	private String kfzKennzeichen;
	private double akkuKapazitaet;
	
	Escooter(String fahrzeugTyp, String fahrzeugKennung){
		super(fahrzeugTyp, fahrzeugKennung);
		anzahlEscooter++;
	}
	
	Escooter(String fahrzeugTyp, String fahrzeugKennung, String accuType){
		super(fahrzeugTyp, fahrzeugKennung);
		this.accuType = accuType;
		anzahlEscooter++;
	}
	
	Escooter(String fahrzeugTyp, String fahrzeugKennung, String accuType, String kfzKennzeichen){
		super(fahrzeugTyp, fahrzeugKennung);
		this.accuType = accuType;
		this.kfzKennzeichen = kfzKennzeichen;
		anzahlEscooter++;
	}
	
	Escooter(String fahrzeugTyp, String fahrzeugKennung, String accuType, String kfzKennzeichen, double akkuKapazitaet){
		super(fahrzeugTyp, fahrzeugKennung);
		this.accuType = accuType;
		this.kfzKennzeichen = kfzKennzeichen;
		this.akkuKapazitaet = akkuKapazitaet;
		anzahlEscooter++;
	}
	
	public Escooter(String fahrzeugTyp, String fahrzeugKennung, String farbe, int zuladungInKG, double kaufpreis, boolean verfuegbar, String accuType, String kfzKennzeichen, double akkuKapazitaet) {
		super(fahrzeugTyp, fahrzeugKennung, farbe, zuladungInKG, kaufpreis, verfuegbar);
		this.accuType = accuType;
		this.kfzKennzeichen = kfzKennzeichen;
		this.akkuKapazitaet = akkuKapazitaet;
		anzahlEscooter++;
	}
	
	static Integer getAnzahlEscooter() {
		return anzahlEscooter;
	}
	public void setAnzahlEscooter(Integer anzahlEscooter) {
		Escooter.anzahlEscooter = anzahlEscooter;
	}
	public String getAccuType() {
		return accuType;
	}
	public void setAccuType(String accuType) {
		this.accuType = accuType;
	}
	public String getKfzKennzeichen() {
		return kfzKennzeichen;
	}
	public void setKfzKennzeichen(String kfzKennzeichen) {
		this.kfzKennzeichen = kfzKennzeichen;
	}
	public double getAkkuKapazitaet() {
		return akkuKapazitaet;
	}
	public void setAkkuKapazitaet(double akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}
	
	
	
}
