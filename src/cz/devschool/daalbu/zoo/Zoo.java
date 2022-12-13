package cz.devschool.daalbu.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        boolean running = true;
        while(running == true){
            menu();
            int action = scanner.nextInt();
            switch (action){ // UDĚLAT ENUM PRO BONUS
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    running = false;
                    break;
                }
            }
        }


    }

    public static void menu(){
        System.out.println("1 - přidat zvíře");
        System.out.println("2 - výpis zvířete");
        System.out.println("3 - smazání zvířete");
        System.out.println("4 - ukončit program");
    }
}
