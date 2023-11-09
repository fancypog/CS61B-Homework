public class HW0 {

    // Methods
    // Q1
    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }

    public static void method3() {
        method1();
        method2();
        System.out.println("I am method 3.");
    }

    public static void method1() {
        System.out.println("I am method 1.");
    }

    // Q4
    public static void printIndexed(String input) {
        StringBuilder indexedString = new StringBuilder();
        int revIndex = input.length() -1;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            indexedString.append(character).append(revIndex);
            revIndex --;
        }

        String result = indexedString.toString();
        System.out.println(result);
    }

    // Q5
    public static void ifElseMystery1(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    }


    public static void main(String[] args) {

        System.out.println("Question 1");
        // Q1: Print (calling another method in one method)
        method1();
        method3();
        method2();
        method3();

        System.out.println();
        System.out.println("Question 2");
        // Q2: Print asterisks (nested for loop)
        String s = "*";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(s);
                s += "*";
            }
        }

        System.out.println();
        System.out.println("Question 3");
        // Q3: Print numbers (for loops)
        int total = 25;
        for (int number = 1; number <= (total / 2); number++) {
            total = total - number;
            System.out.println(total + " " + number);
        }

        System.out.println();
        System.out.println("Question 4");
        // Q4: PrintIndexed (write functions)
        printIndexed("ZELDA");

        System.out.println();
        System.out.println("Question 5");
        // Q5: ifElseMystery1 (write functions)
        ifElseMystery1(3, 20);
        ifElseMystery1(4, 5);
        ifElseMystery1(5, 5);
        ifElseMystery1(6, 10);

        System.out.println();
        System.out.println("Question 6");
        // Q6: Quadrant (write functions)



    }
}