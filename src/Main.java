import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String args[]) {
        //here is a list of methods for each task from a homework
        numeric_and_for();

        for_and_multiplying();

        simple_while_cycle();

        simple_do_while_cycle();

        two_dimensional_array();

        more_complex_homework1();

        more_complex_homework2();

    }

    static void numeric_and_for() {
        /* here I will use "for" cycle for filling the int massive
         * of integers with data and printing them out, also with the "for"
         * also, a "scanner" class will be used to define length of the massive
         */
        Scanner in = new Scanner(System.in);
        //Here I've defined the "in" scanner and
        int abc = in.nextInt();
        int[] array1 = new int[abc];

        //here the "for" cycle is used for filling the one-dimensional massive with data;
        for (int j = 0; j < abc; j++) {
            array1[j] = 12 + 20 + j;
            //here the "For" cycle is used for printing out the data of the massive;

        }
        for (int i = 0; i < abc; i++) {
            System.out.println(array1[i]);
        }
    }


    static void for_and_multiplying() {
        //here the "for" cycles should be used for printing the backward multiplying table

        for (int i = 11; i > 0; i--) {
            for (int j = 11; j > 0; j--) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
            System.out.println();
        }


    }

    static void simple_while_cycle() {
        //here I will bring an example of the usage of the "While" cycle.
        //First of all, a massive of String values. I've decided to use some text old-school smileys.
        String[] smileys = new String[]{
                "=-)", "=-(", "=-0", "=-P", "=-3", "@_@",
                "B-)", "B-(", ">=-(", "B-P", ":-)", ";-)", "=-/",
                "^_^", "*_*", "T_T", "X-(", "O_O", "=-D", "Q_Q", "8-)"};
        int i = 0;

        // Here I will use a "While" cycle.
        while (i <= 20) {
            System.out.println(smileys[i]);
            i++;
        }
    }


    static void simple_do_while_cycle() {
        //here I will bring an example of the simple do-while cycle

        int[] integer_massive = {4, 5, 7, 3, 8, 21, 32, 56, 78};
        String[] string_massive = {" elephants", " rabbits", " ferrets", " ninjas", " clowns",
                " magicians", " robots", " fishes", " cosmonauts"};
        int j = 8;
        do {
            System.out.println("Something beautiful comes this way!");
            System.out.println("It's a group of " + integer_massive[j] + string_massive[j] + ".");
            j--;

        } while (j < 8 && j > 0);


    }

    static void two_dimensional_array() {
        //here I will work with 2-dimensional array of integers and inner cycles
        int a = 2345;
        int ert = 12;
        int some_array2[][] = new int[45][45];


        for (int i = 0; i < some_array2.length; i++) {
            for (int j = 0; j < some_array2.length; j++) {
                some_array2[i][j] = ert / 12 + a * j;
            }
        }
        for (int i = 0; i < some_array2.length; i++) {
            for (int j = 0; j < some_array2.length; j++) {
                System.out.println(some_array2[i][j]);
            }
            System.out.println();
        }
    }
}



















/*
* public static void main(String[] args) {
*        Press Alt+Enter with your caret at the highlighted text to see how
*       / IntelliJ IDEA suggests fixing it.
*       System.out.printf("Hello and welcome!");
*
*       Press Shift+F10 or click the green arrow button in the gutter to run the code.
*       for (int i = 1; i <= 5; i++) {
*           Press Shift+F9 to start debugging your code. We have set one breakpoint
*
*          for you, but you can always add more by pressing Ctrl+F8. *           System.out.println("i = " + i);
*       }
*   }
* }
**/

