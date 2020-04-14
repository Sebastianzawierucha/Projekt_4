# Projekt_4
Zadanie 3:
W zadaniu 3 wykorzystałem dwie metody tworzące i wyświetlające tablice z poprzednich zajęć: tworzenieTablicy(); oraz wyswietl();
Program opiera się na prostej pętli, na początku której tworzona i wyświetlana (w celu skontrolowania czy to na pewno jest ta liczba) 
jest tablica złożona z 50 losowych liczb z zakresuod 0 do 50. 
Następnie, program prosi użytkownika o numer elementu, który ma wyświetlić. 
Jeżeli liczba jest z zakresu 1 - 50, wszystko jest w porządku, program wyświetla dany element i wraca do początku.
Jeżeli liczba jest z zakresu <=0, program wyłapuje wyjątek ArrayIndexOutOfBoundsException i wyświetla odpowiedni komunikat.
Jeżeli wprowadzony zostaje ciąg znaków, program wyłapuje wyjątek InputMismatchException i wyświetla odpowiedni komunikat.
Do zaimplementowania: kolorowanie tekstu w celu większej czytelności, tworzenie tablic o dowolnej wielkości, ustalonej przez użytkownika
