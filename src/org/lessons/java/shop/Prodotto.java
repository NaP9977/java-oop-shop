//Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
//- codice (numero intero)
//- nome
//- descrizione
//- prezzo
//- iva
//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//Il codice prodotto sia accessibile solo in lettura
//Gli altri attributi siano accessibili sia in lettura che in scrittura
//Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
//Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
//Nello stesso package aggiungete una classe Main con metodo main nella quale create uno o più prodotti e testate tutte le funzionalità della classe (cioè tutti i metodi public)
//:aeroplano: BONUS 1:  Aggiungere una classe Categoria (con nome e descrizione) e associare ad ogni Prodotto una categoria usando la composizione
//:razzo: BONUS 2: Permettere di associare più di una Categoria ad ogni prodotto (usare quindi una ArrayList di categorie come tipo di attributo)


package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.prezzo = prezzo;
        this.codice = generaCodiceRandom();
        this.descrizione = descrizione;
        this.nome = nome;
        this.iva = iva;
    }


    public int getCodice() {
        return codice;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    double getprezzoBase(){
        return prezzo;
    }
    public double getprezzoConIva (){
        return prezzo + (prezzo * iva);
    }

String getnomeCompleto(){
        String codiceStr = String.valueOf(codice);
        if(codiceStr.length() < 8){
            return  String.format("%08d", codice) + "-" + nome;
        } else {
            return codice + "-" + nome;
        }
}

    private int generaCodiceRandom() {
        Random random = new Random();
        return random.nextInt(100000000);
    }



}






