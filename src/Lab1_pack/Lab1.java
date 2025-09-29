package Lab1_pack;
import Main_pack.Main;
import java.util.Scanner;
// Завдання 4:
// Оголосити двовимірний масив розмірністю X1 на X2
// та ініціалізувати його числами Фібоначчі.
// Вивести всі елементи масиву.
// X1 та X2 задаються користувачем.

public class Lab1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private int X1;
    private int X2;
    private int[][] array;


    public Lab1(int height, int width) {
        this.X1 = height;
        this.X2 = width;
        this.array = new int[X1][X2];
    }



    //    Φ = ( 1 + √5 )/2 = 1.6180339887... - Ф formula
    //    Sn = Φⁿ–(– Φ⁻ⁿ)/√5 - main formula
    public  int newFibonacci(int n) {
        double square = Math.sqrt(5); //√5
        double phi = (1 + square)/2;  // Φ
        int BinetsFib = (int) ((Math.pow(phi, n) - Math.pow(-phi, -n))/square); //final formul
        return BinetsFib;
    }


    public void display() {
        System.out.println(ANSI_GREEN + "Array content:" + ANSI_RESET);
        fillMatrix();
        for (int i = 0; i < X1; i++) {
            for (int j = 0; j < X2; j++) {
                System.out.print(ANSI_GREEN + array[i][j] + " " + ANSI_RESET);
            }
            System.out.println();
        }
    }
    //4X4
//            (i,j)    i*4 + j + 1
//            (0,0) -> 0*4 + 0 + 1 =  1
//            (0,1) -> 0*4 + 1 + 1 =  2
//            (0,2) -> 0*4 + 2 + 1 =  3
//            (0,3) -> 0*4 + 3 + 1 =  4
//
//            (1,0) -> 1*4 + 0 + 1 =  5
//            (1,1) -> 1*4 + 1 + 1 =  6
//            ...
//            (2,3) -> 2*4 + 3 + 1 = 12
//            (3,0) -> 3*4 + 0 + 1 = 13
//            ...
//            (3,3) -> 3*4 + 3 + 1 = 16



    public void fillMatrix(){


        for(int i=0; i<X1; i++){
            for(int j=0; j<X2; j++){

                array[i][j]=newFibonacci(i*X2+j+1);
            }
        }


    }


    public void interfaceLab1() {
        System.out.println("\nChoose option");
        System.out.println("1. Enter Params");
        System.out.println("2. Display");
        System.out.println("3. Return");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        choiceLab1(choice);
    }


    public void choiceLab1(int choice) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1 -> {
                System.out.print("Height: ");
                X1 = sc.nextInt();
                System.out.print("Width: ");
                X2 = sc.nextInt();


                if (X1 < 0) {
                    System.out.println("Your param is less than 0, rewrite params");
                    System.out.print("Height: ");
                    X1 = sc.nextInt();

                } else if ( X2 < 0) {
                    System.out.println("Your param is less than 0, rewrite params");
                    System.out.print("Width: ");
                    X2 = sc.nextInt();

                }


                array = new int[X1][X2];
                interfaceLab1();
            }


            case 2 -> {


                display();
                interfaceLab1();
            }

            case 3 -> Main.choice();


            default -> System.out.println(ANSI_RED + "Invalid choice" + ANSI_RESET);
        }
    }
}
