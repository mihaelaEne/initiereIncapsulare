package ro.mycode.models;

public class Angajat {
    public String nume;
    public String functie;
    public String departament;
    public int aniVechime;
    public char sexFM;
    public boolean areFunctieDeConducere;


    public String prezentareAngajat (){

        String text="";

        text+="Numele angajatului este: "+this.nume+"\n";
        text+="Functia angajatului este: "+this.functie+"\n";
        text+="departamentul din care "+this.nume+" face parte este: "+ this.departament+"\n";
        text+="Vechimea in companie: "+this.aniVechime+"ani "+"\n";
        text+="Sexul angajatului(feminin/masculin): "+this.sexFM+"ani "+"\n";
        text+= this.nume+ (this.areFunctieDeConducere? "are functie de conducere ":"nu are functie de conducere");

        return text;
    }



}
