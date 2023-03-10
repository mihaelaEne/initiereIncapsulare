package ro.mycode.models;

public class Client {

    public String nume;
    public int idClient;
    public char judet;
    public int nrComenzi;
    public boolean esteMajor;

    public String prezentareClient (){

        String text="";

        text+="Numele clientului este:    "+this.nume+"\n";
        text+="ID-ul clientului este:    "+this.idClient+"\n"
        text+="Judetul in care traieste clentul::  "+ this.judet+"\n";
        text+="Numarul de comenzi comandate pana in prezent:      "+this.nrComenzi+"\n";
        text+= "Clientul "+ (this.esteMajor? "este major ":"nu este major");

        return text;
    }

}
