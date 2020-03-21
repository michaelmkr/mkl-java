package com.company.OOP_Test;

//extends -> erweitert die Klasse Säugetier -> erbt alle Eigenschaften von Säugetier
public class Mensch extends Saeugetier{

    private String language;

    public Mensch(){
        super(0,0);
        this.language = "Mandarin";
    }


    @Override
    public String toString() {
        return super.toString() + " | Language: " + language;
    }

}
