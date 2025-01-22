package org.example;

public class Moto extends Vehicule {
    private int laCylindree;

    public Moto(String marque, String modele, String couleur, int cylindree) {
        super(marque, modele, couleur);
        laCylindree = cylindree;
    }

    @Override
    public void afficherDetails() {
        System.out.println("---------------");
        System.out.println(laMarque);
        System.out.println(leModele);
        System.out.println(laCouleur);
        System.out.println(laCylindree);
        System.out.println("---------------");
    }
}
