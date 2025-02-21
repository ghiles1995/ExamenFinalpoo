/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package database;

import model.Animal;
import java.util.List;
import model.Enclos;

/**
 *
 * @author 2417133
 */
public interface IZooDataAccess {
    void ajouterAnimal(Animal animal);
    List<Animal> listerAnimaux();
    void mettreAJourAnimal(Animal animal);
    void supprimerAnimal(int id);
    
    List<Enclos> listerEnclos();
    
    
}
