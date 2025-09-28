package Lab2_pack;
import Main_pack.Main;
import java.util.Scanner;
import java.util.Stack;
//2. Спроектувати клас який забезпечить роботу стека для збереження цілих чисел по принципу LIFO.
//Клас повинен містити:
//засіб для встановлення розміру стеку
//метод push для додавання елемента в стек
//метод рор для отримання елемента зі стеку, згідно алгоритму

public class Lab2 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    static private  int capacity = 0;
    static Stack<Integer> stack = new Stack<>();

    public   Lab2(int capacity){
        Lab2.capacity =capacity;


    }

    public  void push(int value){
        if(stack.size() < capacity){
            stack.push(value);

        } else if ( capacity < 0 ) {
            System.out.println(ANSI_RED + "Stack cant have negative capacity" + ANSI_RESET);

        } else if( capacity == 0){
            System.out.println(ANSI_RED + "Stack has zero capacity" + ANSI_RESET);

        } else {
            System.out.println(ANSI_RED + "Stack is full, stack size is " + capacity + ANSI_RESET);
        }

    }
    public int pop(){
        if (!stack.isEmpty()) {
            int data_pop = stack.pop();
            System.out.println(ANSI_GREEN + "Popped: " + data_pop + ANSI_RESET);
            return data_pop;
        } else {
            System.out.println(ANSI_RED + "Stack is empty" + ANSI_RESET);
            return -1;

        }


    }
    public void changeCapacity(int capacityvalueFunk){

        capacity=capacityvalueFunk;
        System.out.println(ANSI_GREEN + "Capacity changed to: " + capacity + ANSI_RESET);
    }
    public void  display(){
        System.out.println(ANSI_GREEN + "Stack content: " + stack + ANSI_RESET);
    }

    public  void interfaceLab2(){
//        System.out.println("");
        System.out.println("\nChoose option");
        System.out.println("Now Capacity is:" + capacity);
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
                push(data_value);
                interfaceLab2();
                break;
            case 2:
                pop();
                interfaceLab2();
                break;
            case 3:
                int capasity_value = sc.nextInt();
                changeCapacity(capasity_value);
                interfaceLab2();
                break;
            case 4:
                display();
                interfaceLab2();
                break;
            case 5:
                Main.choice();

            default: System.out.println("Invalid choice");
        }

    }

}


