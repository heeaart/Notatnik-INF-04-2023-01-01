/*
***************************************
*   Klasa: Notatka
*   Opis: klasa prezentujaca notatke
*   Pola: liczba notatek - statyczne pole przechowujace liczbe utworzonych notatek
*           id - identyfikator notatki
*           tytul - tytul notatki (tekst)
*           tresc - tresc notatki (tekst)
*   Autor: Pan alek
***************************************
 */
public class Notatnik {
    private static int LiczbaNotatek = 0;
    private int id;
    protected String tytul;
    protected String tresc;

    public void jeden(){

    }

    public void wyswietl(){
        System.out.println(tytul + "\n" + tresc);
    }

    public void diagnozuj(){
        System.out.println(LiczbaNotatek+";"+id+";"+tytul+";"+tresc);
    }

    public Notatnik(String tytul, String tresc) {
        LiczbaNotatek++;
        id = LiczbaNotatek;
        this.tytul = tytul;
        this.tresc = tresc;
    }
}
