package ro.mycode.models;

public class Laptop {
    public String marca;
    public String model;
    public String furnizor;
    public int anFabricatie;
    public boolean areSSD;

    public String prezentareLaptop (){

        String text="";

        text+="Marca laptopului este:: "+this.marca+"\n";
        text+="Modelul de laptop: "+this.model+"\n";
        text+="Laptopul se poate cumpara de la :  "+this.furnizor+"\n";
        text+="Anul in care a fost fabricat este: "+this.anFabricatie+"\n";
        text+= this.model+ (this.areSSD? "are SSD ":"nu are nSSD");

        return text;
    }

}
