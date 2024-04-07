package homework;

import java.nio.charset.StandardCharsets;

public class HomeWork {
    public static void main(String[] args) {

        //HomeWork

        //1.Easy peasy: Write a Java program that checks if a given number is positive. If it is, print "Positive number."
        int num = 1;
                if (num>0) {
                    System.out.println("Positive number.");
                }

        //2.Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."
        int even = 2;
                if (even %2 == 0){
                    System.out.println("Even number");
                } else {
                    System.out.println("Not even");
                }

        //3.Age group classifier: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."
        int age = 17;
                if (age < 18){
                    System.out.println("Teenager");
                } else {
                    System.out.println("Adult");
                }

        //4.Leap year checker: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."
        int year = 2024;
                if (year %4 == 0 && year %100 != 0 || year %400 == 0)
        { System.out.println("Leap Year");}
        else {
            System.out.println("Not a Leap year");}


        //5.Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."
        int number = 22;
                if (number >0 && number %2 ==0  && number <100){
                    System.out.println("Valid number");
                } else {
                    System.out.println("Invalid number");
                }

        //6.Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."
        int numberPosEven = 8;
                if (numberPosEven >0 && numberPosEven %2 ==0){
                    System.out.println("Positive and Even");
                }


        //7.Character type identifier: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)
        char vowel = 'i';
                if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
                {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Not vowel");
                }

        //8.BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height);
        double weight = 90.7;
         double height = 188.8;
         double bmi = weight/ (height*height);
         if (bmi <18.5) {
             System.out.println("Underweight");
         } else if (bmi >= 18.5 && bmi <25) {
             System.out.println("Healthy weight");
         } else if (bmi >= 25 && bmi <30) {
             System.out.println("Overweight");
         } else {
             System.out.println("Obesity");
         }


        /*9.Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average. Assign a final grade based on the following criteria:
        If the average score is 90 or above, assign a grade of "A."
        If the average score is between 80 and 89, assign a grade of "B."
        If the average score is between 70 and 79, assign a grade of "C."
        If the average score is between 60 and 69, assign a grade of "D."
        If the average score is below 60, assign a grade of "F."
        */
        int mathGrade = 77;
        int science = 80;
        int english = 65;
        int summ = (mathGrade + science + english)/3;
        if (summ >=90 ){
            System.out.println("Grade = A");
        } else if (summ >=80 && summ <= 89 ) {
            System.out.println("Grade = B");
        } else if (summ >= 70 && summ <= 79) {
            System.out.println("Grade = C");
        } else if (summ >=60 && summ <= 69) {
            System.out.println("Grade = B");
        } else {
            System.out.println("Grade = F");
        }


        //10.File extension checker: Write a Java program that takes a filename as input and checks if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf". If the file has a valid extension, print "Valid file extension," otherwise print "Invalid file extension."
     String txt = "file.txt";
        System.out.println(txt.endsWith(txt));
        String doc ="file.doc";
        System.out.println(doc.endsWith(doc));
        String pdf = "file.pdf";
        System.out.println(pdf.endsWith(pdf));
        if (true) {
            System.out.println("Valid File extension");
        } else {
            System.out.println("Invalid File extension");
        }

    }

}
