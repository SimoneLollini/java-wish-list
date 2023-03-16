package org.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
//2. Creare una classe ChristmasLetter che contiene il nome e l’indirizzo del mittente e la lista dei desideri (List<String>).
//Aggiungere opportuni costruttori e metodi getter e setter.
//Aggiungere un metodo send(), che prova ad inviare la lettera a Babbo Natale:
//se tutto va bene il metodo stampa a video la lettera, il nome e l’indirizzo
//se la lista dei desideri supera i 5 elementi, il metodo deve sollevare un’eccezione
//calcolare in modo random un booleano che rappresenta se il mittente è stato buono oppure no: se il booleano è false il metodo si chiude sollevando un’eccezione.
//3. Nella classe Main creare un’istanza di ChristmasLetter passando la lista di desideri creata al punto 1 e le altre informazioni necessarie. Provare ad inviare la lettera e gestire eventuali eccezioni.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> wishList = new ArrayList<>();

        boolean end = false;

        while(!end){
            if (!wishList.isEmpty())
                System.out.println("Per ora hai espresso: " + wishList.size() + (wishList.size() == 1? " desiderio" : " desideri"));

            System.out.print("Esprimi un desiderio oppure premi \"q\" per uscire: ");
            String wish = scan.nextLine();

            if (wish.equalsIgnoreCase("q")) {
                end = true;
                System.out.println("Ecco qua la tua lista di desideri: ");
                Collections.sort(wishList); // ordino la lista
                for(int i = 0; i < wishList.size(); i++) {
                    System.out.println(i + ". " + wishList.get(i));
                }

            } else {
                    wishList.add(wish);
            }

        }

    }
}
