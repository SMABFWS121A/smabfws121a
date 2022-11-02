package sma;

public class Bankkonto {

    public final int kontoNummer;
    public final String kundenVorname;
    public final int kontoBetrag;
    public final String kundenNachname;
    public final String email;
    public final String adresse;
    public final String telefonNummer;
    
    Bankkonto(
        int kontoNummer,
        String kundenVorname,
        int kontoBetrag,
        String kundenNachname,
        String email,
        String adresse,
        String telefonNummer
    ) {
        super();
        this.kontoNummer = kontoNummer;
        this.kundenVorname = kundenVorname;
        this.kontoBetrag = kontoBetrag;
        this.kundenNachname = kundenNachname;
        this.email = email;
        this.adresse = adresse;
        this.telefonNummer = telefonNummer;
    }
    
    
    
}
