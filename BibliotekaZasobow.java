package pl.zawierucha.project2;

import java.util.ArrayList;

public class BibliotekaZasobow{
    private ArrayList<Zasoby> zasoby;
    public BibliotekaZasobow(){
        zasoby = new ArrayList<Zasoby>();
    }
    public void dodajKsiazke(Ksiazka ksiazka){
        zasoby.add(ksiazka);
    }
    public void dodajEbook(Ebook ebook){
        zasoby.add(ebook);
    }
    public void dodajAudiobook(Audiobook audiobook){
        zasoby.add(audiobook);
    }
    public void dodajPlyte(Plyta plyta){
        zasoby.add(plyta);
    }
    public void dodajFilm(Film film){
        zasoby.add(film);
    }

    public String toString(){
        String total = "\n";
        for (int i=0; i<zasoby.size(); i++){
            Zasoby k = zasoby.get(i);
            total = total + k.toString();
        }
        return total;
    }
}

