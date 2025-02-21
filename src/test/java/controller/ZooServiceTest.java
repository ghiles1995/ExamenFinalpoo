/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import model.Animal;
import static org.junit.jupiter.api.Assertions.*;

public class ZooServiceTest {
    private ZooService zooService;

    @BeforeEach
    void setUp() {
        zooService = new ZooService(); // Initialisation du service
    }

    @Test
    void testAjouterAnimal() {
        // Ajouter un animal de test
        zooService.ajouterAnimal(9, "max", "chien", 2, "croq");

        // Vérifier que l'animal a bien été ajouté
        List<Animal> animaux = zooService.listerAnimaux();
        assertFalse(animaux.isEmpty(), "La liste des animaux ne devrait pas être vide.");
        assertEquals("max", animaux.get(animaux.size() - 1).getNom(), "Le dernier animal ajouté devrait être un Lion.");
    }

    @Test
    void testModifierAnimal() {
        // Ajouter un animal de test pour s'assurer qu'on peut le modifier
        zooService.ajouterAnimal(5, "maxim", "chien", 6, "6");

        // Modifier l'animal
        zooService.mettreAJourAnimal(2, "Tigre Blanc", "Mammifère", 8, "Carnivore");

        // Vérifier que les nouvelles informations sont bien mises à jour
        List<Animal> animaux = zooService.listerAnimaux();
        Animal animalModifie = animaux.stream().filter(animal -> animal.getId() == 5).findFirst().orElse(null);
        
        assertNotNull(animalModifie, "L'animal modifié devrait exister.");
        assertEquals("Tigre Blanc", animalModifie.getNom(), "Le nom de l'animal devrait être 'Tigre Blanc'.");
        assertEquals(8, animalModifie.getAge(), "L'âge de l'animal devrait être 8.");
    }
}
