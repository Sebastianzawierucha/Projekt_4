package pl.zawierucha.project2;

import static pl.zawierucha.project2.Start.wprowadzenie;
import static pl.zawierucha.project2.Start.zasoby;

public class Ksiazka extends Zasoby{
    private int strony;
    public Ksiazka(){
        strony = 0;
    }
    public Ksiazka(int ID, String tytul, String autor, String datawydania, int cena, String wydawnictwo, int strony){
        this.ID = ID;
        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
        this.cena = cena;
        this.wydawnictwo = wydawnictwo;
        this.strony = strony;
    }

    public String toString(){
        return "\nID: " + ID + "\nTytuł: " + tytul +
                "\nAutor: " + autor + "\nData wydania: " + datawydania + "\n Cena:" + cena + "\n Wydawnictwo:"+ wydawnictwo + "\nIlość stron:" + strony + "\n";
    }
    public static void dodajKsiazke(){
        int ID;
        String tytul;
        String autor;
        String datawydania;
        int cena;
        String wydawnictwo;
        int strony;

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

        System.out.println("\n Wprowadź liczbę stron");
        strony = wprowadzenie.nextInt();

        Ksiazka ksiazka = new Ksiazka(ID, tytul, autor, datawydania, cena, wydawnictwo, strony);
        zasoby.dodajKsiazke(ksiazka);

    }
}
