package fuhrpark;

public class Escooter extends Roller {

	static Integer anzahlEscooter = 0;
	private String accuType;
	private String kfzKennzeichen;
	private double akkuKapazitaet;
	
	Escooter(String fahrzeugKennung){
		super(fahrzeugKennung);
		anzahlEscooter++;
	}
	
	
	public Integer getAnzahlEscooter() {
		return anzahlEscooter;
	}
	public void setAnzahlEscooter(Integer anzahlEscooter) {
		this.anzahlEscooter = anzahlEscooter;
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
