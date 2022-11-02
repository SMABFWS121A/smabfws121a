package sma;

public class BankKontoBuilder {
    
    public int kontoNummer;
    public String kundenVorname;
    public int kontoBetrag;
    public String kundenNachname;
    public String email;
    public String adresse;
    public String telefonNummer;

    public Bankkonto build() {
        return new Bankkonto(kontoNummer,kundenVorname,kontoBetrag,kundenNachname,
                                email,adresse,telefonNummer);
    }
    
    
    
    
}
