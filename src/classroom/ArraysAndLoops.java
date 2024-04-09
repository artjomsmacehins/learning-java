package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        //Array
        // Bread; Milk; Eggs;Fruits

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Winter", "Summer", "Spring", "Autumn"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        System.out.println(Arrays.toString(grades));

        //Create empty array;

        int[] emptyArray = new int[4];
        //[0], [0], [0], [0].

        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;

        System.out.println(Arrays.toString(emptyArray));

        //Create Array with names:
        //Name count :5
        String[] names = {"Artjoms", "Arturs", "Danik", "Nikita", "Alex"};
        System.out.println(Arrays.toString(names));

        //Create Empty double array with size of 5;
        //Print empty array
        //Update each array value from 0 to any number;

        double[] num = new double[5];
        System.out.println(Arrays.toString(num));
        num[0] = 1.1;
        num[1] = 2.2;
        num[2] = 3.3;
        num[3] = 4.4;
        num[4] = 5.5;
        System.out.println(Arrays.toString(num));

        //Print numbers 0 - 10l
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // Calculate sum from 1 to 100;
        //Example = 1 + 2 + 3...n
        int summ = 0;
        for (int i = 1; i <= 100; i++) {
            summ = summ + i;
        }
        System.out.println("Sum:" + summ);

        //for ->
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }
        for (String s : shoppingList) {
            System.out.println(s);
        }

        // Print numbers from 10 to 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter--;
        }

        //Print even numbers from 2 to 100;
        //Print in one line

        for (int i = 0; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 2; i <=100; i = i+2){
            if (i %2<=0);
            System.out.print(i + " ");
        }

    }
}
