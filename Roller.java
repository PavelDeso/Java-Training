package fuhrpark;

public class Roller extends Fahrzeug{
	static int anzahlRoller = 0;
	private String farbe;
	private Integer zuladungInKG;
	
	Roller(String fahrzeugKennung){
		super(fahrzeugKennung);
		anzahlRoller++;
	}
	
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public Integer getZuladungInKG() {
		return zuladungInKG;
	}
	public void setZuladungInKG(Integer zuladungInKG) {
		this.zuladungInKG = zuladungInKG;
	}
	
	

}
