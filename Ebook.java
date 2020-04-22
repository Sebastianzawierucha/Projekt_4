package pl.zawierucha.project2;

import static pl.zawierucha.project2.Start.wprowadzenie;
import static pl.zawierucha.project2.Start.zasoby;

public class Ebook extends Zasoby{
    private int rozdzialy;
    public Ebook(){
        rozdzialy = 0;
    }
    public Ebook(int ID, String tytul, String autor, String datawydania, int cena, String wydawnictwo, int rozdzialy){
        this.ID = ID;
        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
        this.cena = cena;
        this.wydawnictwo = wydawnictwo;
        this.rozdzialy = rozdzialy;
    }

    public String toString(){
        return "\nID: " + ID + "\nTytuł: " + tytul +
                "\nAutor: " + autor + "\nData wydania: " + datawydania + "\n Cena:" + cena + "\n Wydawnictwo:"+ wydawnictwo + "\nIlość rozdziałów:" + rozdzialy + "\n";
    }
    public static void dodajEbook(){
        int ID;
        String tytul;
        String autor;
        String datawydania;
        int cena;
        String wydawnictwo;
        int rozdzialy;

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

        System.out.println("\n Wprowadź ilość stron");
        rozdzialy = wprowadzenie.nextInt();

        Ebook ebook = new Ebook(ID, tytul, autor, datawydania, cena, wydawnictwo, rozdzialy);
        zasoby.dodajEbook(ebook);

    }
}
