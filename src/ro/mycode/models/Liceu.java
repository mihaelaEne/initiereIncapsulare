package ro.mycode.models;

public class Liceu {
    public String numeLiceu;
    public int nrProfi;
    public int nrElevi;
    public String adresa;
    public boolean esteVocational;

    public String prezentareLiceu (){

        String text="";

        text+="Numele liceului este: "+this.numeLiceu+"\n";
        text+="Numarul de profesori: "+this.nrProfi+"\n";
        text+="Numarul de elevi:  "+this.nrElevi+"\n";
        text+="Adresa liceului: "+this.adresa+"\n";
        text+= this.numeLiceu+ (this.esteVocational? "este vocational ":"nu este vocational");

        return text;
    }


}
