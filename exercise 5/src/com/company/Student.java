package com.company;

public class Student {
    public String Name;
    public String Matrikelnummer;
    public String Jahrgang;

    public Student(String name, String matrikelnummer, String jahrgang){
        this.Name = name;
        this.Matrikelnummer = matrikelnummer;
        this.Jahrgang = jahrgang;
    }

    public String toString(){
        return "Name:\t" + this.Name
                +" Matrikelnummer:\t" + this.Matrikelnummer
                +" Jahrgang:\t" + this.Jahrgang;
    }
}
