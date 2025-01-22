package org.example;

public class Voiture extends Vehicule{
    private int laPuissance;

    public Voiture(String marque, String modele, String couleur, int puissance){
        super(marque, modele, couleur);
        laPuissance = puissance;
    }

    @Override
    public void afficherDetails() {
        System.out.println("---------------");
        System.out.println(laMarque);
        System.out.println(leModele);
        System.out.println(laCouleur);
        System.out.println(laPuissance);
        System.out.println("---------------");
    }
}
