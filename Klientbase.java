package pl.zawierucha.project2;

public class Klientbase {
    private String imie, nazwisko;
    private String adres;
    private int wiek;
    private String datazapisu;
    private int wartosckary;
    private boolean mozliwoscwypozyczenia;



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

}