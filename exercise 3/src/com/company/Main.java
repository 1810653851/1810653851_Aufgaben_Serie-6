package com.company;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] =  ThreadLocalRandom.current().nextInt(0, 1000);
        }

        while(true) {
            try{
                int noToChange = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Welche Zellennumer (<100)",
                        JOptionPane.INFORMATION_MESSAGE));

                System.out.println(arr[noToChange]);

                int newVal = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Neuen wert eingeben",
                        JOptionPane.INFORMATION_MESSAGE));

                arr[noToChange] = newVal;
            } catch (Exception ex){
                return;
            }
        }
    }
}
