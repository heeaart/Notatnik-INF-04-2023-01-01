public class Main {
    public static void main(String[] args) {
        String tytul1 = "Zrob kartkowke";
        String tresc1 = "Pamietaj zrobic kartkowke 1gr 3tp";
        String tytul2 = "nie sluchac maniaka";
        String tresc2 = "Pamietaj nie sluchac mnie i maniaka";

        Notatnik notatka1 = new Notatnik(tytul1, tresc1);
        Notatnik notatka2 = new Notatnik(tytul2, tresc2);

        notatka1.wyswietl();
        notatka2.wyswietl();
        notatka1.diagnozuj();
        notatka2.diagnozuj();
    }
}