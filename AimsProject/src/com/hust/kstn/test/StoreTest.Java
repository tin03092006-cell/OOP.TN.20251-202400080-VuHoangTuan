package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", 24.95f, 87, "George Lucas");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.removeDVD(dvd1);
}
}