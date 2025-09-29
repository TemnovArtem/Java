package Lab2_pack;
import Main_pack.Main;
import java.util.Scanner;
//2. Спроектувати клас який забезпечить роботу стека для збереження цілих чисел по принципу LIFO.
//Клас повинен містити:
//засіб для встановлення розміру стеку
//метод push для додавання елемента в стек
//метод рор для отримання елемента зі стеку, згідно алгоритму

public class Lab2 {
    StackClassObj obj = new StackClassObj(0);
    public  void interfaceLab2(){
//        System.out.println("");
        System.out.println("\nChoose option");
        System.out.println("Now Capacity is:" + obj.capacity);
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
               obj.push(data_value);
                interfaceLab2();
                break;
            case 2:
               obj.pop();
                interfaceLab2();
                break;
            case 3:
                int capasity_value = sc.nextInt();
                obj.changeCapacity(capasity_value);
                interfaceLab2();
                break;
            case 4:
                obj.display();
                interfaceLab2();
                break;
            case 5:
                Main.choice();

            default: System.out.println("Invalid choice");
        }

    }

}


