package vetsibere2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameManager {
    
    public ArrayList<Karta> Balíček = new ArrayList<Karta>();
    public ArrayList<Karta> Balíček2 = new ArrayList<Karta>();
    public ArrayList<Karta> Temp = new ArrayList<Karta>();
    
    public ArrayList<Karta> ZamichejKarty(){
            for (int j = 1; j <= 4; j++) {
                Balíček.add(new Karta(0,"Spodek","" + j));
                Balíček.add(new Karta(1,"Svršek","" + j));
                Balíček.add(new Karta(2,"Král","" + j));
                Balíček.add(new Karta(3,"7","" + j));
                Balíček.add(new Karta(4,"8","" + j));
                Balíček.add(new Karta(5,"9","" + j));
                Balíček.add(new Karta(6,"10","" + j));
                Balíček.add(new Karta(7,"Eso","" + j));
            }
            Collections.shuffle(Balíček);
        return this.Balíček;
    }
    
    public void Vypis(){
        for (Karta k: Balíček) {
            System.out.println(k.nazev +" "+ k.hodnota + " " + k.barva);
        }
        Rozdel();
        System.out.println("-------------");
        for (Karta k: Balíček) {
            System.out.println(k.nazev +" "+ k.hodnota + " " + k.barva);
        }
        System.out.println("-------------");
        for (Karta k: Balíček2) {
            System.out.println(k.nazev +" "+ k.hodnota + " " + k.barva);
        }
    }
    
    public void Rozdel(){
        for (int i = 0; i < 16; i++) {
            Balíček2.add(Balíček.get(i));
            Balíček.remove(i);
        }
    }
    
    public Boolean Porovnej(){
        int h1 =0;
        int h2 =0;
        boolean same = false;
        if(Balíček.isEmpty() != true && Balíček2.isEmpty() !=true){
            h1 = Balíček.get(((Balíček.size())-(Balíček.size()-1))).hodnota;
            h2 = Balíček2.get(((Balíček2.size())-(Balíček2.size()-1))).hodnota;
            Temp.add((Balíček2.get((Balíček2.size())-(Balíček2.size()-1))));
            Temp.add((Balíček.get((Balíček.size())-(Balíček.size()-1))));
            System.out.println("bl1: " + (Balíček.size())+ " " + "bl2: "  + (Balíček2.size()));
            //System.out.println("Tmp " + Temp.size());
            Balíček.remove((Balíček.size())-(Balíček.size()-1));
            Balíček2.remove((Balíček2.size())-(Balíček2.size()-1));
        System.out.println(Balíček.get((Balíček.size())-(Balíček.size()-1)).hodnota + " "+ Balíček.get((Balíček.size())-(Balíček.size()-1)).nazev + " "+ Balíček.get((Balíček.size())-(Balíček.size()-1)).barva);
        System.out.println(Balíček2.get((Balíček2.size())-(Balíček2.size()-1)).hodnota + " "+ Balíček2.get((Balíček2.size())-(Balíček2.size()-1)).nazev + " "+ Balíček2.get((Balíček2.size())-(Balíček2.size()-1)).barva);
        }
        
        if (h1 > h2 && !same) {
            Balíček.addAll(Temp);
            Temp.removeAll(Temp);
        }else if(h1 < h2 && !same){
            Balíček2.addAll(Temp);
            Temp.removeAll(Temp);

        }else if(h1 == h2){
            same = false;
            System.out.println("Stejne");
        }else if(Balíček.isEmpty()){
            System.out.println("hráč 2 vyhrál");
            return false;
        }else{
            System.out.println("Hráč 1 vyhrál");
            return false;
        }
        return true;
    }
    
}
