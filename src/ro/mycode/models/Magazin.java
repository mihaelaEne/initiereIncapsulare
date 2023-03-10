package ro.mycode.models;

public class Magazin {
    public String numeMagazin;
    public String localitatePozitionare;
    public int nrEtaje;
    public char indicativulMagazinului;
    public boolean esteNonStop;

    public String prezentareMagazin (){

        String text="";

        text+="Numele magazinului: "+this.numeMagazin+"\n";
        text+="Localitatea in care se afla magazinul este : "+this.localitatePozitionare+"\n";
        text+="Numarul de etaje este:  "+this.nrEtaje+"\n";
        text+="Indicativul magazinului: "+this.indicativulMagazinului+"\n";
        text+= this.numeMagazin+ (this.esteNonStop? "este non-stop ":"nu este non-stop");

        return text;
    }
}
