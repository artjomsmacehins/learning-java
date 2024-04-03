package classroom;

public class LearnString {
    public static void main(String[] args) {

        //String
        String name = "Artjoms";
        String lastName ="Macehins";

        System.out.println(name);
        System.out.println(lastName);

        //Exercise: Print Name + Last Name
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        //Same Example
        System.out.println(name + " " + lastName);

        //String format
        System.out.println(String.format("%s %s", name,lastName));

        //Hello, world!
        String hello = "Hello,";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        //Exercise
        //Step 1 : Declare a string variable with your name;
        //Step 2 : Declare a string variable with your favourite programming language
        //Step 3 : Concatenate the two strings to form a message 'My name is {Name}, i love coding in {Language}
        //Step 4 : Print it out

        String name1 = "Artjoms";
        String progLanguage ="Java";
        System.out.println(String.format("My name is %s, i love coding in %s",name1,progLanguage));

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());
    }
}
