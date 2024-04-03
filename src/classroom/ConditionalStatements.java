package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        //'IF' statement
        if (true) {
            System.out.println("This code is executed");
        }
        int x = 10;
        if (x>5){
            System.out.println("x is greater than 5");
        }
        if (x>12){
            System.out.println("x is greater than 12");
        }
        boolean isSpring = false;
        if (!isSpring){
            System.out.println("It is spring");
        }
        //Will not be exec, because isSpring is false'
        //Comparison >, <, ==, >=, <=, !=

        //if-else

        //Child <= 12 age;
        //Teenager => 13 & <=19;
        //Adult => 20 & <= 59;
        //Else = senior;

        int age = 25;
        if (age<=12){
            System.out.println("This is a child");
        } else {
            System.out.println("Something else");
        }

        //If-else-if-else
        if (age<=12){
            System.out.println("This is a child");
        } else if (age>=13 && age <=19) {
            System.out.println("This is a teenager");
        } else if (age >=20 && age <= 59) {
            System.out.println("This is an adult");
        } else {
            System.out.println("This is senior");
        }

        //Write a Java that checks if a given number is positive, negative or zero
        //Define int = 10
        //Create logic
        //For each cond printout message

        int number = 10;
        if (number > 0){
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else if (number == 0) {
            System.out.println("This number = 0");
        }

        //Write a Java programme that determine the time of the day based on given hour
        //If the hour is between 0 and 11 , Good Morning
        //If 12 and 17, Good Afternoon
        //If 17 - 23 , Good Evening
        //Else, inalid number

        int hour = 7;
        if (hour >= 0 && hour <=11) {
            System.out.println("Good Morning");
        } else if (hour >=12 && hour <= 17) {
            System.out.println("Good afternoon");
        } else if (hour >= 18 && hour <=23) {
            System.out.println("Good evening");
        } else {
            System.out.println("Invalid number");
        }
    }
}
