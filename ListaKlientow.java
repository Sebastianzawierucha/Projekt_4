package pl.zawierucha.project2;

import java.util.ArrayList;

public class ListaKlientow {
    private static ArrayList<Klient> klientlist;
    public ListaKlientow(){
        klientlist = new ArrayList<Klient>();
    }
    public void dodajKlienta(Klient klient) {
        klientlist.add(klient);
    }




    public String toString(){
        String total = "\n";
        for (int i=0; i<klientlist.size(); i++){
            Klient k = klientlist.get(i);
            total = total + k.toString();
        }
        return total;
    }
}
