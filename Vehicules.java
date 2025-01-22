package org.example;

public class Vehicules {
    Vehicule[] mesVehicules;

    public Vehicules(){
        mesVehicules = new Vehicule[2];
        mesVehicules[0] = new Voiture("Peugeot", "206", "Gris", 80);
        mesVehicules[1] = new Moto("Honda", "CBR", "Rouge", 1000);
    }

    public void display() {
        for (int i = 0; i != mesVehicules.length; i++){
            mesVehicules[i].afficherDetails();
        }
    }
}
