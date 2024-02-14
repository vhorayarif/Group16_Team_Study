package amrullah.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Y before swap = " + y);
        System.out.println("X before swap = " + x);

        System.out.println("---------------------------");
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Y after swap = " + y);
        System.out.println("X after swap = " + x);
    }
}

/*
*Numbers -- Swap Numbers
Swap two variable' values without using a third variable
*
* */
