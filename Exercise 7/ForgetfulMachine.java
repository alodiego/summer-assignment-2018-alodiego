import java.util.Scanner;

public class ForgetfulMachine {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What city is the capital of France?" );
        keyboard.next();

        System.out.println( "What is 6 multiplied by 7?" );
        keyboard.nextInt();

        System.out.println( "Enter a number between 0.0 and 1.0." );
        keyboard.nextDouble();

        System.out.println( "Is there anything else you would like to say?" );
        keyboard.next();

    }
}

The Powershell Output 

PS C:\Users\tatom\src\com\company> javac .\ForgetfulMachine.java
PS C:\Users\tatom\src\com\company> java ForgetfulMachine
What city is the capital of France?
Paris
What is 6 multiplied by 7?
42
Enter a number between 0.0 and 1.0.
0.5
Is there anything else you would like to say?
Just in case, we don't have to do the Study Drills right?
