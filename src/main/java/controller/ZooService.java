/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.ZooDatabaseManager;
import database.ZooDatabaseManager;
import model.Animal;
import java.util.List;
import model.Enclos;


/**
 *
 * @author 2417133
 */

public class ZooService {
    private ZooDatabaseManager dbManager = ZooDatabaseManager.getInstance();

    public void ajouterAnimal(int id,String nom, String espece, int age, String regimeAlimentaire) {
        dbManager.ajouterAnimal(new Animal(id, nom, espece, age, regimeAlimentaire));
    }

    public List<Animal> listerAnimaux() {
        return dbManager.listerAnimaux();
    }
    
    public List<Enclos> listerEnclos() {
        return dbManager.listerEnclos();
    }
    public void mettreAJourAnimal(int id, String nom, String espece, int age, String regimeAlimentaire) {
        dbManager.mettreAJourAnimal(new Animal(id, nom, espece, age, regimeAlimentaire));
    }


    public void supprimerAnimal(int id) {
        dbManager.supprimerAnimal(id);
    }
}
