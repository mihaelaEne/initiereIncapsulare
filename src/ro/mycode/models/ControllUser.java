package ro.mycode.models;

import java.util.ArrayList;

public class ControllUser {

    //proprietati
    public ArrayList<User> users = new ArrayList<>();
    public ArrayList<User> masini = new ArrayList<>();
    public ArrayList<User> clienti = new ArrayList<>();
    public ArrayList<User> angajati = new ArrayList<>();
    public ArrayList<User> animale = new ArrayList<>();


    //metoda

    public void loadUser() {


        User u1 = new User();
        u1.password = "1234";
        u1.username = "Ana";
        u1.id = 55;
        u1.varsta = 20;
        u1.aFostActiv = true;


        User u2 = new User();
        u2.username = "Mihaela";
        u2.password = "floricele";
        u2.id = 001;
        u2.varsta = 25;
        u2.aFostActiv = false;

        User u3 = new User();
        u3.username = "George";
        u3.password = "maria";
        u3.id = 12221;
        u3.varsta = 50;
        u3.aFostActiv = false;

        User u4 = new User();
        u4.username = "Ion";
        u4.password = "iii";
        u4.id = 789;
        u4.varsta = 14;
        u4.aFostActiv = true;

        User u5 = new User();
        u5.username = "Alex";
        u5.password = "yyyy";
        u5.id = 456;
        u5.varsta = 70;
        u5.aFostActiv = false;

        User u6 = new User();
        u6.username = "Andrei";
        u6.password = "ppp";
        u6.id = 963;
        u6.varsta = 35;
        u6.aFostActiv = true;

        this.users.add(u1);
        this.users.add(u2);
        this.users.add(u3);
        this.users.add(u4);
        this.users.add(u5);
        this.users.add(u6);

    }

    //todo:metoda de afisare
    public void afisareUser() {
        for (int i = 0; i < this.users.size(); i++) {

            System.out.println(this.users.get(i).descriere());
        }
    }

    //todo:o metoda ce returneaza cate persoane au fost active

    public int nrPersoaneActive() {
        int ct = 0;
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).aFostActiv == true) {
                ct++;
            }
        }
        return ct;
    }

    //todo:o metoda ce returneaza persoana cea mai batrana

    public User persoanaBatrana() {

        User userMax = this.users.get(0);
        for (int i = 0; i < this.users.size(); i++) {

            if (this.users.get(i).varsta > userMax.varsta) {

                userMax = this.users.get(i);
            }

        }
        return userMax;
    }


    public void loadMasina() {
        Masina m1 = new Masina();
        m1.marca = "Ford";
        m1.model="Fiesta";
        m1.serieSasiu=2157895;
        m1.an=2016;
        m1.esteElectrica=false;

        Masina m2 = new Masina();
        m2.marca = "BMW";
        m2.model="F10";
        m2.serieSasiu=123456789;
        m2.an=2019;
        m2.esteElectrica=true;

        Masina m3 = new Masina();
        m3.marca = "Audi";
        m3.model="Q8";
        m3.serieSasiu=987654;
        m3.an=2022;
        m3.esteElectrica=true;

        Masina m4 = new Masina();
        m4.marca = "Dacia";
        m4.model="Sandero";
        m4.serieSasiu=741258;
        m4.an=2008;
        m4.esteElectrica=false;


        Masina m5 = new Masina();
        m1.marca = "Volkswagen";
        m1.model="Passat";
        m1.serieSasiu=8889745;
        m1.an=2000;
        m1.esteElectrica=false;





    }

    public void loadClient(){
        Client c1=new Client();
        c1.nume="Mihaela";
        c1.idClient=001;
        c1.judet='T';
        c1.nrComenzi=12;
        c1.esteMajor=true;

        Client c2=new Client();
        c2.nume="Victor";
        c2.idClient=002;
        c2.judet='B';
        c2.nrComenzi=8;
        c2.esteMajor=false;


        Client c3=new Client();
        c3.nume="Denisa";
        c3.idClient=003;
        c3.judet='G';
        c3.nrComenzi=10;
        c3.esteMajor=true;




    }
    public void loadAngajat(){
        Angajat a1=new Angajat();
       a1.nume="Ioana";
        a1.functie="Manager";
        a1.departament="HR";
        a1.aniVechime=8;
        a1.sexFM='F';
        a1.areFunctieDeConducere=true;

        Angajat a2=new Angajat();
        a2.nume="Mihaela";
        a2.functie="Researcher";
        a2.departament="Research";
        a2.aniVechime=1;
        a2.sexFM='F';
        a2.areFunctieDeConducere=false;




    }
    public void loadAnimal(){
        Animal an1=new Animal();
        an1.animal="caine";
        an1.rasa="Doberman";
        an1.varsta=5;
        an1.proprietar="Popescu";
        an1.areCip=true;

        Animal an2=new Animal();
        an2.animal="pisica";
        an2.rasa= "Don Sphynx";
        an2.varsta=10;
        an2.proprietar="Burlan";
        an2.areCip=false;

        Animal an3=new Animal();
        an3.animal="papagal";
        an3.rasa="African";
        an3.varsta=15;
        an3.proprietar="Simionescu";
        an3.areCip=true;

        Animal an4=new Animal();
        an4.animal="hamster";
        an4.rasa="Roborovski";
        an4.varsta=1;
        an4.proprietar="Stefanescu";
        an4.areCip=false;


    }


    public void afisareMasina() {
        for (int i = 0; i < this.masini.size(); i++) {

            System.out.println(this.masini.get(i).descriere());
        }
    }

    public void afisareAngajat() {
        for (int i = 0; i < this.angajati.size(); i++) {

            System.out.println(this.angajati.get(i).descriere());
        }
    }
    public void afisareAnimale() {
        for (int i = 0; i < this.animale.size(); i++) {

            System.out.println(this.animale.get(i).descriere());
        }
    }

    public void afisareClienti() {
        for (int i = 0; i < this.clienti.size(); i++) {

            System.out.println(this.clienti.get(i).descriere());
        }
    }


    public int masiniElectrice() {
        int ct = 0;
        for (int i = 0; i < this.masini.size(); i++) {
            if (this.masini.get(i).esteElectrica == true) {
                ct++;
            }
        }
        return ct;
    }
}