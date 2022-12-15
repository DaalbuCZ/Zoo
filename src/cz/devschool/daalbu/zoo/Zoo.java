package cz.devschool.daalbu.zoo;

import java.util.HashMap;
import java.util.Scanner;

public class Zoo {

    public static HashMap<String, Animal> animals = new HashMap<>();
    public static void main(String[] args) {

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running == true) {
            menu();
            String action = scanner.nextLine();
            switch (action) {
                case "1": {
                    newAnimal();
                    break;
                }
                case "2": {
                    lookupAnimal();
                    break;
                }
                case "3": {
                    deleteAnimal();
                    break;
                }
                case "4": {
                    running = false;
                    break;
                }
                default: {
                    System.out.println("-------------------------");
                    System.out.println("Tato volba není na výběr!");
                }
            }
        }
    }

    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("1 - Přidat zvíře");
        System.out.println("2 - Výpis zvířete");
        System.out.println("3 - Smazání zvířete");
        System.out.println("4 - Ukončit program");
        System.out.println("-------------------------");
    }

    public static void  newAnimal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vyber typ zvířete (Kočka, Pes, Slon):");
        String animal = scanner.nextLine();
        System.out.println("Napiš jméno zvířete:");
        String name = scanner.nextLine();
        System.out.println("Napiš věk zvířete:");
        int age = scanner.nextInt();
        System.out.println("Napiš váhu zvířete");
        double weight = scanner.nextDouble();

        switch (animal.toLowerCase()) {
            case "kocka", "kočka": {
                System.out.println("Spí kočka (true/false):");
                boolean isSleeping = scanner.nextBoolean();

                Cat cat = new Cat(name, age, weight,isSleeping);
                animals.put(name.toLowerCase(), cat);

                break;
            }
            case "pes": {
                System.out.println("Je pes v lovecké náladě(true/false):");
                boolean isHuntingMood = scanner.nextBoolean();

                Dog dog = new Dog(name, age, weight,isHuntingMood);
                animals.put(name.toLowerCase(), dog);

                break;
            }
            case "slon": {
                Elephant elephant = new Elephant(name, age, weight);
                animals.put(name.toLowerCase(), elephant);

                break;
            }
            default:{
                System.out.println("Toto zvíře neznám! Zkus jiné zvíře.");
                return;
            }
        }
        System.out.println("Zvíře bylo úspěšně přidáno!");
    }

    public static void lookupAnimal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napiš jméno zvířete:");
        String name = scanner.nextLine();
        try {
            Animal animal = animals.get(name.toLowerCase());
            System.out.println("-------------------------");

            System.out.println("Jméno: " + animal.getName());
            System.out.println("Věk: " + animal.getAge());
            System.out.println("Váha: " + animal.getWeight());
            if(animal instanceof Cat){
                System.out.println("Spí: " + ((Cat) animal).isSleeping());
            } else if (animal instanceof Dog) {
                System.out.println("Je v lovecké náladě: " + ((Dog) animal).isHuntingMood());
            }
            System.out.print("Zvuk: ");
            animal.makeSound();
        } catch (java.lang.NullPointerException e){
            System.out.println("Toto zvíře není v databázi");
        }

    }
    public static void deleteAnimal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napiš jméno zvířete, které má být smazáno:");
        String name = scanner.nextLine();

            animals.remove(name.toLowerCase());
            System.out.println("Úspěšně jste vymazali " + name + "!");

    }
}
