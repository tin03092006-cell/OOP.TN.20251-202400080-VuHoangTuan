package com.hust.kstn.Garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {

        String filename = "C:/Users/ADMIN/OOP.TN.20251-202400080-VuHoangTuan/OtherProject/src/com/hust/kstn/Garbage/test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        StringBuilder sb = new StringBuilder();
        for (byte b : inputBytes) {
            sb.append((char)b);
        }
        outputString = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}