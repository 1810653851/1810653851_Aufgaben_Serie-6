package com.company;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();

        arr.add(new Student("Robert", "1234", "2019/2020"));
        arr.add(new Student("Gerhard", "4321", "2018/2019"));
        arr.add(new Student("Stefan", "5555", "2017/2018"));

        for(int i = 0; i < 3; i++){
            System.out.println(arr.get(i));
        }
    }
}
