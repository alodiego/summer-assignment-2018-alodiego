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

        // The 2nd questions blows up when I type a deciaml number.

        // The 3rd question blows up when I type a letter because it only allows for numeric values
        // and it blows up when I type a value that exceeds the range of value a "double"
        // variable can handle because it cannot compute an input that is smaller or larger
        // than its given limits.

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 7> java ForgetfulMachine
What city is the capital of France?
Paris
What is 6 multiplied by 7?
42
Enter a number between 0.0 and 1.0.
0.5
Is there anything else you would like to say?
Coding is cool, but it's one real pain in the heiny.
