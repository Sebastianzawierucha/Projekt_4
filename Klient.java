package pl.zawierucha.project2;

import static pl.zawierucha.project2.Start.klientlist;
import static pl.zawierucha.project2.Start.wprowadzenie;

public class Klient {
private Klientbase klientbase;
    private String imie, nazwisko;
    private String adres;
    private int wiek;
    private String datazapisu;
    private int wartosckary;
    private boolean mozliwoscwypozyczenia;

    public Klient(String imie, String nazwisko, String adres, int wiek, String datazapisu, int wartosckary, boolean mozliwoscwypozyczenia) {
        this.klientbase = new Klientbase();
        klientbase.setImie(imie);
        klientbase.setNazwisko(nazwisko);
        klientbase.setAdres(adres);
        klientbase.setWiek(wiek);
        klientbase.setDatazapisu(datazapisu);
        klientbase.setWartosckary(wartosckary);
        klientbase.setMozliwoscwypozyczenia(mozliwoscwypozyczenia);
        }



    public void setImie(String imie){
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void setAdres(String adres){
        this.adres = adres;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }
    public void setDatazapisu(String datazapisu){
        this.datazapisu = datazapisu;
    }
    public void setWartosckary(int wartosckary){
        this.wartosckary = wartosckary;
    }
    public void setMozliwoscwypozyczenia(boolean mozliwoscwypozyczenia){
        this.mozliwoscwypozyczenia = mozliwoscwypozyczenia;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getAdres(){
        return adres;
    }
    public int getWiek(){
        return wiek;
    }
    public String getDatazapisu(){
        return datazapisu;
    }
    public int getWartosckary(){
        return wartosckary;
    }
    public boolean getMozliwoscwypozyczenia(){
        return mozliwoscwypozyczenia;
    }
    public String toString(){
        return "\nImie: " + getImie() + "\nNazwisko:" + getNazwisko() + "\n Adres" + getAdres() +
                "\n Wiek:" + getWiek() + "\nNaliczone kary:" + getWartosckary() + "\nMoze wypozyczac? " + getMozliwoscwypozyczenia() + "\n";
    }

    public static void dodajKlienta(){

        String imie;
        String nazwisko;
        String adres;
        int wiek;
        String datazapisu;
        int wartosckary = 0;
        boolean mozliwoscwypozyczenia = true;
        int czywypozyczyl;
        int dniwypozyczenia;
        System.out.println("\n Podaj imie klienta");
        imie = wprowadzenie.next();

        System.out.println("\n Podaj nazwisko klienta");
        nazwisko = wprowadzenie.next();

        System.out.println("\n Podaj adres klienta");
        adres = wprowadzenie.next();

        System.out.println("\n Podaj wiek klienta");
        wiek = wprowadzenie.nextInt();

        System.out.println("\n Podaj date zapisu klienta");
        datazapisu = wprowadzenie.next();

        System.out.println("\n Czy klient coś wypożyczył? 1-tak 0- nie");
        czywypozyczyl = wprowadzenie.nextInt();
        if (czywypozyczyl == 1){
            System.out.println("\n Ile dni temu wypożyczył?");
            dniwypozyczenia = wprowadzenie.nextInt();
            if (dniwypozyczenia > 14) {
                wartosckary = dniwypozyczenia * 2;

                mozliwoscwypozyczenia = false;

                System.out.println("\n**Naliczono opłate i zablokowano**\n");
            }

        }




        Klient klient = new Klient(imie, nazwisko, adres, wiek, datazapisu, wartosckary,mozliwoscwypozyczenia);
        klientlist.dodajKlienta(klient);
    }

}

