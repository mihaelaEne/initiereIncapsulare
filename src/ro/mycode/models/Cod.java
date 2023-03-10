package ro.mycode.models;

public class Cod {
    public String tematicaCod;
    public String limbajProgramare;
    public String tipAplicatie;
    public int nrLiniiCod;
    public boolean esteEficient;
    public String prezentareCod (){

        String text="";

        text+="Tematica cod: "+this.tematicaCod+"\n";
        text+="Limbajul folosit de programator: "+this.limbajProgramare+"\n";
        text+="Tipul de aplicatie:  "+this.tipAplicatie+"\n";
        text+="Numarul de linii de cod: "+this.nrLiniiCod+"\n";
        text+= "Codul  "+ (this.esteEficient? "este eficient ":"nu este eficient");

        return text;
    }
}
