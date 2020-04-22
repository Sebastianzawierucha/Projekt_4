package pl.zawierucha.project2;

import static pl.zawierucha.project2.Start.wprowadzenie;
import static pl.zawierucha.project2.Start.zasoby;

public class Audiobook extends Zasoby {
    private int czesci;

    public Audiobook() {
        czesci = 0;
    }
    public Audiobook(int ID, String tytul, String autor, String datawydania, int cena, String wydawnictwo, int czesci) {
        this.ID = ID;
        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
        this.cena = cena;
        this.wydawnictwo = wydawnictwo;
        this.czesci = czesci;
    }

    public String toString() {
        return "\nID: " + ID + "\nTytuł: " + tytul +
                "\nAutor: " + autor + "\nData wydania: " + datawydania + "\n Cena:" + cena + "\n Wydawnictwo:"+ wydawnictwo + "\nIlość części:" + czesci + "\n";
    }
    public static void dodajAudiobook(){
        int ID;
        String tytul;
        String autor;
        String datawydania;
        int cena;
        String wydawnictwo;
        int czesci;
        System.out.println("\n Podaj ID audiobooka:");
        ID = wprowadzenie.nextInt();

        System.out.println("\n Podaj tytuł audiobooka:");
        tytul = wprowadzenie.next();

        System.out.println("\n Podaj autora audiobooka:");
        autor = wprowadzenie.next();

        System.out.println("\n Podaj datę wydania: (DD/MM/YYYY)");
        datawydania = wprowadzenie.next();

        System.out.println("\n Podaj cenę audiobooka: ");
        cena = wprowadzenie.nextInt();

        System.out.println("\n Podaj wydawnictwo: ");
        wydawnictwo = wprowadzenie.next();

        System.out.println("\n Wprowadź liczbę części: ");
        czesci = wprowadzenie.nextInt();

        Audiobook audiobook = new Audiobook(ID, tytul, autor, datawydania, cena, wydawnictwo, czesci);
        zasoby.dodajAudiobook(audiobook);

    }
}