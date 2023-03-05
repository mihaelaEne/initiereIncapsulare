package ro.mycode.models;

public class User {
    //atribute
    public String username;
    public String password;
    public int id;

    public int varsta;
    public boolean aFostActiv;


    //metode

    public String descriere(){

        String text="";

        text+="User:    "+this.username+"\n";
        text+="password "+ this.password+"\n";
        text+="id:      "+this.id+"\n";
        text+="varsta:  "+ this.varsta+"\n";
        text+= "Userul "+ (this.aFostActiv? "a fost activ ":"nu a fost activ");

        return text;
    }

}
