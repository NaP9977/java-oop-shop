package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       Prodotto prodotto = new Prodotto("radio", "suona della musica", 2.50, 0.22);
       System.out.println("il nome del prodotto è " + prodotto.getNome());
        System.out.println("La descrizione del prodotto è " + prodotto.getDescrizione());
        System.out.println("Il prezzo del prdotto è " + prodotto.getPrezzo());
        System.out.println("Il prezzo senza IVA è " + prodotto.getprezzoBase());
        System.out.println("Il prezzo compreso di IVA è "  + prodotto.getprezzoConIva());
        System.out.println("Il codice del prodotto è "  + prodotto.getCodice());
        System.out.println("Il nome completo del prodotto è "  + prodotto.getnomeCompleto());
                 prodotto.setDescrizione("strumento per ascoltare musica");
      System.out.println("Nuova descrizione: " + prodotto.getDescrizione());

      Prodotto prodotto2 = new Prodotto("telefono", "da usare per chiamare", 200, 0.22  );

        System.out.println("il nome del prodotto è " + prodotto2.getNome());
        System.out.println("La descrizione del prodotto è " + prodotto2.getDescrizione());
        System.out.println("Il prezzo del prdotto è " + prodotto2.getPrezzo());
        System.out.println("Il prezzo senza IVA è " + prodotto2.getprezzoBase());
        System.out.println("Il prezzo compreso di IVA è "  + prodotto2.getprezzoConIva());
        System.out.println("Il codice del prodotto è "  + prodotto2.getCodice());
        System.out.println("Il nome completo del prodotto è "  + prodotto2.getnomeCompleto());

    }

}
