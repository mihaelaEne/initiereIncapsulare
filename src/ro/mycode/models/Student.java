package ro.mycode.models;

public class Student {
    public String numeStudent;
    public String varsta;
    public String facultate;
    public int anFacultate;
    public boolean areBursa;

    public String prezentareStudent (){

        String text="";

        text+="Numele studentului este:: "+this.numeStudent+"\n";
        text+="Varsta studentului este: "+this.varsta+"\n";
        text+="Facultatea la care "+ this.numeStudent+" este" +this.facultate+"\n";
        text+="Anul de facultate: "+this.anFacultate+"\n";
        text+= this.numeStudent+ (this.areBursa? "are bursa ":"nu are bursa");

        return text;
    }
}
