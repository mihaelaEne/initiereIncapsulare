package ro.mycode.models;

public class Animal {
    public String animal;
    public String rasa;
    public int varsta;
    public String proprietar;

     public boolean areCip;


    public String prezentareAnimal (){

        String text="";

        text+="Animal: "+this.animal+"\n";
        text+="Rasa animalului este: "+this.rasa+"\n";
        text+="Varsta:  "+this.varsta+"\n";
        text+="Propriet este:      "+this.proprietar+"\n";
        text+= this.animal+ (this.areCip? "are cip ":"nu are cip");

        return text;
    }

}
