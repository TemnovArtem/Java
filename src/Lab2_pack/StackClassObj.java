package Lab2_pack;

public class StackClassObj {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    static public  int capacity = 0;
    static java.util.Stack<Integer> stack = new java.util.Stack<>();


    public StackClassObj(int capacity) {
        this.capacity = capacity;

    }
    public  void push(int value){
        if(stack.size() < capacity){
            stack.push(value);

        } else if ( capacity < 0 ) {
            System.out.println(ANSI_RED + "Stack cant have negative capacity" + ANSI_RESET);

        } else if( capacity == 0){
            System.out.println(ANSI_RED + "Stack has zero capacity" + ANSI_RESET);

        }
         else{
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





}
