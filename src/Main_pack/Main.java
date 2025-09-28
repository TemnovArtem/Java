package Main_pack;

import Lab1_pack.Lab1;
import Lab2_pack.Lab2;
import Lab3_pack.Lab3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        choice();

    }

    public static void Interface() {
        System.out.println("1. Lab1");
        System.out.println("2. Lab2");
        System.out.println("3. Lab3");
        System.out.println("4. Exit");
    }
    public static void choice() {
        Lab2 objLab2 = new Lab2(0);
        Lab1 objLab1 = new Lab1(0, 0);
        Lab3 objLab3 = new Lab3();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose Lab");
            Interface();
            int number_switch = input.nextInt();

            switch(number_switch) {
                case 1 -> objLab1.interfaceLab1();
                case 2 -> objLab2.interfaceLab2();
                case 3 -> objLab3.interfaceLab3();
                case 4 -> {
                    System.out.println("YEAAAAAAA, PROGRAMMER FINISH WORK");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }

    }
}