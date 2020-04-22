package pl.zawierucha.project2;

import static pl.zawierucha.project2.Start.wprowadzenie;
import static pl.zawierucha.project2.Start.zasoby;

public class Film extends Zasoby{
    private int dlugosc;
    public Film(){
        dlugosc = 0;
    }
    public Film(int ID, String tytul, String autor, String datawydania, int cena, String wydawnictwo, int dlugosc){
        this.ID = ID;
        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
        this.cena = cena;
        this.wydawnictwo = wydawnictwo;
        this.dlugosc = dlugosc;
    }

    public String toString(){
        return "\nID: " + ID + "\nTytuł: " + tytul +
                "\nAutor: " + autor + "\nData wydania: " + datawydania + "\n Cena:" + cena + "\n Wydawnictwo:"+ wydawnictwo + "\nCzas trwania:" + dlugosc + "\n";
    }

    public static void dodajFilm(){
        int ID;
        String tytul;
        String autor;
        String datawydania;
        int cena;
        String wydawnictwo;
        int dlugosc;

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

        System.out.println("\n Wprowadź długość filmu");
        dlugosc = wprowadzenie.nextInt();

        Film film = new Film(ID, tytul, autor, datawydania, cena, wydawnictwo, dlugosc);
        zasoby.dodajFilm(film);

    }
}
