package org.example;

public abstract class Vehicule {
    protected String laMarque;
    protected String leModele;
    protected String laCouleur;

    protected Vehicule(String marque, String modele, String couleur){
        laMarque = marque;
        leModele = modele;
        laCouleur = couleur;
    }

    public abstract void afficherDetails();
}
