package ro.mycode.models;

public class Masina {

    public String marca;
    public String model;

    public float serieSasiu;
    public int an;
    public boolean esteElectrica;



    public String prezentareMasina (){

        String text="";

        text+="Marca autoturismului este:    "+this.marca+"\n";
        text+="Modelul autoturismului este:    "+this.model+"\n"
        text+="Seria de sasiu:  "+ this.serieSasiu+"\n";
        text+="Anul de fabricatie:      "+this.an+"\n";
        text+= "Masina "+ (this.esteElectrica? "este electrica ":"nu este electrica");

        return text;
    }

}
