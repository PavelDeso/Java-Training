package fuhrpark;

public class FuhrparkTest {

	public static void main(String[] args) {
		
		// Scooter 					   String fahrzeugKennung,  String farbe,   int  zuladungInKG, double kaufpreis, boolean verfuegbar, int gewicht, boolean klappbar
		Scooter rollRoll =new Scooter("Scooter", "Fichttel 50ccm", 		"blau", 		110,               2556.34,          true,               165,                 false);
		Scooter scooter01 = new Scooter("Scooter", "Kennung S1");
		Scooter scooter02 = new Scooter("Scooter", "Kennung S2", -30);
		Scooter scooter03 = new Scooter("Scooter", "Kennung S3", 110);
		Scooter scooter04 = new Scooter("Scooter", "Kennung S4", 30, -10);
		Scooter scooter05 = new Scooter("Scooter", "Kennung S5", 30, 0);
		Scooter scooter06 = new Scooter("Scooter", "Kennung S6", 30, 60);
		Scooter scooter07 = new Scooter("Scooter", "Kennung S7", 30, 120);
		// Escooter 				  String fahrzeugKennung, String farbe, int zuladungInKG,  double kaufpreis, boolean verfuegbar, String accuType, String kfzKennzeichen, double akkuKapazitaet
		Escooter ebike01 =new Escooter("Escooter", "BlitzBlatz350", 	 "rot", 		80,				   4234.99,          true,              "LiFePo4",  	  "B5632D", 		     9.7);
		Escooter ebike02 =new Escooter("Escooter", "Strela1200", 	 "blau", 		100,				   5999.99,          false,             "Li-Ion",  	  "F76335", 		     12.7);
		
		// VerbrennerPKW  String fahrzeugKennung, double kaufpreis, boolean verfuegbar,  int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String farbe, String treibstoff, int fuellstand
		VerbrennerPKW fliwatue = new VerbrennerPKW("Verbrenner PKW", "Fiat 1505L", 16345.78, true,  5, 5, "P-56-234", "weiss", "diesel", 75);
		
		// ElektroPKW String fahrzeugKennung, double kaufpreis, boolean verfuegbar,  int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String farbe, double akkuKapazitaet, int ladestand
		ElektroPKW audiEtron = new ElektroPKW("Elektro PKW", "Audi Etron e7", 45699.99, true, 7, 5, "HH-5732", "schwarz", 83.6, 88);
		
		//LKW String fahrzeugKennung, double kaufpreis, boolean verfuegbar, double zulaessigesGesamtgewicht, double ladeVolume, boolean gefahrengut, boolean kuehlung, String kfzKennzeichen, String farbe
		LKW last45 = new LKW("LKW", "Actros 1845LS", 245899.99, true, 50, 17, false, false, "M-67832", "weiss");
		
		
		
		// Allgemein test
		System.out.println("Fahrzeuganzahl: " + Fahrzeug.getAnzahlFahrzeug());
		System.out.println("Rolleranzahl: " + Roller.getAnzahlRoller());
		System.out.println("PKWanzahl: " + PKW.getAnzahlPKW());
		System.out.println("LKWanzahl: " + LKW.getAnzahlLKW());
		System.out.println("Escooteranzahl: " + Escooter.getAnzahlEscooter());
		System.out.println("Scooteranzahl: " + Scooter.getAnzahlScooter());
		System.out.println("VerbrennerPKWanzahl: " + VerbrennerPKW.getAnzahlVerbrennerPKW());
		System.out.println("ElektroPKWanzahl: " + ElektroPKW.getAnzahlElektroPKW());
		System.out.println("");
		
		scooter01.setGewicht(45);
        scooter01.setGewicht(-45);
        //scooter01.setAnzahlEscooter(45);
        //scooter01.setAnzahlEscooter(-45);
        scooter01.setZuladungInKG(39);
        scooter01.setZuladungInKG(-40);

        System.out.println(scooter01.getFahrzeugkennung() + " :: Gewicht: " + scooter01.getGewicht() + "Kg");
        System.out.println(scooter01.getFahrzeugkennung() + " :: Zuladung in Kg: " + scooter01.getZuladungInKG() + "Kg");
        
        System.out.println(scooter04.getFahrzeugkennung() + " :: Gewicht: " + scooter04.getGewicht() + "Kg");
        System.out.println(scooter04.getFahrzeugkennung() + " :: Zuladung in Kg: " + scooter04.getZuladungInKG() + "Kg");

        
		// Scooter test
		System.out.print(rollRoll.getFahrzeugTyp() + ": " + rollRoll.getFahrzeugkennung() + " is klappbar? ");
		System.out.println(rollRoll.AusgabeKlappbarDeutsch(rollRoll.isKlappbar()));

		rollRoll.setKlappbar(true);
		System.out.println("Fichttel 50 Attribut --isKlappbar-- hat sich geändert!");
		System.out.print(rollRoll.getFahrzeugTyp() + ": " + rollRoll.getFahrzeugkennung() + " is klappbar? ");
		System.out.println(rollRoll.AusgabeKlappbarDeutsch(rollRoll.isKlappbar()));

		//Escooter test
		System.out.println(ebike01.getFahrzeugTyp() + ": " + ebike01.getFahrzeugkennung() + ", Kennzeichen: " + ebike01.getKfzKennzeichen() + ", Akkutype: " + ebike01.getAccuType());
		
		// VerbrennerPKW test
		System.out.println(fliwatue.getFahrzeugTyp() + ": " + fliwatue.getFahrzeugkennung() + ", Kennzeichen: " + fliwatue.getKfzKennzeichen() + ", Farbe: " + fliwatue.getFarbe() + ", Treibstoff: " + fliwatue.getTreibstoff());

		//ElektroPKW test
		System.out.println(audiEtron.getFahrzeugTyp() + ": " + audiEtron.getFahrzeugkennung() + ", Kennzeichen: " + audiEtron.getKfzKennzeichen() + ", Akkukapazität: " + audiEtron.getAkkuKapazitaet() + ", verfügbar: " + audiEtron.ausgabeVerfuegbarDeutsch(audiEtron.getVerfuegbar()));
		
		//LKW
		System.out.println(last45.getFahrzeugTyp() + ": " + last45.getFahrzeugkennung() + ", Kennzeichen: " + last45.getKfzKennzeichen() + ", Ladevolume: " + last45.getLadeVolume() + " m3" + ", Kühlung: " + last45.ausgabeKuehlungDeutsch(last45.isKuehlung()));
		
		/*		
		
		
		System.out.println("Anzahl Scooter " + Scooter.anzahlScooter);
		System.out.println("Anzahl Escooter " + Escooter.anzahlEscooter);
		System.out.println("Anzahl Roller " + Roller.anzahlRoller);
		System.out.println("Anzahl Fahrzeuge " + Fahrzeug.anzahlFahrzeug);
		
		
		Scooter meinErsterScooter = new Scooter();
		Scooter meinZweiterScooter = new Scooter(4);
		Escooter meinErsterEscooter = new Escooter();
		
		System.out.println("Anzahl Scooter " + Scooter.anzahlScooter);
		System.out.println("Anzahl Escooter " +  Escooter.anzahlEscooter);

		System.out.println("Anzahl Roller " + Roller.anzahlRoller);
		System.out.println("Anzahl Fahrzeuge " + Fahrzeug.anzahlFahrzeug);

		
		
		
		
		
		// meinErsterScooter.setKaufpreis(15);
		meinErsterScooter.setGewicht(6);
		
		System.out.println("Kaufpreis " + 
				meinErsterScooter.getKaufpreis());
		
		System.out.println("Gewicht " + 
				meinErsterScooter.getGewicht());
		*/
	}
	

}
