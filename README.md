# Projekt_4
Zadanie 3:
W zadaniu 3 wykorzystałem dwie metody tworzące i wyświetlające tablice z poprzednich zajęć: tworzenieTablicy(); oraz wyswietl();
Program opiera się na prostej pętli, na początku której tworzona i wyświetlana (w celu skontrolowania czy to na pewno jest ta liczba) 
jest tablica złożona z 50 losowych liczb z zakresuod 0 do 50. 
Następnie, program prosi użytkownika o numer elementu, który ma wyświetlić. 
Jeżeli liczba jest z zakresu 1 - 50, wszystko jest w porządku, program wyświetla dany element i wraca do początku.
Jeżeli liczba jest z zakresu <=0 lub >50 program wyłapuje wyjątek ArrayIndexOutOfBoundsException i wyświetla odpowiedni komunikat.
Jeżeli wprowadzony zostaje ciąg znaków, program wyłapuje wyjątek InputMismatchException i wyświetla odpowiedni komunikat.
Do zaimplementowania: kolorowanie tekstu w celu większej czytelności, tworzenie tablic o dowolnej wielkości, ustalonej przez użytkownika

Zadanie 2:
Zaprojektowano prosty program, który konewertuje podaną liczbę, zapisaną jako zmienna String, na zmienną typu Integer, z wykorzystaniem metody Integer.parseInt(). Metoda może nie tylko zwracać typ Int, ale także Long albo Double.
Dodano obsługę wyjątku NumberFormatException, który występuje, kiedy: wprowadzona zmienna String jest pusta, wprowadzona zmienna nie może być przekonwertowana do typu int.

Zadanie 4:
Została przekonstruowana wypożyczalnia z repozytorium Projekt-2_poprawiony. W wypożyczalni obsługa klientów, poprzednio realizowana m.in. przez dziedziczenie została zastąpiona w całości przez idee kompozycji. W porównaniu do poprzedniej realizacji, klasa Klient nie dziedziczy po klasie nadrzędnej Klientbase, tylko tworzy w klasie Klient instancje klasy Klientbase. Razem ze zmiennymi klasy Klientbase klasa Klient otrzymuje również metody odpowiadające klasie Klientbase. W klasie Klient, porównując z poprzednią wersją wypożyczalni, musiały się pojawić dodatkowo deklaracje zmiennych otrzymywanych z klasy Klientbase oraz metody z niej wynikające.
Poza skomplikowaniem projektu, tym, że nie działa poprawnie dodawanie klienta do listy klientów oraz zmniejszeniem czytelności kodu nie zmieniło to nic. Rozumiem idee kompozycji, wiem do czego to służy ale w tym przypadku jest to zbędne, ponieważ:
1) program jest zbyt prosty
2) program jest tworzony na potrzeby nauki programowania a nie faktyczne tworzenie funkcjonalnej wypożyczalni
3) program nie będzie w przyszłości rozwijany
są to główne powody, przez które taka zmiana jest bezsensowna. Gdyby projekt wypożyczalni byłby w przyszłości rozbudowywany zmiana nawet całego kodu z idei dziedziczenia na idee kompozycji byłaby zasadna, bezpieczniejsza i prostsza w obsłudze. 
