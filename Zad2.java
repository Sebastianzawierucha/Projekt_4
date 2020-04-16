import java.util.Scanner;

public class Zad2 {
    public static boolean uruchomienie = true;
    public static Scanner wprowadzenie = new Scanner(System.in);

    public static void main(String[] args) {
        while (uruchomienie) {
            System.out.println("\n Podaj liczbę, którą chcesz przekonwertować na zmienną typu int\n");

getInt();

        }

    }
    public static void getInt(){
        int changed;
        try{
            String wybor = wprowadzenie.next();
            changed = Integer.parseInt(wybor);
            System.out.println("\n Oto przekonwertowana liczba:" + changed + "\n");

        }
        catch (NumberFormatException ekscepczyn){
            System.out.println("\n Wprowadzono liczbę w złym formacie\n");
        }



    }
}