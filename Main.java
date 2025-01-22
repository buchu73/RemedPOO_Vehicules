package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Je veux avoir une application qui soit capable d'afficher les caractéristiques d'une liste de véhicule
        Pour le moment cette liste de véhicule contiendra:
            - des voitures (Marque, modèle, couleur, puissance(en cv));
            - des motos (Marque, modèle, couleur, cylindrée (en cm³)
        à l'exécution du programme, on veut afficher les détails de chaque véhicule défini dans la liste
                 */

        Vehicules mesVehicules = new Vehicules();
        mesVehicules.display();
    }
}