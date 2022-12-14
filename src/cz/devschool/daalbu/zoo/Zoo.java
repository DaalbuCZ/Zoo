package cz.devschool.daalbu.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    public static List<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {

        boolean running = true;
        Scanner scanner = new Scanner(System.in);
            menu();
            int action = scanner.nextInt();
            switch (action){
                case 1:{
                    newAnimal();
                    break;
                }
                case 2:{
                    lookupAnimal();
                    break;
                }
                case 3:{
                    deleteAnimal();
                    break;
                }
                case 4:{
                    running = false;
                    break;
                }
                default:{
                    System.out.println("Tato volba není na výběr!");
                }
            }



    }

    public static void menu(){
        System.out.println("1 - přidat zvíře");
        System.out.println("2 - výpis zvířete");
        System.out.println("3 - smazání zvířete");
        System.out.println("4 - ukončit program");
    }

    public static void  newAnimal(){
        Scanner scanner = new Scanner(System.in);
        boolean input = true;

        while(input){
            System.out.println("Vyber typ zvířete (Kočka, Pes, Slon):");
            String animal = scanner.nextLine();
            switch (animal) {
                case "Kočka", "kocka", "kočka": {
                    System.out.println("kocka");

                    input = false;
                    break;
                }
                case "Pes", "pes": {
                    System.out.println("pes");

                    input = false;
                    break;
                }
                case "Slon", "slon": {
                    System.out.println("slon");

                    input = false;
                    break;
                }
                default: {
                    System.out.println("Toto zvíře není na výběr!");
                    break;
                }
            }
        }
    }

    public static void lookupAnimal(){

    }
    public static void deleteAnimal(){

    }
}
