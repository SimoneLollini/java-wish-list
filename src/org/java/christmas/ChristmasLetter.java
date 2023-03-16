package org.java.christmas;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {

    private String name;
    private String address;
    private List<String> wishList;

    public ChristmasLetter(String name, String address, List<String> wishList) {
        this.name = name;
        this.address = address;
        this.wishList = wishList;
    }

    public String send() throws Exception {


        if (wishList.size() > 5){
           throw new IllegalArgumentException("Non puoi esprimere più di 5 desideri");
        }

        Random random = new Random();

        if(random.nextBoolean()){
            throw new Exception("Sei stato cattivo!");
        }

         return "La tua lista di desideri: " +
                 "\n" +
                 getWishList().toString() +
                 "\n" +
                 "mittente: " + getName() +
                 "\n" +
                 "indirizzo: "+ getAddress();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getWishList() {
        return wishList;
    }
}
