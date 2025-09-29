package Lab3_pack;
import Main_pack.Main;
import java.util.Scanner;
import java.util.Stack;

//2.
//Створити програму яка забезпечить роботу зі стеком що праце по принципу LIFO.
//Спроектувати клас який забезпечить роботу стека для збереження цілих чисел по принципу LIFO.
//Клас повинен містити:
//засіб для встановлення розміру стеку
//метод push для додавання елемента в стек
//метод рор для отримання елемента зі стеку, згідно алгоритму
//Програма повинна вести діалог з користувачем
public class Lab3 {
    Stack2ClassObj obj2 = new Stack2ClassObj(0);

    public  void interfaceLab2(){

        System.out.println("\nChoose option");
        System.out.println("Now Capacity is:" + obj2.capacity_lab3);
        System.out.println("1. push object");
        System.out.println("2. pop object");
        System.out.println("3. change capacity");
        System.out.println("4. display");
        System.out.println("5. exit");

        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        choseCase(choice);
    }
    public  void choseCase(int choice){
        Scanner sc=new Scanner(System.in);
        switch (choice){

            case 1:
                System.out.println("enter data");
                int data_value=sc.nextInt();
               obj2.pushStack(data_value);
                interfaceLab2();
                break;
            case 2:
                obj2.popStack();
                interfaceLab2();
                break;
            case 3:
                int capasity_value = sc.nextInt();
                obj2.changeCapacityStack(capasity_value);
                interfaceLab2();
                break;
            case 4:
                obj2.DisplayStack();
                interfaceLab2();
                break;
            case 5:
                Main.choice();

            default: System.out.println(obj2.ANSI_RED + "Invalid choice" + obj2.ANSI_RESET);
        }

    }
    public  void interfaceLab3(){

        System.out.println("\nChoose option");
        System.out.println("Now Capacity is:" + obj2.capacity_lab3);
        System.out.println("1. push object");
        System.out.println("2. pop object");
        System.out.println("3. change capacity");
        System.out.println("4. display");
        System.out.println("5. exit");

        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        choseCase(choice);
    }

}
