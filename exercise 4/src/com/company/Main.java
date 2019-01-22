package com.company;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Freund> arr = new ArrayList<Freund>();

        for(int i= 0; i<5; i++){
            String name = JOptionPane.showInputDialog(null,
                    "Freund Namen Eingeben",
                    JOptionPane.INFORMATION_MESSAGE);

            arr.add(new Freund(name));
        }

        for(int i = 0; i < 5; i++){
            System.out.println(arr.get(i));
        }
    }
}
