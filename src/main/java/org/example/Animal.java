package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor to initialize name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean getIsDog() {
        return isDog;
    }

    // toString method to print Animal details
    @Override
    public String toString() {
        return getName() + " is a dog = " + getIsDog();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Loop to get user input
        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogString = scanner.nextLine();
            boolean isDog = isDogString.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        // Print all animals
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
