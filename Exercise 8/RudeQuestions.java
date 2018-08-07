import java.util.Scanner;

public class RudeQuestions {

    public static void main(String[] args) {

        String name, pet;

        int age;

        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );

        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? " );

        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh? That's not very old." );

        System.out.print( "How much do you weigh, " + name + "? ");

        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );

        System.out.print( "What's your income, " + name + "? " );

        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour");

        System.out.println( " and not per year!" );

        System.out.print( "Lastly, what is your pet's name? ");

        pet = keyboard.next();

        System.out.println( pet + "? That's actually a pretty cool name. And I bet " + pet + " has a great owner." );

        System.out.print( "Well, thanks for answering my rude questions, ");

        System.out.println( name + "." );

    }
}

        // 1.   The program does blow up when I enter an integer value when is is expecting me
        //      to type a double because doubles are of larger value than integers, so the input
        //      would not be able to compile due to that error.

        // 2.   The program does not blow up if I enter a numeric value (integer or double) when it is
        //      expecting a String because whatever is inputed, it will automatically be converted into
        //      characters, and therefore, it is able to be run by the compiler as a String.

        // 3.   Integer inputs blow up when typing any value that is not a whole number.
        //      Doubles inputs blow up when you type values lower or higher than its set range.
        //      String inputs blow up when you involve spaces.