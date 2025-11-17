package com.hust.kstn.test; 

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        cart.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        cart.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","Ron Clements",120, 18.99);
        cart.addDVD(dvd3);
        cart.print();
    }
}