package pl.zawierucha.project2;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static Boolean uruchomienie = true;
    public static Scanner wprowadzenie = new Scanner(System.in);
    public static BibliotekaZasobow zasoby = new BibliotekaZasobow();
    public static ListaKlientow klientlist = new ListaKlientow();

    public static void main(String[] args) {
    while (uruchomienie) {

        System.out.println("\nWprowadź 0 aby dodać utwór"
                + "\nWprowadź 1 aby wyświetlić listę utworów"
                + "\nWprowadź 2 aby dodać klienta"
                + "\nWprowadź 4 aby pokazać listę klientów"
                + "\nWprowadź 10 aby wyjść");
        int odp = wprowadzenie.nextInt();
        if (odp == 0) {
                System.out.println("\nWprowadź 5 aby dodać książkę"
                + "\n Wprowadź 6 aby dodać audiobook"
                + "\n Wprowadź 7 aby dodać ebook"
                + "\n Wprowadź 8 aby dodać płytę"
                + "\n Wprowadź 9 aby dodać film"
                + "\n Wprowadź 10 aby wyjść");
                int odp2 = wprowadzenie.nextInt();
                if (odp2 == 5){
                    Ksiazka.dodajKsiazke();
                }
                else if (odp2 == 6){
                    Audiobook.dodajAudiobook();
                }
                else if (odp2 == 7){
                    Ebook.dodajEbook();
                }
                else if (odp2 == 8){
                    Plyta.dodajPlyte();
                }
                else if (odp2 == 9){
                    Film.dodajFilm();
                }
                else if (odp2 == 10){
                    break;
                }
                else{
                    System.out.println("Błędny wybór");
                }}
            else if (odp == 1) {
            System.out.println(zasoby.toString());
            break;
        }
            else if (odp == 2) {
            Klient.dodajKlienta();
            }
            else if (odp == 4) {
            System.out.println(klientlist.toString());
        }
            else if (odp == 10){
            break;
        }
            else{
            System.out.println("Błędny wybór");
        }
    }
    System.exit(0);
}
}
