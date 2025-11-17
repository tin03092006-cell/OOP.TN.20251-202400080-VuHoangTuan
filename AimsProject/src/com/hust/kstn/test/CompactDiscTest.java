package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        
        CompactDisc cd = new CompactDisc(1, "AloAlo", "Pop", 11.5f, "Le Van Dat");

        Track track1 = new Track("Alo", 180);
        Track track2 = new Track("Ola", 200);
        Track track3 = new Track("Nhac tre", 210);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        System.out.println("--- Thong tin CD ---");
        System.out.println(cd.toString());

        System.out.println("\n--- Play Demo ---");
        cd.play(); 
    }
}
