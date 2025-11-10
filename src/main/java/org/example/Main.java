package org.example;

import org.example.DAO.AnimalDAOImpl;
import org.example.entities.Animal;

public class Main {
    public static void main(String[] args) {

        // Creamos una instancia del DAO
        AnimalDAOImpl animalDAO = new AnimalDAOImpl();

        // Creamos algunos animales de ejemplo
        Animal perro1 = new Animal("Luna", "Perro", 3, "Encontrada en la calle, muy asustada.", "recién abandonado");
        Animal gato1 = new Animal("Misu", "Gato", 2, "Abandonado junto con sus crías.", "tiempo en refugio");
        Animal conejo1 = new Animal("Pelusín", "Conejo", 1, "Dueño se mudó y no se lo podía llevar.", "próximamente en acogida");

        // Los registramos en la base de datos
        System.out.println("Registrando animales...");
        animalDAO.create(perro1);
        animalDAO.create(gato1);
        animalDAO.create(conejo1);

        System.out.println("Animales registrados correctamente.");
    }
}