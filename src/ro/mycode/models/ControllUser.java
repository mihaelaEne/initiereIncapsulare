package ro.mycode.models;

import java.util.ArrayList;

public class ControllUser {

    //proprietati
    public ArrayList<User>users= new ArrayList<>();


    //metoda

    public void load(){


        User u1 = new User();
        u1.password = "1234";
        u1.username = "Ana";
        u1.id = 55;
        u1.varsta=20;
        u1.aFostActiv = true;


        User u2 = new User();
        u2.username = "Mihaela";
        u2.password = "floricele";
        u2.id = 001;
        u2.varsta=25;
        u2.aFostActiv = false;

        User u3 = new User();
        u3.username = "George";
        u3.password = "maria";
        u3.id = 12221;
        u3.varsta=50;
        u3.aFostActiv = false;

        User u4 = new User();
        u4.username = "Ion";
        u4.password = "iii";
        u4.id = 789;
        u4.varsta=14;
        u4.aFostActiv = true;

        User u5 = new User();
        u5.username = "Alex";
        u5.password = "yyyy";
        u5.id = 456;
        u5.varsta=70;
        u5.aFostActiv = false;

        User u6 = new User();
        u6.username = "Andrei";
        u6.password = "ppp";
        u6.id = 963;
        u6.varsta=35;
        u6.aFostActiv = true;

        this.users.add(u1);
        this.users.add(u2);
        this.users.add(u3);
        this.users.add(u4);
        this.users.add(u5);
        this.users.add(u6);





//        for(int i=0;i<users.size();i++){
//
//            System.out.println(users.get(i).descriere());
//            System.out.println("=========================");
//        }


    }

    //todo:metoda de afisare
    public  void afisareUser(){
      for(int i=0; i<this.users.size(); i++){

          System.out.println(this.users.get(i).descriere());
      }
    }

    //todo:o metoda ce returneaza cate persoane au fost active

    public int nrPersoaneActive(){
        int ct=0;
        for(int i=0; i<this.users.size(); i++){
            if(this.users.get(i).aFostActiv==true){
                ct++;
            }
        }
        return ct;
    }

    //todo:o metoda ce returneaza persoana cea mai invrsta

    public User persoanaBatrana(){

        User userMax=this.users.get(0);
        for(int i=0; i<this.users.size(); i++){

            if(this.users.get(i).varsta>userMax.varsta){

                userMax=this.users.get(i);
            }

        }
        return userMax;
    }
}
