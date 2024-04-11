package classroom;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44, 20));

        //Print "Hello,World!"

        printTextMultipleTimes("Hello World!", 10);

        String[] fruits = {"Banana", "Apple", "Watermelon"};
        printAllValuesFromStringArray(fruits);

        System.out.println(isEven(5));

        int[] intArray = {2, 4, 6, 8, 10};
        System.out.println(numberSumm(intArray));


    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);

        }
    }

    //Create method that received arrays
    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public static boolean isEven(int number) {
        boolean result = number % 2 == 0;
        return result;
    }

    //Create method that accepts array of numbers then returns summ of numbers

    public static int numberSumm(int[] intArray) {
        int summa = 0;
        for (int i = 0; i < intArray.length; i++) {
            summa = summa + intArray[i];
        }
        return summa;
    }
}
