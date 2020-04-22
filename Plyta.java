package pl.zawierucha.project2;

import static pl.zawierucha.project2.Start.wprowadzenie;
import static pl.zawierucha.project2.Start.zasoby;

public class Plyta extends Zasoby{
    private int utwory;
    public Plyta(){
        utwory = 0;
    }
    public Plyta(int ID, String tytul, String autor, String datawydania, int cena, String wydawnictwo, int utwory){
        this.ID = ID;
        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
        this.cena = cena;
        this.wydawnictwo = wydawnictwo;
        this.utwory = utwory;
    }

    public String toString(){
        return "\nID: " + ID + "\nTytuł: " + tytul +
        "\nAutor: " + autor + "\nData wydania: " + datawydania + "\n Cena:" + cena + "\n Wydawnictwo:"+ wydawnictwo + "\nIlość utworów:" + utwory + "\n";
    }
    public static void dodajPlyte(){
        int ID;
        String tytul;
        String autor;
        String datawydania;
        int cena;
        String wydawnictwo;
        int utwory;

        System.out.println("\n Podaj ID książki");
        ID = wprowadzenie.nextInt();

        System.out.println("\n Podaj tytuł książki");
        tytul = wprowadzenie.next();

        System.out.println("\n Podaj autora książki");
        autor = wprowadzenie.next();

        System.out.println("\n Podaj datę wydania");
        datawydania = wprowadzenie.next();

        System.out.println("\n Podaj cenę książki");
        cena = wprowadzenie.nextInt();

        System.out.println("\n Podaj wydawnictwo");
        wydawnictwo = wprowadzenie.next();

        System.out.println("\n Wprowadź liczbę utworów");
        utwory = wprowadzenie.nextInt();

        Plyta plyta = new Plyta(ID, tytul, autor, datawydania, cena, wydawnictwo, utwory);
        zasoby.dodajPlyte(plyta);

    }
}
