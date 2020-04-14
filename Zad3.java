package zadanie_3;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Zad3 {
    public static boolean uruchomienie = true;
    public static int[] tablica = new int[50];
    public static void main(String[] args) {

        tworzenieTablicy();
        wyswietl();
        System.out.println("\n Utworzono tablice 50-elementowa");
        while(uruchomienie){
            Scanner wprowadzenie = new Scanner(System.in);
            System.out.println("\n Podaj numer elementu ktory chcesz wyswietlic: \n");
        try {
            int wybor = wprowadzenie.nextInt();
            System.out.println("Wybrany element to: " + tablica[wybor - 1] + "\n");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wprowadzono zla dana\n");
        }
        catch (InputMismatchException ex){
           System.out.println("To musi byc cyfra, nie literki");

        }


    }
    }
    public static void tworzenieTablicy() {
        Random random = new Random();
        for (int t = 0; t < 50; t++) {
            tablica[t] = random.nextInt(50);
        }
    }
    public static void wyswietl(){
        for (int w = 0; w < 50 ; w++){
            int x = tablica[w];
            System.out.print(x + ", ");
        }
    }
}
