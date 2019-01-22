package com.company;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
        int ans = Integer.parseInt( JOptionPane.showInputDialog(null,
                "Wie fiele elemente",
                JOptionPane.INFORMATION_MESSAGE));

        int arr[] = new int[ans];

        for(int i = 0; i < ans; i++){
            arr[i] =  ThreadLocalRandom.current().nextInt(0, 1000);
        }

        for(int i = 0; i < ans / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[ans - i - 1];
            arr[ans - i - 1] = temp;
        }

        for(int i = 0; i < ans; i++){
            System.out.println(arr[i]);
        }
    }
}
