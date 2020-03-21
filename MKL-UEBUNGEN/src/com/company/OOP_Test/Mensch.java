package com.company.OOP_Test;

/**
 * @author MichaelMkr
 * created on 21.03.2020
 * package: com.company.OOP_Test
 */

// VERERBUNG
// extends -> erweitert die Klasse Säugetier -> erbt alle Eigenschaften von Säugetier
public class Mensch extends Saeugetier {

    private String language;

    public Mensch() {
        super(0, 0);
        this.language = "Mandarin";
    }

    public Mensch(String language) {
        this.setLanguage(language);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // POLYMORPHIE
    // Selbe Methode wie in Säugetier, macht aber etwas anderes!
    @Override
    public void setAge(int age){
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString() + " | Language: " + language;
    }

}
