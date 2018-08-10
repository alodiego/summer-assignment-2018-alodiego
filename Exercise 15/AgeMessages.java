import java.util.Scanner;

public class AgeMessages {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age;

        System.out.print( "How old are you? " );

        age = keyboard.nextInt();

        System.out.println( " You are: " );

        if (age < 13 ) {
            System.out.println( "\ttoo young to create a Facebook account" );
        }

        if (age >= 13 ) {
            System.out.println( "\told enough to create a Facebook account" );
        }

        if (age < 16 ) {
            System.out.println( "\ttoo young to get a driver's license" );
        }

        if (age >= 16 ) {
            System.out.println( "\told enough to get a driver's license" );
        }

        if (age < 18 ) {
            System.out.println( "\ttoo young to get a tattoo" );
        }

        if (age >= 18 ) {
            System.out.println( "\told enough to get a tattoo" );
        }

        if ( age < 21 ) {
            System.out.println( "\ttoo young to drink alcohol" );
        }

        if ( age >= 21 ) {
            System.out.println( "\told enough to drink alcohol" );
        }

        if ( age < 35 ) {
            System.out.println( "\ttoo young to run for President of the U.S." );
            System.out.println( "\t\t(How sad!)" );
        }

        if ( age >= 35 ) {
            System.out.println( "\told enough to run for President of the U.S." );
            System.out.println( "\t\t(That's great!)" );
        }

        if ( age < 65 ) {
            System.out.println( "\tYou are too young to retire." );
        }

        if ( age >= 65 ) {
            System.out.println( "\tYou are old enough to retire!" );
        }

        // If you type in an age greater than 35, that age would surpass all of the, "if", statements. Leaving only, "You are: ", printed onto the terminal.
        
    }
}

The Powershell Output(s)

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 15> javac .\AgeMessages.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 15> java AgeMessages
How old are you? 17
 You are:
        old enough to create a Facebook account
        old enough to get a driver's license
        too young to get a tattoo
        too young to drink alcohol
        too young to run for President of the U.S.
                (How sad!)
        You are too young to retire.
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 15> java AgeMessages
How old are you? 65
 You are:
        old enough to create a Facebook account
        old enough to get a driver's license
        old enough to get a tattoo
        old enough to drink alcohol
        old enough to run for President of the U.S.
                (That's great!)
        You are old enough to retire!
