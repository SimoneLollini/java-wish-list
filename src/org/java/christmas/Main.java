package org.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
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

                System.out.println("Inserire mittente: ");
                String name = scan.nextLine();

                System.out.println("Inserire indirizzo mittente: ");
                String address = scan.nextLine();

                ChristmasLetter letter = new ChristmasLetter(name,address,wishList);

                try{
                    System.out.println(letter.send());
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            } else {
                    wishList.add(wish);
            }

        }

    }
}
