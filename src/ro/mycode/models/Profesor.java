package ro.mycode.models;

public class Profesor {
    public String nume;
    public String materiePredata;
    public String undePreda;

    public int nrAniExperienta;
    public boolean areDoctorat ;
    public String prezentareProfesor (){

        String text="";

        text+="Numele profesorului este: "+this.nume+"\n";
        text+="Materia predata: "+this.materiePredata+"\n";
        text+="Profesorl preda in urmatoarea locatie:  "+this.undePreda+"\n";
        text+="Profesorul este in acest domeniu de : "+this.nrAniExperienta+" ani "+"\n";
        text+= "Profesorul  "+ (this.areDoctorat? "are doctorat ":"nu are doctorat");

        return text;
    }
}
