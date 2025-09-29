package Lab3_pack;

import java.util.Stack;

public class Stack2ClassObj {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    static Stack<Integer> stack_Lab3 = new Stack<>();
    static int capacity_lab3  ;

    public  Stack2ClassObj(int capacity_lab3){
        this.capacity_lab3 = capacity_lab3;
    }
    public void pushStack(int valueDeque){
        if(stack_Lab3.size() < capacity_lab3){
            stack_Lab3.push(valueDeque);

        } else if ( capacity_lab3 < 0 ) {
            System.out.println("Stack cant have negative capacity");

        } else if( capacity_lab3 == 0){
            System.out.println("Stack  have zero capacity");

        } else {
            System.out.println("Stack is full, stack size is ");
        }



    }

    public int popStack(){
        if (!stack_Lab3.isEmpty()) {
            int data_pop = stack_Lab3.pop();
            System.out.println("Popped: " + data_pop);
            return data_pop;
        } else {
            System.out.println("Stack is empty");
            return -1;

        }




    }

    public void changeCapacityStack(int capasyty_value_funk){

        capacity_lab3=capasyty_value_funk;

    }
    public static void DisplayStack() {

        System.out.println(stack_Lab3);

    }



}
