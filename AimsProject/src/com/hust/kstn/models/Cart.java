package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsInCart[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added sucessfully");
    }
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        if (qtyOrdered + 2 > MAX_NUMBER_ORDERED) {
            System.out.println("The cart does not have enough space for two discs");
            return;
        }
        itemsInCart[qtyOrdered] =  disc1;
        qtyOrdered++;
        itemsInCart[qtyOrdered] =  disc2;
        qtyOrdered++;
        System.out.println("Both discs have been added sucessfully");
    }
    public void addDVD(DigitalVideoDisc ...discList){
        if (qtyOrdered + discList.length > MAX_NUMBER_ORDERED) {
            System.out.println("The cart does not have enough space for all discs");
            return;
        }
        for (DigitalVideoDisc disc : discList) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
        }
        System.out.println("All discs have been added sucessfully");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null; 
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed sucessfully");
                break;
            }
        }

        if (!found) {
            System.out.println("The disc does not exist");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (DigitalVideoDisc item : itemsInCart) {
            if (item != null)
                totalCost += item.getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");
        for (DigitalVideoDisc item : itemsInCart) {
            if (item != null)
                System.out.println("[Title]: " + item.getTitle() + ", [Cost]: " + item.getCost());
        }
    }
}
